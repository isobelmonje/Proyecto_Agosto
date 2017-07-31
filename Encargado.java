
/**
 * Write a description of class Encargado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encargado extends Trabajador
{
    // instance variables - replace the example below with your own
    private String turno;

    /**
     * Constructor for objects of class Trabajador
     */
    public Encargado()
    {
        // initialise instance variables
        turno = "mañana";
    }

    /**
     * Metodos de modificacion de datos de Encargado
     */
    
    public void modificar_turno(String Nuevo_dato)
    {
        // put your code here
        turno = Nuevo_dato;
    }
    
    /**
     * Metodos para acceder a los datos de Encargado
     */
    
    public String turno()
    {
        // put your code here
        return turno;
    }
}
