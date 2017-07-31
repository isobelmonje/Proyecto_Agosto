
/**
 * Write a description of class Comercial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comercial extends Trabajador
{
    // instance variables - replace the example below with your own
    private String turno;

    /**
     * Constructor for objects of class Trabajador
     */
    public Comercial()
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
