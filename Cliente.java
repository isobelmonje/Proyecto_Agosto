
/**
 * Write a description of class Cliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente extends Persona
{
    // instance variables - replace the example below with your own
    private int numero_de_cliente;

    /**
     * Constructor for objects of class Trabajador
     */
    public Cliente()
    {
        // initialise instance variables
        numero_de_cliente = 000000000;
    }

    /**
     * 
     */
    
    public void modificar_numero_de_cliente(int Nuevo_dato)
    {
        // put your code here
        numero_de_cliente = Nuevo_dato;
    }
    
    public int numero_de_cliente()
    {
        // put your code here
        return numero_de_cliente;
    }
}
