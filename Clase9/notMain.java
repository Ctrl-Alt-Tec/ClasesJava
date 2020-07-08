package ClasesJava.Clase9;

public class notMain {
    
    static int global;
    
    public static void main(String[] args) {
        //Debuggar es el proceso en el cual se 
        //encuentran y eliminan bugs
        //Bugs -> Errores (lógicos, generalmente)

        //Si tienes un problema, y quieres saber cual el 
        //Imprimes algún valor que te información

        System.out.println("La tabla del 11 es:");
        for (int i = 0; i < 10 ; i++){
            // System.out.println("\tEl valor de 11 por " + i + " es "+ i*11);
            System.out.println("\t" + i*11);
        }
        //Creamos un breakpoint 
        //Es una pausa al momento de correr el cógigo
        //Es como una version paso a paso de tu código
        //La consola del debug va un paso atrás


        global = 10;

        int c, d;
        c = 5;
        d = 6;

        //suma(c, d);
        String [][] hola = triangulo();

    }

    public static int suma (int a, int b){
        int resultado;
        resultado = a+b;
        return resultado;
    }

    public static String [][] triangulo(){
        String [][] cubito4 = new String [4][4]; 
        for (int y = 0; y < (4+1); y++) { //Altura
            for (int x = 0; x < 4-y; x++) { //Base
                cubito4[y][x]= "  ";
            } // espacios
            for (int x = 0; x < y ; x++) {
                int posX = 4-1-x;
                cubito4[y][posX] = "* ";
            }
            System.out.println("");
        }
        return cubito4;
    }


}