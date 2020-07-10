package programa1;
import java.io.*;


public class archivos {
    //Persistencia de infromación es cuando guardas tus datos fuera del programa
    public static void main (String args[]) throws FileNotFoundException, IOException{ //El throws .... me dice que se ejecuta si no hay problemas
        
        
        File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\recibo.txt"); //ubicación
        //C:\Users\jorge\OneDrive\Escritorio
        
        
        //System.out.println(archivo.canRead()); //Me dice si lo peude leer
        //System.out.println(archivo.length()); //Bytes que ocupa
        //System.out.println(archivo.exists());//Existe?
        //System.out.println(archivo.renameTo(archivo)); //
        //System.out.println(archivo.getPath()); //Me da la ubicación del archivo
        
        /* Leer
        FileReader lector= new FileReader(archivo);
        BufferedReader memoria = new BufferedReader(lector);
        String Linea = null;
        while ( (Linea = memoria.readLine())!= null){
            System.out.println(Linea);
        }
        */
        
        
        FileWriter tinta= new FileWriter(archivo,true);
        BufferedWriter writer= new BufferedWriter(tinta); // Meter el archivo a la memoria
        
        writer.write("hola");
        writer.newLine();
        writer.write("adios");
        writer.flush(); //
        tinta.close(); //Siempre hay que cerrar
        
        System.out.println("Insertado");
       
    }
}
