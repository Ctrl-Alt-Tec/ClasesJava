
package programa1;

import java.util.*;
public class FuncionesRecursivas {



    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        menu();
    }
    
    public static void menu(){
        System.out.println("Este es el menu");
         menu();
        //asaí se hace recursiva
        
        opc1();
        opc2();
        opc3();
        System.out.println("Que opcion quieres?");
    }
    public static void opc1(){
        System.out.println("Mostrar menú");
    }
    public static void opc2(){
        System.out.println("Mostrar mensaje");
    }
    public static void opc3(){
        System.out.println("Salir");
    }
}
