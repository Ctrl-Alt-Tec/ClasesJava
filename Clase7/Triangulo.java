package ClasesJava.Clase7;

public class Triangulo {

    private int base;

    public Triangulo(int base){
        this.base = base;
    }
    public String [][] triangulo1 (){
        String [][] resultado = new String [4][4];

        for (int j = 0; j < 4; j++) { //Altura
            for (int i = 0; i < j+1; i++) { //Base
                resultado[j][i] = "* ";
            }
        }
        return resultado;
    }
    public String [][] triangulo2 (){
        String [][] cubito4 = new String [4][4]; 
        for (int j = 0; j < (4+1); j++) { //Altura
            for (int i = 0; i < 4-j; i++) { //Base
                cubito4[j][i]= "  ";
            } // espacios
            for (int i2 = j; i2 < j-4; i2++){
                cubito4[j][i2] = "* ";
            }
            System.out.println("");
        }
        return cubito4;
    }
    

        
}