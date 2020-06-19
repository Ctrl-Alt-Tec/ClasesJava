package ClasesJava.Clase5;
//Java automáticamente incluye math
import java.lang.Math;

public class Tarea {
    public static void main(String[] args) {
        int CA = 5; //Cateto adyacente
        int CO = 6; //Cateto adyacente
        double hip =  Math.hypot(CA, CO);

        System.out.println("Hipotenusa de math: " + hip);
        //Larga, de flojera
        hip = Math.sqrt(Math.pow(CA, 2) + Math.pow(CO, 2));
        System.out.println("Hipotenusa de nosotros: " + hip);
    }
}