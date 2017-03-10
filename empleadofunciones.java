package empleadomain;


public class empleadofunciones {
    private int Produccion;
    private int Sueldo;
    private String NomObr;
    public int produccion;
    public int sueldo;
    public String nombre;
    
    void empleadofunciones(){
        Produccion = 0;
        Sueldo = 0;
        NomObr = "";
    }
    void obtenerNombre(String nombre){
        NomObr = nombre;
        this.nombre = nombre;
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    void obtenerProduccion(int produccion){
        Produccion = produccion;
        this.produccion = produccion;
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    int obtenerSueldo(){
        if (Produccion <= 500) {
            Sueldo = Produccion * 20;
        }
        else{
            if (Produccion > 500 && Produccion < 800){
                Sueldo = Produccion * 25;
            }
            else {
                Sueldo = Produccion * 30;
            }
        }
        sueldo = Sueldo;
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        return sueldo;
        
    }
    
    void mosNombre(){
        System.out.println("El nombre del obrero es: " + NomObr);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    void mosProduccion(){
        System.out.println("La produccion del obrero "+ NomObr+ " es: " + Produccion);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    void mosSueldo(){
        System.out.println("El sueldo del obrero " + NomObr + " es: " + Sueldo);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
   
}