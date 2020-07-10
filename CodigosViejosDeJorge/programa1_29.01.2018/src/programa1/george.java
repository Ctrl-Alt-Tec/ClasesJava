//asaí sería en java
package programa1;

public class george {
    
  public static void main (String[] args){

        String verbo= "arbeiten";
        int menos = verbo.length()-2;
        verbo= verbo.substring(0,menos);
        int ultimaLetra=verbo.length()-1;
        char letra= verbo.charAt(ultimaLetra);
        if(letra=='t'){
            System.out.println("funciona");
        }
        verbo=verbo+"t";
        System.out.println("el verbo es " + verbo);
    }
  /*
  if (letra == "t"){
        verbo=verbo+"e";
        }
  */
        
}
