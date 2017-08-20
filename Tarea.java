
/**
 * Write a description of class Tarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarea
{
    private String Tarea;
    private boolean Tarea_cumplida;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea()
    {
        Tarea = "N/A";
        Tarea_cumplida = false;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public Tarea(String Tarea_1)
    {
        Tarea = Tarea_1;
        Tarea_cumplida = false;
    }
    
    public void modificar_texto_tarea(String texto){
        Tarea = texto;
    }
    
    public void validar_tarea(){
        Tarea_cumplida = true;
    }
    
    public void invalidar_tarea(){
        Tarea_cumplida = false;
    }
    
    public void resumen_tarea()
    {
        System.out.println(Tarea + " (" + Tarea_cumplida + ")");
    }
    
    public boolean estado_tarea(){
        return Tarea_cumplida;
    }
}