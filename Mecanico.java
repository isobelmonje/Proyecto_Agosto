
/**
 * Write a description of class Mecanico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mecanico extends Trabajador
{
    // instance variables - replace the example below with your own
    private String turno;

    /**
     * Constructor for objects of class Trabajador
     */
    public Mecanico()
    {
        // initialise instance variables
        turno = "mañana";
    }

    /**
     * 
     */
    
    public void modificar_turno(String Nuevo_dato)
    {
        // put your code here
        turno = Nuevo_dato;
    }   
    
    public String turno()
    {
        // put your code here
        return turno;
    }
}
