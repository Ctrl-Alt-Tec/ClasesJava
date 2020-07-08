package ClasesJava.Clase7;

public class Piramide {
    
    private int base;
    private Triangulo tb;
    private Triangulo tp;

    public Piramide(int base){
        this.base = base;
        this.tb = new Triangulo(base-1);
        this.tp = new Triangulo(base);
    }

    public String [][] p1(){
        String [][] t2 = new String [base][base];
        for (int y = 0; y < base; y++) {
            for (int x = (base-y)-1; x < base ; x++) {
                t2 [y][x] = "* ";
            }
        }
        return t2;
    }
    public String [][] p2(){
        String [][] t2 = new String [base][base];
        for (int y = 0; y < base; y++) {
            for (int x = 0; x < y + 1; x++) {
                t2 [y][x] = "* ";
            }
        }
        return t2;
    }

    public String [][] printPiramide (){
        String [][] piramide = new String [base][base*2];
        String [][] t1 = p1();
        String [][] t2 = p2();
        for (int y = 0; y < base; y++){
            for (int x = 0; x< piramide[y].length; x++){ //#Base*2
                if (x < base){ //La midad, el fin de mi c1
                    piramide[y][x] = t1[y][x];
                }else{
                    piramide[y][x] = t2[y][x-base]; //x menos la mitad
                }
            }
            System.out.println("");
        }
        return piramide;
    }
    
    
}