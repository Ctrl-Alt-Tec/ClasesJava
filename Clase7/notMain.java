package ClasesJava.Clase7;

public class notMain {
    public static void main(String[] args) {
        
        //Cómo mostrar un cuadrado
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("* "); //* * * *
            }
            System.out.println("");    //"\n" 
        }
        //Resultado del código anterior:
            //* * * *
            //* * * *

        System.out.println(""); 
        //Cómo mostrar un triángulo
        
        //Triangulo de arriba a abajo
        for (int j = 0; j < 4; j++) { //Altura
            for (int i = 0; i < j+1; i++) { //Base
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Valores cambiantes de i y j
            // 0,0
            // 1,0 -> 1,1
            // 2,0 -> 2,1 -> 2,2

        //Triangulo de abajo a arriba
        for (int j = 0; j < (4+1); j++) { //Altura
            for (int i = 0; i < 4-j; i++) { //Base
                System.out.print("  ");
            } // espacios
            for (int i2 = 0; i2 < j; i2++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //      * 2 = base - 1 1 ->j 
        //    * * 1 = base - 2
        //  * * *
        
        
        int tamano = 10;
        //Declarar un array
        int [] intArray = new int [tamano];
        
        //Dibujar
        System.out.println(""); // Sysout
    
        //Declarar array BI-dimensional aka matriz
        int ancho = 10;
        int alto = 3;

        String [][] tablita = new String [alto][ancho]; //Recuerden, es(y,x)
        //Defir el valor de la casilla (0,0)
        tablita [0][0] = ":)";
        
        // Combinar dos matrices
        char [][] cubito = new char [3][3];
        char [][] cubito2 = new char [3][3];
        
        //Llenar c1 y c2
        for (int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
                cubito[i][j] = '-';
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
                cubito2[i][j] = '+';
            }
        }
        System.out.println("Se llenó el cubito");

        printArray(cubito);
        printArray(cubito2);

        //Merge de c1 y c2
        char [][] cubito3 = new char [3][3+3]; 
        /**
         * Como los juntamos horizontalmente, sumamos sus anchos para tener un ancho total
         */
        for (int i = 0; i < 3; i++){
            for (int j = 0; j< 6; j++){
                if (j <3){ //La midad, el fin de mi c1
                    cubito3[i][j] = cubito[i][j];
                }else{
                    cubito3[i][j] = cubito2[i][j-3]; //J menos la mitad
                }
            }
            System.out.println("");
        }
        printArray(cubito3);
        System.out.println("");

        //--------------------------------------------------------
        //INSTRUCCIONES:
        /**
         * Crea la clase rectángulo
         * Tú debes de indicar los atributos
         * Debe de tener como métodos:
         *     Dibujar:
         * punto = "l"
         * System...( punto)
         *          + + + +
         *          + + + +
         *          + + + +
         *          + + + +
         *          + + + +
         *     Obtener área
         *     Seleccionar el punto "*,+,♦,..."
         * -----------------------------------
         * Crea la clase Triángulo
         * Igual, decide los atributos
         * Métodos:
         *     Dibujar: (Puede ser en dos direcciones)
         * 
         *      *     |     *
         *      * *   |   * *
         *      * * * | * * *
         *     Obtener área (como lo hemos visto previamente)
         *     Seleccionar el punto "*,+,♦,..."
         * --------------------------------------------------     
         * Apartir de la clase triángulo, crea una clase pirámide
         * Métodos:
         *     Obtener el área
         *     Dibujar
         * |          *
         * |        * * *
         * |      * * * * *
         * |    * * * * * * *
         * |  * * * * * * * * *
         * --------------------------------
         * Apartir de la clase pirámide y rectángulo, crea la clase 
         * Casita.
         * Tú defines los atributos
         * Sólo tiene el método de dibujar:
         *         *
         *       * * *
         *     * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         * Extra: haz que sólo tenga bordes:
         *         *
         *       * * *
         *     * * * * *
         *   * * * * * * *
         *   *           *
         *   *           *
         *   *           *
         *   *           *
         *   *           *
         *   * * * * * * *
         */

        


    }
    public static void test (){
        
    }

    public static void printArray (char [][] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //Método que regresa un array Bi-dimensional
    public String [][] dibujar (){
        String [] [] arrayBi = new String [3][2];
        return arrayBi;
    }
}