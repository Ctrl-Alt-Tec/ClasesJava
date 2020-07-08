package ClasesJava.Clase7;

public class main2 {
    public static void main(String[] args) {
        int base = 4;
        //Mostrar en pantalla
        for (int y = 0; y < base; y++) { //Columnas
            for (int x = 0; x < y+1; x++) { //Filas
                System.out.print("* ");
            }
            //Terminamos fila, ponemos enter
            System.out.println("");
        }

        System.out.println("");

        for (int y = 1; y < base + 1; y++) {
            for (int x = base ; x > 0 + y; x--) {
                System.out.print("  ");
            }
            for (int x = 0; x < y; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //------------
        //Base = 4
        String [][] t1 = new String [base][base];

        for (int y = 0; y < base; y++) {
            for (int x = 0; x < y + 1; x++) {
                t1 [y][x] = "* ";
            }
        }
        System.out.println("Arrays");
        printArray(t1);

        String [][] t2 = new String [base][base];
        for (int y = 0; y < base; y++) {
            for (int x = (base-y)-1; x < base ; x++) {
                t2 [y][x] = "* ";
            }
        }
        printArray(t2);

        Piramide hola = new Piramide (4);
        printArray(hola.printPiramide());

    }

    public static void printArray (String [][] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                if (array[i][j] == null){
                    System.out.print("  ");;
                }else{
                    System.out.print(array[i][j]);
                }
                
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