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
    private boolean ficha_cerrada;
    
    /**
     * Constructor for objects of class Ficha
     */
    public Ficha(Vehiculo vehiculo, Trabajador trabajador)
    {
        vehiculo_ficha = vehiculo;
        trabajador_ficha = trabajador;
        Lista_tareas = new ArrayList<Tarea>();
        ficha_cerrada = false;
        
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
    
    public void cerrar_tarea(int ID_tarea)
    {
        Lista_tareas.get(ID_tarea).validar_tarea();
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public String trabajador_nombre()
    {
        String texto = trabajador_ficha.nombre() + " " + trabajador_ficha.primer_apellido() +
                        " " + trabajador_ficha.segundo_apellido();
        return texto;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public String trabajador_tipo()
    {
        String texto = trabajador_ficha.tipo_trabajador().toLowerCase();
        return texto;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public String trabajador_DNI()
    {
        String texto = trabajador_ficha.DNI().toLowerCase();
        return texto;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public String vehiculo_matricula()
    {
        String texto = vehiculo_ficha.matricula().toLowerCase();
        return texto;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void resumen_tareas()
    {
        for(Tarea tarea_loop : Lista_tareas){
            int ID = Lista_tareas.indexOf(tarea_loop);
            System.out.print(" " + ID + " -");
            tarea_loop.resumen_tarea();
        }
        System.out.println("");
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public boolean comprobar_estado_ficha()
    {
        ficha_cerrada = true;
        for(Tarea tarea_loop : Lista_tareas){
            if(tarea_loop.estado_tarea() == false){
                ficha_cerrada = false;
                break;
            }
        }
        return ficha_cerrada;
    }
}