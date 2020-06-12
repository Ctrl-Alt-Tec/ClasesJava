package ClasesJava.Clase4;

public class Hat {
    int hatSize;
    // int newHatSize; Se está repitiendo
    String hatShape;
    String hatColor;
    static int HatsInTheWorld = 0;


    public Hat (int hatSize, String hatShape, String hatColor){
        this.hatSize = hatSize;
        this.hatShape = hatShape;
        this.hatColor = hatColor;
        HatsInTheWorld++;
    }
    public int getHatsInTheWorld(){
        return HatsInTheWorld;
    }

    public void wearHat(){

     System.out.println("The " + hatColor + ", " + hatShape + " hat is being worn.");
     System.out.println("   ;       ~~ \" " );
     System.out.println("  |           ;");
     System.out.println(",--------,______|---.");
     System.out.println("/          \"-----`    \" ");
     System.out.println("`.__________`-_______-'");
     System.out.println(" ");
    }

    public void throwHat(){

     System.out.println("The " + hatColor + ", " + hatShape + " hat is being thrown");
     System.out.println("     ");
     System.out.println("/ (╯°□°）╯︵ ┻━┻");
     System.out.println(" ");

    }

    public void makeSize(int newHatSize){
        
        this.hatSize = newHatSize;

        System.out.println("The hat is now size " + newHatSize); 
        System.out.println(" ");
    }
}