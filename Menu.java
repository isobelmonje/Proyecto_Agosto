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
            else if (tipo_trabajador.toLowerCase().equals("comercial")){
                Menu_com_0();
            }
            else{
                Menu_mec_0();
            }
        }
        
        else if(tipo_menu.equals("0.1")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_1();
            }
            else if (tipo_trabajador.toLowerCase().equals("comercial")){
                //Menu_com_1();
            }
            else{
                //Menu_mec_1();
            }
        }
        else if(tipo_menu.equals("0.2")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_2();
            }
            else if (tipo_trabajador.toLowerCase().equals("comercial")){
                //Menu_com_1();
            }
            else{
                //Menu_mec_1();
            }
        }
        else if(tipo_menu.equals("0.3")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_0_3();
            }
            else if (tipo_trabajador.toLowerCase().equals("comercial")){
                //Menu_com_1();
            }
            else{
                //Menu_mec_1();
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
        // opciones_menu.add("Comprobar estado de Revisiones"); //0.5
        opciones_menu.add("Operaciones con Promociones Comerciales"); //0.5
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
        opciones_menu.add("Ver Resumen de Tareas");
    }
    
    public void Menu_enc_0_5()
    {
        opciones_menu.add("Ver Promociones Comerciales");
        opciones_menu.add("Crear Nueva Promocion Comercial");
        opciones_menu.add("Cerrar Promocion Comercial");
    }
    
    // COMERCIALES
    
    public void Menu_com_0()
    {
        opciones_menu.add("Ver Promociones Actuales");//end
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");//0.2
    }
    
    public void Menu_com_0_2()
    {
        opciones_menu.add("Ver Resumen de Todos los Clientes");
        opciones_menu.add("Ver Resumen de Cliente por DNI");
        opciones_menu.add("Añadir Cliente");
        opciones_menu.add("Eliminar Cliente existente");
        opciones_menu.add("Modificar datos de Cliente");
        opciones_menu.add("Gestionar Vehiculos de Cliente por DNI");
        opciones_menu.add("Ir al menu anterior");
    }
    
    // MECANICOS
    
    public void Menu_mec_0()
    {
        opciones_menu.add("Operaciones con Tareas Asignadas");
        opciones_menu.add("Modificar 'password' personal");
    }
       
    public void Menu_mec_1()
    {
        opciones_menu.add("Ver mis Tareas");
        opciones_menu.add("Ir al menu anterior");
    }
      
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
