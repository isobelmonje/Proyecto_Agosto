import java.util.ArrayList;
/**
 * Write a description of class Menus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    private ArrayList<String> opciones_menu = new ArrayList<String>();
    private String respuesta = "";
    /**
     * Constructor for objects of class Menus
     */
    
    public Menu(String tipo_trabajador, String tipo_menu)
    {
        if(tipo_menu.equals("0")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0();
            }
            else{
                Menu_com_mec_0();
            }
        }
        
        else if(tipo_menu.equals("0.1")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_1();
            }
        }
        else if(tipo_menu.equals("0.2")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_2();
            }
        }
        else if(tipo_menu.equals("0.3")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_3();
            }
        }
        else if(tipo_menu.equals("0.4")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_4();
            }
        }
    }
    
    // ENCARGADOS
    
    /**
     * Constructor for objects of class Menus
     */
    public void Menu_enc_0()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos"); //0.1
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos"); //0.2
        opciones_menu.add("Operaciones con Vehiculos dentro de la Base de Datos"); //0.3
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos"); //0.4
    }
    
    public void Menu_enc_0_1()
    {
        opciones_menu.add("Ver Resumen de Todos los Trabajadores"); //end
        opciones_menu.add("Ver Resumen de Trabajador por DNI"); //end
        opciones_menu.add("Añadir Trabajador"); //end
        opciones_menu.add("Eliminar Trabajador existente por DNI");//end
        opciones_menu.add("Modificar datos de Trabajador por DNI");//end
    }
    
    public void Menu_enc_0_2()
    {
        opciones_menu.add("Ver Resumen de Todos los Clientes");
        opciones_menu.add("Ver Resumen de Cliente por DNI");
        opciones_menu.add("Añadir Cliente");
        opciones_menu.add("Eliminar Cliente existente por DNI");
        opciones_menu.add("Modificar datos de Cliente por DNI");
        opciones_menu.add("Ver Vehiculos de Cliente por DNI");
    }
    
     public void Menu_enc_0_3()
    {
        opciones_menu.add("Ver Resumen de Vehiculo por matricula");
        opciones_menu.add("Añadir Vehiculo a cliente por DNI");
        opciones_menu.add("Eliminar Vehiculo existente por matricula");
        opciones_menu.add("Modificar datos de Vehiculo por matricula");
    }
    
    public void Menu_enc_0_4()
    {
        opciones_menu.add("Asignar tareas a Comerciales");
        opciones_menu.add("Asignar tareas a Mecanicos");
        opciones_menu.add("Ver Resumen de Fichas");
    }
    
    // COMERCIALES Y MECANICOS
    
    public void Menu_com_mec_0()
    {
        opciones_menu.add("Ver Tareas Pendientes");//0.1
        opciones_menu.add("Añadir Tareas por ID de Ficha");//0.2
        opciones_menu.add("Cerrar Tareas por ID de Ficha");//0.3
        opciones_menu.add("Ver Resumen de Todos los Clientes");//0.4
        opciones_menu.add("Ver Resumen de Cliente por DNI");//0.5
    }
    
    // RESUMENES
      
    /**
     * RESUMEN_1: Metodo para sacar en pantalla las opciones de un Menu
     */
    public void print(boolean zero)
    {
        int i = 1;
        System.out.println("¿Que desea hacer?:");
        for(String opcion : opciones_menu){
            System.out.println("    (" + i + ")" + " - " + opcion);
            i++;
        }
        if(zero == false){
            System.out.println("    (r)" + " - Ir al Menu Anterior");
        }
        System.out.println("    (s)" + " - Salir");
    }
}
