
package javaapplication11;
import java.util.*;
public class JavaApplication11 {

    public static void main(String[] args) {
        
        cactus();
        System.out.println("Bienvenido al programa de reintegración de cactáceas");
        System.out.println("Este te dirá si tu cactacea puede vivir en el desierto de Hidalgo");
        System.out.println("");
        System.out.println("");
        
        valoracion();    
    }
    static int luminosidad(){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Ingresa la luminosidad (Lux)");
        float lux= teclado. nextFloat();
        if (lux>34 && lux<0){
            System.out.println("Los valores son incorrectos");
            System.out.println("Intenta de nuevo");
            luminosidad();
        }
        if (lux<25){
            return 0;
        }
        else return 1;
    }
    static int temperatura(){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Ingresa la temperatura del ambiente (Celsius)");
        float temp= teclado.nextFloat();
        if (temp>300 && temp<-150){
            System.out.println("Los valores son incorrectos");
            System.out.println("Intenta de nuevo"); 
            temperatura();
        }
        if (temp>=25 && temp<=35){
            return 1;
        }    
        else{
            return 0;
        }
    }
    static int humedad(){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Ingresa la humedad (%)");
        float hum = teclado.nextFloat(); 
        if (hum>100 && hum<0){
            System.out.println("Los valores son incorrectos");
            System.out.println("Intenta de nuevo"); 
            humedad();
        }
        if (hum<=7 && hum>=2){
            return 1;
        }    
        else{
            return 0;
        }
    }
    static int base(){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Ingresa el nivel de pH (tierra)");
        float ph = teclado.nextFloat();
        if (ph<1 && ph>14){
            System.out.println("Los valores son incorrectos");
            System.out.println("Intenta de nuevo"); 
            base();
        }
        if (ph<=9 && ph>=7){
            return 1;
        }
        else{
            return 0;
        }
    }
   
    static void valoracion (){
        int a =luminosidad();
        int b = temperatura();
        int c= humedad();
        int d = base();
        
        int suma=a+b+c+d;
        if (suma==3 || suma==4){
            System.out.println("Tu cactacea está lista para ser reintegrada");
            cactus2();
        }
        else{
            System.out.println("Tu cactacea puede no soportar el ambiente del parque");
            System.out.println("Climatízala y regresa de nuevo");
        }
    }
    
    public static void cactus(){
        System.out.println("    ,*-.");
        System.out.println("    |  |");
        System.out.println("    |  |");
        System.out.println(",.  |  |");
        System.out.println("| |_|  | ,.");
        System.out.println("`---.  |_| |");
        System.out.println("    |  .--`");
        System.out.println("    |  |");
        System.out.println("    |  |");
    }
    public static void cactus2(){
        System.out.println("         /*");
        System.out.println("       .    _    +     .  ______   .          .");
        System.out.println("   (      /|\\      .    |      \\      .   +");
        System.out.println("        . |||||     _    | |   | | ||         .");
        System.out.println("  .       |||||    | |  _| | | | |_||    .");
        System.out.println("     /\\  ||||| .  | | |   | |      |       .");
        System.out.println("   __||||_|||||____| |_|_____________\\__________");
        System.out.println("   . |||| |||||  /\\   _____      _____  .   .");
        System.out.println("     |||| ||||| ||||   .   .  .         ________");
        System.out.println("   . \\|`-'|||| ||||    __________       .    .");
        System.out.println("      \\__ |||| ||||      .          .     .");
        System.out.println("    __    ||||`-'|||  .       .    __________");
        System.out.println("    .    . |||| ___/  ___________             .");
        System.out.println("      . _ ||||| . _               .   _________");
        System.out.println("   _   ___|||||__  _ \\\\--//    .      ");
        System.out.println("         _ `---'    .)=\\oo|=(.   _   .   .    .");
        System.out.println("    _  ^      .  -    . \\.|");
    }
}
