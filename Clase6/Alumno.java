package ClasesJava.Clase6;

public class Alumno {
    //La siguiente clase tiene un par de errores
    //Tienes que corregirlos para poder
    //Resolver los ejercicios

    //Además de hacer que funcione, tienes que
    //Poner en práctica los principios de encapsulamiento

    char edad;
    String nombre;
    int asistencias;

    private Alumno (String nombre, int edad){
        nombre = nombre;
        this.edad = edad;
        asistencias = 0;
    }

    public int getAsistencias() {
        return asistencias;
    }
    //Si quieren hacerlo en menos líneas, pueden:
    //Esto no tiene ningún error :)
    public int getEdad() {return edad;}

    //Falta el get del nombre
    
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public void incrementarAsistencias() {
        this.asistencias++;
    }

    private void show(){
        System.out.println("Hola!, soy " + nombre + " tengo " + 
                           edad + " años, y " + asistencias + " asistencias.");
    }
}