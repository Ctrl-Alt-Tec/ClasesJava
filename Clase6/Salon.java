package ClasesJava.Clase6;

public class Salon {
    //Debes construir esta clase
    //y completar los métodos existentes

    //De de tener los siguientes atributos:
        // Nombre del profesor
        // Salón

    Alumno alumnosDeLaClase [] = {
        new Alumno("Juanito", 10),
        new Alumno("Pedrito", 11),
        new Alumno("Anita", 10),
        new Alumno("Maria", 9),
        new Alumno("Danielita", 10),
        new Alumno("Camilita", 11),
        new Alumno("Betito", 9),
        new Alumno("Marianito", 9)};
    
    /**
     * Método que te indica si un alumno está
     * registrado o no. 
     * @param nombreAlumno
     * @return true si está, false si no
     */
    public boolean estaRegistrado(String nombreAlumno){

        /**Tu código 
         * Tip, utiliza el array de alumnosDeLaClase
        */        
        return true;
    }
    /**
     * Dado un array de alumnos, 
     * te dice CUÁNTOS alumnos faltaron.
     * Incrementa en uno las asistencias 
     * de los alumnos.
     * @param asistencias
     * @return número de faltantes
     */
    public int alumnosFaltantes(Alumno[] asistencias){
        int faltantes = 0;
        /**Tu código */
        return faltantes;
    }

    public void mostrarSalon(){
        System.out.println("La clase del profesor: ");
        System.out.println("Está en el salón: ");
        System.out.println("Sus alumnos son: ");
        for (Alumno integrante: alumnosDeLaClase){
            System.out.print("\t");
            integrante.show();
        }
        System.out.println("--------------");
    }


}