package programa1;

import java.io.*;

public class LeerArchivo {
    public static void main(String arg[]) throws FileNotFoundException, IOException{
        File ARCHIVO = new File("C:\\Users\\usuario\\Desktop\\remain.txt");
        
        FileReader ARCHIVO_LEER = new FileReader(ARCHIVO);
        BufferedReader MEMORIA_LECTURA = new BufferedReader(ARCHIVO_LEER);
        
        String LINEA = null;
        String LINEA_COLUMNAS[];
        
        LINEA = MEMORIA_LECTURA.readLine();
        
        while( LINEA != null ){
            
            //Separa la LINEAS en un arreglo por la barra vertical            
            LINEA_COLUMNAS = LINEA.split("\\|");
            
            System.out.println(ESPACIO_PERFECTOS(LINEA_COLUMNAS[0],20)+ESPACIO_PERFECTOS(LINEA_COLUMNAS[1],7)+"  "+LINEA_COLUMNAS[3]);
            
            LINEA = MEMORIA_LECTURA.readLine();
            
        }        
        
    }
    
    public static String ESPACIO_PERFECTOS(String PALABRA, int TAMANIO){
        while(PALABRA.length() < TAMANIO){
            PALABRA+= " "; 
        }
        return PALABRA;
    }
}