package ClasesJava.Clase4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // System.out.println ("Esbribe el mensaje");
        // String dictadoTexto=teclado.next();

        // Santi pluma = new Santi ("Bic", true, true);
        // pluma.escribir(dictadoTexto);


        //----RAFA
        // System.out.println("Gorrros en el mundo: es cero") ;

        // Hat hat1 = new Hat(5, "round", "blue");
        // System.out.println("Gorrros en el mundo: " + hat1.getHatsInTheWorld());
        // Hat hat2 = new Hat(10, "round", "red");   
        // System.out.println("Gorrros en el mundo: " + hat1.getHatsInTheWorld());
        // hat1.wearHat();

        // hat2.throwHat();

        // hat1.makeSize(10);

        //--- Sofi
        // Cereal cereal = new Cereal("Nestle", "azul", 20);
        // cereal.escogerCereal();

        //Nuestro array está vacio
        String [] arrayDeStrings = new String [10];
        String [] arrayDeStrings2 = {"HOla", "adios"};

        System.out.println("El primer lugar es: " + arrayDeStrings2[0]);

        arrayDeStrings[0] = "Ctrl Alt Tec";
        arrayDeStrings[1] = "Hola mundo";

        //For
        for (int i = 0/*indice*/; i < arrayDeStrings.length; i++ ){
            System.out.println("Dame el valor: " + i); 
            arrayDeStrings[i] = teclado.next(); 
        }

        for (int i = 0/*indice*/; i < arrayDeStrings.length; i++ ){
            System.out.println("El valor " + (i+1) + " es " + arrayDeStrings[i]); 
        }

    }
    
}