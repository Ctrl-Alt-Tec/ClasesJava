package ClasesJava.Clase4;

import java.util.Scanner;


public class Cereal{
    //Atributos
    String marca;
    String color;
    int precio;
    //Constructor
public Cereal( String marca, String color, int precio){
    this.marca = marca;
    this.color = color;
    this.precio = precio;

}
public void escogerCereal(){
    Scanner tecladito = new Scanner(System.in);
    System.out.println("Qué cereal quieres?: CornFlakes, Nesquik u Oreo ");
    String seleccionDeCereal = tecladito.next();
    if (seleccionDeCereal.equalsIgnoreCase("CornFlakes")){
        System.out.println("Exquisita eleccion");
        darInstrucciones(seleccionDeCereal);
    } else if (seleccionDeCereal.equalsIgnoreCase("Nesquik")){
        System.out.println("      _____   ____      _____ ____  _____  _   _ ______ _               _  ________  _____   ______  _____   __  __ ______     _  ____  _____     " );
        System.out.println(" |  __ \\ / __ \\    / ____/ __ \\|  __ \\| \\ | |  ____| |        /\\   | |/ /  ____|/ ____| |  ____|/ ____| |  \\/  |  ____|   | |/ __ \\|  __ \\  " );
        System.out.println(" | |  | | |  | |  | |   | |  | | |__) |  \\| | |__  | |       /  \\  | ' /| |__  | (___   | |__  | (___   | \\  / | |__      | | |  | | |__) | " );
        System.out.println(" | |  | | |  | |  | |   | |  | |  _  /| . ` |  __| | |      / /\\ \\ |  < |  __|  \\___ \\  |  __|  \\___ \\  | |\\/| |  __| _   | | |  | |  _  /  " );
        System.out.println(" | |__| | |__| |  | |___| |__| | | \\ \\| |\\  | |    | |____ / ____ \\| . \\| |____ ____) | | |____ ____) | | |  | | |___| |__| | |__| | | \\ \\  " );
        System.out.println(" |_____/ \\____( )  \\_____\\____/|_|  \\_\\_| \\_|_|    |______/_/    \\_\\_|\\_\\______|_____/  |______|_____/  |_|  |_|______\\____/ \\____/|_|  \\_\\ " );
        System.out.println("              |/                                                                                                                                       ");                                                                                                                                                   
        darInstrucciones(seleccionDeCereal);
    } else if (seleccionDeCereal.equalsIgnoreCase("Oreo")){
        System.out.println("Rico");
        darInstrucciones(seleccionDeCereal);
    }
    tecladito.close();

}
    
public void darInstrucciones( String seleccionDeCereal){
    System.out.println("Para comer tu " + seleccionDeCereal + "debes hacer lo siguiente:"); 
    System.out.println("Primero abre la caja de" + seleccionDeCereal);
    String afirmacionPrimera = getConfirmar();//afirmación
    if (afirmacionPrimera.equals("sí") || afirmacionPrimera.equals("si")){
        System.out.println("Saca un plato hondo y ponle cereal, mucho");
        String nuevaafirmacion = getConfirmar();
        if (nuevaafirmacion.equals("sí") || nuevaafirmacion.equals("si"));
        System.out.println("Ponle leche y con una cuchara come tu " + seleccionDeCereal);
    }
    

}
public String getConfirmar(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Listo?");
    String afirmacion = teclado.nextLine();
    teclado.close();
    return afirmacion;
}



}
