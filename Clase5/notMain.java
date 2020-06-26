package ClasesJava.Clase5;

//Importamos la clase perrito de la tercera clase
import ClasesJava.Clase3.*;

public class notMain {
    public static void main(String[] args) {
       //Encapsulamiento:
        Patito perry = new Patito ("verde");
        System.out.println(perry.getColor());
        // perry.color = "azul";
        perry.setColor("morado");
        System.out.println(perry.getColor());
        
        //-----------------------
       //Arrays de Objetos:
       Perrito perrito1 = new Perrito ("Mora", 3, true);
       Perrito perrito2 = new Perrito ("Mike", 5, false);
               //Declaración de un Array de perros
        // Perrito perrera[]; //También puede ir después
      //Clase [] nombreArray = new Clase [tamañoDelArray];
        Perrito [] manada = new Perrito[2];
        //Le indicamos cuales van a ser los lugares
        manada[0] = perrito1;
        manada[1] = perrito2;

        //Creación del array con valores directos
        Perrito [] manada2 = {new Perrito("P1", 3, false),
                                new Perrito("nombre", 4, true)};

        //Creamos un foreach
        for (Perrito perrito : manada2) {
            perrito.darAmor();
        }
        //-----> Revisar en Calendario

       //Return de Objetos:

       //Creamos un objeto inicial
       Date hoy = new Date (28,4,2002);
       // A partir del objeto inical, creamos el día siguiente
       Date manana = hoy.nextDate();
       manana.giveDay();
       // Podemos seguir así para siempre
       Date pasadoManana = manana.nextDate();
        pasadoManana.nextDay();

       Calendario semanCalendario = new Calendario(hoy);
       semanCalendario.show();
    }
}