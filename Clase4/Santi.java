package ClasesJava.Clase4;



public class Santi {

    String marca;    // Pertenece a una marca
    boolean isAzul;  // Es color azul
    boolean hasTinta; // Tiene tinta
    // String dictadoTexto;
    //Si no es un acaracterística escencial, no es un atributo
    
            
    public Santi (String marca, boolean isAzul, boolean isTinta) { /*,  String dictadoTexto*/  
        this.marca = marca;
        this.isAzul = isAzul;
        this.hasTinta = isTinta;
        // this.dictadoTexto = dictadoTexto;
            
          
    }
    
                        //Es un argumento
    public void escribir (String dictadoTexto){
        System.out.println (""+
        " _______________________ \n" +
        "|                       |\n" +
        "| " + dictadoTexto +"   |\n" +
        "|          \\           |\n" +
        "|          )\\          |\n" +
        "|           `\\         |\n" +
        "|            (\\        |\n" +
        "|             \\\\      |\n" +
        "|              \\\\     |\n" +
        "|               \\\\    |\n" +
        "|                \\\\   |\n" +
        "|                 \\\\  |\n" +
        "|                  \\\\ |\n" +
        "|___________________\\\\|\n" +
        "                     \\\\\n" +
        "                      \\;");
        }
}