package ClasesJava.Clase3;

public class Perrito {
    
    //Atributos
    String nombre;
    int numeroDePatas;
    boolean isFemini;
    static int perritosEnElMundo; //Es compartida por todos los objetos de la clase

    //Métodos
        //Constructor -> Para que la clase se vuelva un objeto
        //El constructor NO regresa un dato
    public Perrito (String nombre, int numeroDePatas, boolean isFemini){
        //Inicializar atributos
        this.nombre /*Nombre del perrito*/ = nombre /*Nombre de los parámetros*/;
        this.numeroDePatas = numeroDePatas;
        this.isFemini = isFemini;
    }

    public void darAmor(){
        System.out.println("El perrito llamado: " + nombre);
        System.out.println("       ******       ******");
        System.out.println("     **********   **********");
        System.out.println("   ************* *************");
        System.out.println("  *****************************");
        System.out.println("  *****************************");
        System.out.println("  *****************************");
        System.out.println("   ***************************");
        System.out.println("     ***********************");
        System.out.println("       *******************");
        System.out.println("         ***************");
        System.out.println("           ***********");
        System.out.println("             *******");
        System.out.println("               ***");
        System.out.println("                *");
    }

    //Si queremos modificar el valor de un atributo
    //Se hacen setters y getters
        //Set -> Establecer, void
        //Get -> Recibir, 
    private void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public void cambiarNombre(String name){
        setNombre(name);
    }


    public String getNombre(/*Nada */){
        return nombre;
    }

}