package empleadomain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empleadomain {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        String opcion;
        String opcion2;
        boolean continuar = true;
        boolean bucles = true;
        String nombre = "";
        int produccion = 0;
        
        
        empleadofunciones Empleado = new empleadofunciones();
        
            System.out.println("|-------------------------------------------------------|\n"
                             + "|                                                       |\n"
                             + "|      Bienvenidos al sistema de registro de obreros    |\n"
                             + "|                                                       |\n"
                             + "|-------------------------------------------------------|\n");
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            
            
              while (continuar != false){
                System.out.println("Ingrese la opcion correspondiente a la operacion "
                        + "que desea realizar\nA.- Asignar nombre de empleado.\n"
                        + "B.- Asignar produccion de empleado.\nC.- Calcular "
                        + "sueldo de empleado.\nD.- Mostrar nombre de empleado.\n"
                        + "E.- Mostrar produccion de empleado.\nF.- Mostrar sueldo "
                        + "de empleado.\nX.- Salir.");
                opcion = br.readLine();
                
                switch(opcion.toLowerCase()){
                    case ("a"):
                        System.out.println("Ingrese el nombre del obrero");
                        nombre = br.readLine();
                        Empleado.obtenerNombre(nombre);
                        break;
                    
                    case ("b"):
                        System.out.println("Ingrese la cantidad de produccion del obrero");
                        produccion = Integer.parseInt(br.readLine());
                        Empleado.obtenerProduccion(produccion);
                        break;
                    
                    case ("c"):
                        Empleado.obtenerSueldo();
                        break;
                    
                    case ("d"):
                        //Se valida que se registro el nombre del empleado.
                        if((Empleado.nombre != null)&(Empleado.nombre != "")){
                            Empleado.mosNombre();
                        }
                        else{
                            System.out.println("No se a registrado un nombre. "
                                    + "Registrelo para luego visualizarlo?(S/N)");
                            opcion2 = br.readLine();
                            
                            switch (opcion2.toLowerCase()){
                                case("n"):
                                    break;
                                default:
                                    
                                    /*
                                     * Aqui esta el problema, si lo dejas vacio
                                     * no se queda dentro del bucle hasta que lo 
                                     * cambies si no que se sale.
                                     * la idea es que no muestre un dato null o ""
                                     *
                                     */
                                    
                                    while(Empleado.nombre == ""){
                                        System.out.println("Ingrese el nombre del obrero");
                                        nombre = br.readLine();                                
                                        Empleado.obtenerNombre(nombre);
                                    }
                            }
                            Empleado.mosNombre();
                        }
                        break;
                        
                    case ("e"):
                        //Se valida que se registro la produccion del empleado.
                        if(Empleado.produccion < 1){
                            System.out.println("Quiza olvido introducir la "
                                    + "produccion del empleado\n\nDesea "
                                    + "registrar la produccion ahora?(S/N)");
                            opcion2 = br.readLine();
                            
                            switch(opcion2.toLowerCase()){
                                case ("n"):
                                    break;
                                    
                                default:
                                    System.out.println("Ingrese la cantidad de produccion del obrero");
                                    while(bucles == true){
                                        try{
                                            produccion = Integer.parseInt(br.readLine());
                                            bucles = false;
                                        }
                                        catch(Exception e){
                                            System.err.println("Se esperaba un "
                                                    + "numero entreo y usted "
                                                    + "introdujo: " + e.getMessage() 
                                                    + ".Por favor vuelva a ingresar"
                                                    + " la produccion del obrero");
                                        }
                                    }
                                    bucles = true;
                                    Empleado.obtenerProduccion(produccion);
                            }
                        }
                        Empleado.mosProduccion();
                        break;
                    
                    case ("f"):
                        //Se valida tanto que se registro la produccion del empleado como si se calculo el sueldo.
                        if((Empleado.produccion < 1)||(Empleado.sueldo < 1)){
                            System.out.println("Quiza olvido introducir la "
                                    + "produccion del empleado o calcular el "
                                    + "sueldo del empleado.\n\nDesea "
                                    + "registrar la produccion y calcular el "
                                    + "sueldo ahora?(S/N)");
                            opcion2 = br.readLine();
                            switch(opcion2.toLowerCase()){
                                case ("n"):
                                    break;
                                    
                                default:
                                    while(bucles == true){
                                        System.out.println("Ingrese la cantidad de produccion del obrero");
                                        try{
                                        produccion = Integer.parseInt(br.readLine());
                                        bucles = false;
                                        }
                                        catch(Exception e){
                                            System.err.println("Se esperaba un "
                                                    + "numero entreo y usted "
                                                    + "introdujo: " + e.getMessage() 
                                                    + ".Por favor vuelva a ingresar"
                                                    + " la produccion del obrero");
                                        }
                                    }
                                    bucles = true;
                                    Empleado.obtenerProduccion(produccion);
                                    Empleado.obtenerSueldo();
                                    
                            }
                    }
                        Empleado.mosSueldo();
                        break;
                        
                    case ("x"):
                        //Se sale del programa.
                        continuar = false;
                        break;
                        
                    default:
                        System.out.println("Ested introdujo una opcion invalida, porfavor introduzca la opcion correcta.");
                        break;
                }
            }
    }
    
}