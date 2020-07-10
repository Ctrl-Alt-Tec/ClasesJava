
package funciones_int;
import java.util.*;

public class Funciones_int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner teclado= new Scanner(System.in);
        saludo("hola");
        System.out.println("Imprime un número");
        cubo(teclado.nextFloat());
        cubo (14.2f);
        //mando llamar y le doy un valor a su parámetro
        */
        System.out.println("Argumento 1 " + args[0]);
        System.out.println("Argumento 2 " + args[1]);
        System.out.println("Argumento 3 " + args[2]);
        System.out.println("Argumento 4 " + args[3]);
    }
    static void cubo(float x){
        System.out.println("El valor de tu cubo es " + x*x*x);
    }
    static void saludo(String texto){
        System.out.println(texto);
    }
}
