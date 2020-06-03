package ClasesJava.clase1;

public class Clase1{
    public static void main(String Args[]) {
        System.out.println("Ya me hartó la 40tena");
        //Declarar variables

        //ints
        int integerName = 0;
        //Strings
        String stringName = "Holaaa";
        //booleans
        boolean estaPresionandoBoton = true; //false
        boolean isArriba = false;
        //doubles
        double valorDecimal = 0.0;

        System.out.println(integerName + " " + stringName);

        //Condiciones
        if ( estaPresionandoBoton && /*And*/ !(isArriba)){ //Negando una condición
            //Moverme hacia adelante
            System.out.println("Avanza!!!");
            
        }
        if (integerName == 0/*Como comparamos, le ponemos doble igual*/){
            //Cerrar una pinza
            System.out.println("El int vale 0: ");
        }else{
            System.out.println("Else!!: ");
        }


    }
}

