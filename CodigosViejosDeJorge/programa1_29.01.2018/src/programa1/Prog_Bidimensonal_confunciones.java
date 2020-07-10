package programa1;
import java.util.*;

public class Prog_Bidimensonal_confunciones {
    static String[] nombres = new String [5];
    static double[][] calificaciones = new double [5][0];
    static int i= 0;
    public static void main (String args[]){ //main
        System.out.println("Bienvenido");
        double suma= 0;
        for(i=0; i<5;i++){
            int b= i+1;
            System.out.println("Ingresa nombre " + b);
            nombres();
            System.out.println("Ingresa calificacion " + b);
            calif();
            suma= suma+ calificaciones[i][0];    
        }
        suma= suma/5;
        resultado();
        
        System.out.println("\n Tu promedio es " + suma);
    }
    public static String nombres(){
        return nombres[i] =nombre(); 
    } //Asigna palabras al array
    public static double calif(){
        return calificaciones[i][0]= calificaciones();
    } //Asigna numeros al array
    public static String nombre(){
        Scanner teclado = new Scanner(System.in);
        String nombre= teclado.next();
        return nombre;
    } //Lee nombre
    public static double calificaciones(){
        Scanner teclado = new Scanner(System.in);
        int calif= teclado.nextInt();
        return calif;
    }//Lee calificaciones
    public static void resultado(){
        for(i=0; i<5;i++){
            System.out.println(nombres[i]+ " tiene "+ calificaciones[i][0]);
        }
    }// imprime los arrays
}
