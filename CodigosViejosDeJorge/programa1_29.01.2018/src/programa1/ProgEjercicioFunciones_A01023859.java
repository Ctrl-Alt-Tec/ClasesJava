

import programa1.classMD5;
import java.util.*;
import javax.swing.*;


public class ProgEjercicioFunciones_A01023859 {
    public static void main (String[] args){
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Bienvenido");
        menu();
        boolean opc= true;
        
        while (opc==true){
            int i= teclado.nextInt();
            
            switch (i){
                case 1: 
                    Lockers();
                    menu();
                    break;
                case 2:
                    encriptar();
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    opc= false;
                    break;
                default:
                    System.out.println("Solo se puede de 1-4");
                    break;
            }
            
            
        }
        JOptionPane.showInputDialog("El prograa se acabó");
         System.out.println("El prograa se acabó");  
                
    }
    
    public static void menu(){
        System.out.println("Estas son las opciones:");
        System.out.println("1. Lockers");
        System.out.println("2. MD5");
        System.out.println("3. Ver menu");
        System.out.println("4. Salir");
        System.out.println("5. Suma de dos numeros");
        System.out.println("¿Que desea hacer?");
        
    }
    
    public static void encriptar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa la palabra que quieres encriptar");
        String palabra= teclado.next();
        String palabraEncriptada = classMD5.getMD5(palabra);
        System.out.println("La palabra "+ palabra + " en MD5 "+ palabraEncriptada);
    }
    
    public static void Lockers(){
        Scanner teclado= new Scanner(System.in);
        
        int numeros[]= new int[10];
        int b=1;
        int mayor=0;
        int menor=0;
        
        System.out.println("Ingresa 10 numeros:");
        
        for(int i=0; i<numeros.length ; i++){
            System.out.println("Dame el valor "+ b++);//UI
            numeros[i]= teclado.nextInt();//Llena el espacio
            if(i==0){ //Declaro el valor inical de menor, sólo en al iniciar
                menor= numeros[i];
            }
            if(numeros[i]>mayor){ //Modifico mayor
                mayor=numeros[i];
            }
            if(numeros[i]<menor){ //Modifico menor
                menor=numeros[i];
            }
            
        }

        
        System.out.println("El locker con más zapatos, tiene: "+ mayor + " zapatos");
        
        System.out.println("El locker con menos zapatos, tiene: "+ menor + " zapatos");

    }
}

