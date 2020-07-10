/*
Materia: Informática II
Grupo: 300
Autor: A01023859_Jorge Pérez
[12/feb/2018]
[Divisiones]
 */
package programa1;
public class pruebaentrada {
    public static void main (String arg[]){
        System.out.print("Bienvenido ¿Cual es tu nombre? ");
        String NOM= Entrada.Cadena();
        System.out.println("Espero que tengas un buen día, " + NOM);
        System.out.println("Hoy vamos a dividir");
        System.out.println("Ingresa el valor del numerador");
        float NUM= Entrada.Float();
        System.out.println("Ingresa el valor del denomidaor");
        float DEN= Entrada.Float();
        if (DEN==0)
        {
            System.out.println("Tu operación no es válida");
        }
        else 
        {
            System.out.println("La operacion que estas haciendo es " + NUM + "/" + DEN);
            double DIV= NUM/DEN;
            System.out.println("El resultado de tu operación es");
            System.out.format("%.2f", DIV);
        }
        
        
    }
}
