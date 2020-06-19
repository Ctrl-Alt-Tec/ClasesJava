package ClasesJava.Clase2;

import java.util.Scanner;

public class Clase2Continuacion {
    public static void main(String[] args) {
        int base;
        int altura;
        int ancho;
        int num; 

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la base: ");
        base = teclado.nextInt();

        System.out.println("Dame el ancho: ");
        ancho = teclado.nextInt();

        System.out.println("Dame la altura: ");
        altura = teclado.nextInt();
        
        System.out.println("Dame el factorial: ");
        num = teclado.nextInt();
        //calcularAreaRectangulo(base, altura);
        
        System.out.println("El area de tu rectangulo es: " + calcularAreaRectangulo(base, altura));
        System.out.println("El volumen de tu rectangulo es: " + calcularVolumenRectangulo(base, altura, ancho));

        System.out.println("Factorial de: " +  num + "= " + factorial(num));
        
        //Cerramos el scanner para que no marque sugerencia
        //Esto no lo sabía :)
        teclado.close();
        
    }

    static double calcularAreaRectangulo (double base, double altura){
        double area = base *altura;
        // System.out.println("El area de tu rectangulo es: " + area);
        return area;
        /**Cualquiera de las dos funciona */
        // return 2*base + 2*altura;
    }
    static double calcularVolumenRectangulo (double base, double altura, double ancho){
        
        return ancho * calcularAreaRectangulo(base, altura);
        /**Cualquiera de las dos funciona */
        // return 2*base + 2*altura;
    }

    //Función recursiva!!
    static int factorial(int numero){
        //Exit case:
        if (numero == 1){
            return 1;
        }

        return numero*factorial(numero-1);

    }
    
}