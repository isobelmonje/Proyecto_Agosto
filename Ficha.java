import java.util.ArrayList;
/**
 * Write a description of class Ficha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ficha
{
    private Vehiculo vehiculo_ficha = new Vehiculo();
    private Trabajador trabajador_ficha = new Trabajador();
    private ArrayList<String> Tareas = new ArrayList<String>();
    private ArrayList<Boolean> tareas_cumplidas = new ArrayList<Boolean>();
    /**
     * Constructor for objects of class Ficha
     */
    public Ficha(Vehiculo vehiculo, Trabajador trabajador)
    {
        vehiculo_ficha = vehiculo;
        trabajador_ficha = trabajador;
        
        if(vehiculo_ficha.combustible().toLowerCase().equals("diesel")){
            Tareas
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
