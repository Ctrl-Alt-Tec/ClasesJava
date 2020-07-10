package arte;

public class Leon extends Animal
{
    boolean tieneMelena = true;
    boolean macho = true;
    
    public Leon(String razaNueva, String nombreNuevo, Integer numero_patasNuevo) {
        super(razaNueva, nombreNuevo, numero_patasNuevo);
    }
    
    public void rugir()
    {
        System.out.println(nombre + " ruge!");
    }    
}
