
package clase45;
import javax.swing.*;
import java.io.*;
public class Cesar {

    
    public static void main (String arg[]){
        System.out.println("Corriendo");
        String[] options= {"Cifrar", "Descrifrar"};
        int selec= JOptionPane.showOptionDialog(null, //parent componet, el primer valor que me da es cero
                                     "¿Qué deseas hacer?", //Mensaje
                                     "Desición", //Título
                                     JOptionPane.DEFAULT_OPTION, 
                                     JOptionPane.QUESTION_MESSAGE, 
                                     null, //Figurita 
                                     options,// El array de mis opciones, se hace por sí solo 
                                     null);//initial value
    
    switch (selec){
        case 0:
            cipher();
            break;
        case 1:
            /*decipher();//Hay que hacerlo de tarea*/
            break;
        default:
             System.exit (0);// Cierra todo el programa
            break;
        }
    }
    static void cipher(){
        String text= JOptionPane.showInputDialog ("Escribe el texto");
        if (text==null){ //Null, es en caso de que cierre la ventana
            System.exit (0);
        }
        String FileName = JOptionPane.showInputDialog ("Escribe el nombre del archivo");
        if (FileName==null){ //No me puede no dar el nombre del archivo
            System.exit (0);
        }
        
        int key= getInt ("Escribe la clave(int)");
        File archivo = new File(FileName);
        
        FileWriter fr;
        try {
            fr = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter(fr);
        }
        catch (IOException ex){ // se busca una ecepción y en caso de que concuerde se ejecuta esa paerte del codigo  
        }
    }
    static String alphabet="abcdefghijklmnopqrstuvwxyz";
    
    static String cipherText(String text, int key){
        StringBuilder sb= new StringBuilder();
        text = text.toLowerCase();
        for (int i= 0; i< text.length(); i++){
            char temp= text.charAt(i);
            if(temp>= 'a' && temp<= 'z'){
                temp-='a';
                sb.append(alphabet.charAt((temp+ key))%26);
            }
            else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
    static int getInt(String msg){
        while (true){
            try{
                String inpt = JOptionPane.showInputDialog(msg);
                if (inpt== null){
                    System.exit(0);
                }
                return Integer.parseInt(inpt);
            }
            catch (Exception ex){
            }
        }
    }
    static String decipherText(String text, int key){
        StringBuilder sb= new StringBuilder();
        text = text.toLowerCase();
        for (int i= 0; i< text.length(); i++){
            char temp= text.charAt(i);
            if(temp>= 'a' && temp<= 'z'){
                temp-='a';
                sb.append(alphabet.charAt((temp+ key))%26);
            }
            else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
    
    }
