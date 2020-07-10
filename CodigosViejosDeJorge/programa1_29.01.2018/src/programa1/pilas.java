package programa1;
import java.util.*;
public class pilas {
    static Scanner teclado= new Scanner(System.in);
    static int count= -1;
    static int pila[]= new int [9];
    public static void main (String []args){
       
        System.out.println("Hola, este programa es una simulación de una pila");
        System.out.println("El tipo de dato es enteros y el tamamño 9");
        while (true){
            System.out.println("¿Qué deseas hacer?");
            menu();
            int opc = teclado.nextInt();
            switch (opc){
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    isEmpty();
                    break;
                case 4:
                    size();
                    break;
                case 5:
                    maxSize();
                    break;
                case 6:
                    isFull();
                    break;
                case 7: 
                    print();
                    break;
                case 8:
                    top();
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción  no válida");
                    break;
            }
        }
        
    }
    
    public static void push(){
        if (count==pila.length){
            System.out.println("Tu pila está llena");
            return;
        }
        System.out.println("¿Qué número deseas insertar?");
        int var= teclado.nextInt();
        count++;
        pila[count]= var;
        System.out.println("");
    }
    public static void pop(){
        if(count==-1){
            System.out.println("Tu pila está vacia");
            return;
        }
        pila[count]=0;
        count--;
        System.out.println("Has removido la punta");
        System.out.println("");
    }
    public static void isEmpty(){
        System.out.println("¿Qué espacio quieres probar?");
        int ie= teclado.nextInt();
        if (ie> pila.length){
            System.out.println("Tu pila no tiene tantos espacios, intenta con otro");
            return;
        }
        ie++;
        System.out.println("El valor que buscas es: " + pila[ie]);
        System.out.println("");
    }
    public static void size(){
        count++;
        System.out.println("Tu tamaño es: "+count);
        System.out.println("");
        count--;
    }
    public static void maxSize(){
        System.out.println("Tu tamaño maximo es: "+pila.length);
        System.out.println("");
    }
    public static void isFull(){
        if(count==pila.length){
            System.out.println("Sí, está llena");
            return;
        }
        int a= pila.length-count;
        System.out.println("No está llena, te quedan " + a);
        System.out.println("");
    }
    public static void print(){
        for(int a=0;a <=pila.length; a++){
            System.out.println(pila[a]);
            System.out.println("");
        }
        System.out.println("Esos son los valores");
        System.out.println("");
    }
    public static void top(){
        if(count==-1){
            System.out.println("Tu pila está vacía");
            return;
        }
        System.out.println("Tu punta es: " + pila[count]);
        System.out.println("");
    }
    
    public static void menu(){
        System.out.println("1.- Push");
        System.out.println("2- Pop");
        System.out.println("3.- Is Empty?");
        System.out.println("4.- Actual size");
        System.out.println("5.- Max size");
        System.out.println("6- Is full?");
        System.out.println("7.- Mostrar pila");
        System.out.println("8.- Top");
        System.out.println("9.- Salir");
    }
}
