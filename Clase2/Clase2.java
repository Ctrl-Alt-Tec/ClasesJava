package ClasesJava.Clase2;

import java.lang.Math;

public class Clase2 {
    
    /**Variables gloables 
     * Una variable con un scope de toda la clase
     * Quién las puede utilizar
    */
    static String variableGlobal; //Variable global
                                //Null es que no tiene valor
                                //Ponerla fuera de una función

    public static void main(String[] args) {
        int numerito = 10;
        System.out.println("Numerito vale: " + numerito);
        
        variableGlobal = "Mundo";
        //Recuerden llamar a las funciones!!!!
        funtionName();
        
        double perimetro = calcularPerimetroRectangulo(5.8, 2);
        System.out.println("El perimetro es: " + perimetro);

        //Las funciones pueden llamar a otras funciones :)!!!!
        System.out.println("El área del triangulo es: " + calcularAreaTriangulo(5, 3));

        //Función sobrecarga
        System.out.println("El área del triangulo es: " + calcularAreaTriangulo(5, 3, 6));

        
        

    }

    static int numeroGlobal = 30;

    static void funtionName (/*String argumento*/){
        /** Code... */
        System.out.println("VariableGlobal vale: " + variableGlobal);
        System.out.println("numeroGlobal vale: " + numeroGlobal);
        //Esto marca error porque está fuera del scope de numerito
        //System.out.println("Numerito vale: " + numerito);
        
        //Las funciones void no necesitan return 
    }

    static double calcularPerimetroRectangulo (double base, double altura){
        double perimetro = 2*base + 2*altura;
        return perimetro;
        /**Cualquiera de las dos funciona */
        // return 2*base + 2*altura;
    }

    static double calcularAreaTriangulo(double base, double altura){
        return (base*altura)/2;
    }

    // Sobrecarga -> cuando dos funciones se llaman de la misma manera
        // Los paramétros tienen que ser diferentes
    static double calcularAreaTriangulo(double a, double b, double c){
        //#Jerarquía de operaciones!!!
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
}