/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_num;
import java.util.*;
/**
 *
 * @author jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int numeros[]= new int[10];
        int b=1, positivo=0, negativo=0 ;
        float promedio= 0;
        int mayor=0;
        int menor=0;
        
        System.out.println("Ingresa 10 numeros:");
        
        for(int i=0; i<10; i++){
            System.out.println("Dame el valor "+ b++);//UI
            numeros[i]= teclado.nextInt();//Llena el espacio
            
            
            promedio = promedio + numeros[i];//Suma promedio
            
            
            if(numeros[i]>0){//Cont positivo
                positivo++;
            }
            if(numeros[i]<0){//Cont negativo
                negativo++;
            }
            
            
            if(numeros[i]>mayor){ //Modifico mayor
                mayor=numeros[i];
            }
            if(i==0){ //Declaro el valor inical de menor, sólo en al iniciar
                menor= numeros[i];
            }
            if(numeros[i]<menor){ //Modifico menor
                menor=numeros[i];
            }
            
        }
        
        promedio= promedio/10;//promedio
        System.out.println("Tu promedio es: "+ promedio);
        
        System.out.println("Tu maximo es: "+ mayor);
        
        System.out.println("Tu minimo es: "+ menor);
        
        System.out.println("Tienes " + positivo +" numeros positivos");
        
        System.out.println("Tienes " + negativo +" numeros negativos");
    }
    
}
