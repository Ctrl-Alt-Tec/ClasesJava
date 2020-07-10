/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;
import javax.swing.*; //Ventana
import java.util.*; //Scanner
import java.io.*; //Archivos de texto
/**
 *
 * @author jorge
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       File x= new File("C:\\Users\\jorge\\Documents\\pepe.txt");
        if(x.exists()){
            System.out.println("Existe");
            
        }
        else {
            System.out.println("No existe");
        }
        /*
        String[] opt = {"opt1", "opt2", "opc3"};
        int i = JOptionPane.showOptionDialog(null, "Elige opcion", "Titulo", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
        System.out.println(i);
        switch (i){
            case 0:
                System.out.println("Hola");
            break;
        } 
        */
//JOptionPane.showMessageDialog();

        //Productos:   
        
        
        
        /*Requisitos del proyecto
            10 Productos a escoger
                ID del producto
                Nombre
                Categoría
                Precio
                Descuento
                Número de estrellas
            Ordenar los productos al menos en 2 maneras diferentes
        
        
                Mostrar un mensaje que me diga algo en caso de seleccionar un producto no válido
            3 intentos de recuperar contraseña
            Encriptació MD5 SHA1
        */
        
        
    }
    
}
