package ClasesJava.Clase6.Solucion;

public class notMain {
    /**Problema 1 
     * Ve a la clase Alumno y corríegela
    */
    /**Problema 2
     * Ve a la clase salón y complétala.
     * Una vez que esté completa, termina
     * los métodos de estaRegistrado y 
     * alumnosFaltantes. 
     */
    public static void main(String[] args) {
        /**Problema 1 */
        //Primero verifica que ya funcione la clase Alumno
        //Esto hazlo al construir un alumno y llamar
        //a su método de presentar
        Alumno alumno = new Alumno("Jorge", 19);
        alumno.show();

        /**Problema 2 */
        //Array para problema 2
        
        Alumno asistentes_de_hoy [] = { //Notese que lo escribí de manera diferente, usen el que más les guste :)
            new Alumno("Juanito", 10),
            new Alumno("Pedrito", 11),
            new Alumno("Anita", 10),
            new Alumno("Maria", 9)};
        
        //Primero crea una clase Salón.
        //Verifica que esté funcionando con el método de mostrarSalon
        Salon salon = new Salon ("Jorge", 502);
        salon.mostrarSalon();

        int faltantes = salon.alumnosFaltantes(asistentes_de_hoy);
        
        System.out.println("El día de hoy faltaron: " + faltantes + " personas.");
        
        salon.mostrarSalon();
        

    }

    //Más en snake_case
    //https://medium.com/better-programming/string-case-styles-camel-pascal-snake-and-kebab-case-981407998841
}