package ClasesJava.Clase5;

public class Patito {
    
    //Atributos
    private String color;
    String sonido;
    boolean esPadre;
    int edad;
    
    
    public Patito (String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
}