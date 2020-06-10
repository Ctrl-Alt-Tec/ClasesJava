package ClasesJava.Clase3;

public class Clase3{

    //Metodo que va a ser ejecutado por el compilador
    public static void main(String[] args) {
        //Nuestra Clase perrito se va a convertir en un objeto
        int numeroDePatas = 3;
        Perrito perrito1 = new Perrito ("Mora", numeroDePatas, true);
        //Llamar al método de dar amor:
        perrito1.darAmor();

        Perrito perrito2 = new Perrito ("Mike", 5, false);
        perrito2.darAmor();

        //Mora se quiere cambier el nombre
        System.out.println("El nombre es: " + perrito1.getNombre());
        //Se lo cambia
        perrito1.cambiarNombre("Moro");

        System.out.println("El nombre es: " + perrito1.getNombre());


    }
}
