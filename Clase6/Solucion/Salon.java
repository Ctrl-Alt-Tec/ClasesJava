package ClasesJava.Clase6.Solucion;

public class Salon {
    //Debes construir esta clase
    //y completar los métodos existentes

    //De de tener los siguientes atributos:
        // Nombre del profesor
        // Salón
    private int salon; 
    private String profesor;

    Alumno alumnosDeLaClase [] = {
        new Alumno("Juanito", 10),
        new Alumno("Pedrito", 11),
        new Alumno("Anita", 10),
        new Alumno("Maria", 9),
        new Alumno("Danielita", 10),
        new Alumno("Camilita", 11),
        new Alumno("Betito", 9),
        new Alumno("Marianito", 9)};
    
        //Constructor
    public Salon (String profesor, int salon){
        this.salon = salon;
        this.profesor = profesor;
    }
    //Getters
    public String getProfesor() {
        return profesor;
    }
    public int getSalon() {
        return salon;
    }
    //Setters
    public void setSalon(int salon) {
        this.salon = salon;
    }

    /**
     * Método que te indica si un alumno está
     * registrado o no. 
     * @param nombreAlumno
     * @return true si está, false si no
     */
    public boolean estaRegistrado(String nombreAlumno){

        for (Alumno estudiante : alumnosDeLaClase){
            if (estudiante.getNombre().equals(nombreAlumno)){
                return true;
            }
        }        
        return false;
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
        int asistentesDeLaClase = 0;
        for (Alumno asistente : asistencias) {
            for (Alumno alumno : alumnosDeLaClase) {
                if (asistente.getNombre().equals(alumno.getNombre())
                        &&
                        asistente.getEdad() == alumno.getEdad()){
                    //Incrmementamos asistencias
                    alumno.incrementarAsistencias();
                    asistentesDeLaClase++;
                }
            }
        }
        return alumnosDeLaClase.length - asistentesDeLaClase;
    }

    public void mostrarSalon(){
        System.out.println("La clase del profesor: " + profesor);
        System.out.println("Está en el salón: " + salon);
        System.out.println("Sus alumnos son: ");
        for (Alumno integrante: alumnosDeLaClase){
            System.out.print("\t");
            integrante.show();
        }
        System.out.println("--------------");
    }


}