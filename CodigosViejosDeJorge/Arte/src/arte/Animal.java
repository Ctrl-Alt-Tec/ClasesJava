package arte;

public class Animal
{
    public String raza;
    public String nombre;
    public int numero_patas;
    
    public Animal(String razaNueva, String nombreNuevo, Integer numero_patasNuevo)
    {
        raza = razaNueva;
        nombre = nombreNuevo;
        numero_patas = numero_patasNuevo;
    }

    public void respirar()
    {
        System.out.println(nombre + " esta respirando");
    }
}
