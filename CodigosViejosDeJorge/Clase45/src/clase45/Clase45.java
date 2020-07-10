/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase45;
import java.util.*;
/**
 *
 * @author jorge
 */
public class Clase45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\"Hola mundo\" * ");
        System.out.println("\t Hola mundo");
        Scanner teclado= new Scanner(System.in);
        System.out.println("Piramide");
        System.out.println("Ingresa el numero de filas");
        int f=teclado.nextInt();
        int c,d;
        
        for(c=0; c<f; c++){
            for (d=-1;d<c;d+=1){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
