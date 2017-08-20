import java.util.ArrayList;
/**
 * Write a description of class Ficha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ficha
{
    private Vehiculo vehiculo_ficha;
    private Trabajador trabajador_ficha;
    private ArrayList<Tarea> Lista_tareas;
    
    /**
     * Constructor for objects of class Ficha
     */
    public Ficha(Vehiculo vehiculo, Trabajador trabajador)
    {
        vehiculo_ficha = vehiculo;
        trabajador_ficha = trabajador;
        Lista_tareas = new ArrayList<Tarea>();
        
        if(trabajador_ficha.tipo_trabajador().toLowerCase().equals("comercial")){
            if(vehiculo_ficha.GPS() == false){
                Tarea tarea = new Tarea("Ofrecer ponerle GPS");
                Lista_tareas.add(tarea);
            }
            if(vehiculo_ficha.aire_acondicionado() == true){
                Tarea tarea = new Tarea("Ofrecer rellenar Aire acondicionado en epoca de verano");
                Lista_tareas.add(tarea);
            }
            
            Tarea tarea = new Tarea("Si ITV está apunto de caducar (2 meses) llamarle");
            Lista_tareas.add(tarea);
            
            tarea = new Tarea("Ofrecer Cambio de pintura por promoción de verano");
            Lista_tareas.add(tarea);
        }
        else{
            if(vehiculo_ficha.combustible().toLowerCase().equals("diesel")){
                Tarea tarea = new Tarea("Revisión de Filtro de particulas");
                Lista_tareas.add(tarea);
            }
            if(vehiculo_ficha.vehiculo().toLowerCase().equals("moto")){
                Tarea tarea = new Tarea("Comprobar Presión de neumaticos");
                Lista_tareas.add(tarea);
            }
            if(vehiculo_ficha.tipo_vehiculo().toLowerCase().equals("servicios")){
                Tarea tarea = new Tarea("Comprobar Sirena");
                Lista_tareas.add(tarea);
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void nueva_tarea(String tarea_string)
    {
        Tarea tarea = new Tarea(tarea_string);
        Lista_tareas.add(tarea);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void resumen_tareas()
    {
        for(Tarea tarea_loop : Lista_tareas){
            System.out.print("  ");
            tarea_loop.resumen_tarea();
        }
        System.out.println("");
    }
}