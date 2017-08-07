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
        
        else if(tipo_menu.equals("1")){
            if(tipo_trabajador.toLowerCase().equals("encargado")){
                Menu_enc_1();
            }
            else if (tipo_trabajador.toLowerCase().equals("comercial")){
                Menu_com_1();
            }
            else{
                Menu_mec_1();
            }
        }
        
    }
    
    /**
     * Constructor for objects of class Menus
     */
    public void Menu_enc_0()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos");
        opciones_menu.add("Comprobar estado de Revisiones");
        opciones_menu.add("Operaciones con Promociones Comerciales");
    }
   
    public void Menu_com_0()
    {
        opciones_menu.add("Ver Promociones Actuales");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
    }
    
    public void Menu_mec_0()
    {
        opciones_menu.add("Operaciones con Tareas Asignadas");
    }
    
    public void Menu_enc_1()
    {
        opciones_menu.add("Ver Resumen de Todos los Clientes");
        opciones_menu.add("Ver Resumen de Cliente por DNI");
        opciones_menu.add("Añadir Cliente");
        opciones_menu.add("Eliminar Cliente existente");
        opciones_menu.add("Modificar datos de Cliente");
        opciones_menu.add("Gestionar Vehiculos de Cliente por DNI");
        opciones_menu.add("Ir al menu anterior");
    }
    
    public void Menu_com_1()
    {
        opciones_menu.add("Ver Resumen de Todos los Clientes");
        opciones_menu.add("Ver Resumen de Cliente por DNI");
        opciones_menu.add("Añadir Cliente");
        opciones_menu.add("Eliminar Cliente existente");
        opciones_menu.add("Modificar datos de Cliente");
        opciones_menu.add("Gestionar Vehiculos de Cliente por DNI");
        opciones_menu.add("Ir al menu anterior");
    }
    
    public void Menu_mec_1()
    {
        opciones_menu.add("Ver Resumen de Todos los Clientes");
        opciones_menu.add("Ver Resumen de Cliente por DNI");
        opciones_menu.add("Añadir Cliente");
        opciones_menu.add("Eliminar Cliente existente");
        opciones_menu.add("Modificar datos de Cliente");
        opciones_menu.add("Gestionar Vehiculos de Cliente por DNI");
        opciones_menu.add("Ir al menu anterior");
    }
    
    
    
    public void Menu_enc_2()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos");
        opciones_menu.add("Comprobar estado de Revisiones");
        opciones_menu.add("Operaciones con Promociones Comerciales");
    }
    
    public void Menu_enc_3()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos");
        opciones_menu.add("Comprobar estado de Revisiones");
        opciones_menu.add("Operaciones con Promociones Comerciales");
    }
    
    public void Menu_enc_4()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos");
        opciones_menu.add("Comprobar estado de Revisiones");
        opciones_menu.add("Operaciones con Promociones Comerciales");
    }
    
    public void Menu_enc_5()
    {
        opciones_menu.add("Operaciones con Trabajadores dentro de la Base de Datos");
        opciones_menu.add("Operaciones con Clientes dentro de la Base de Datos");
        opciones_menu.add("Operaciones con tareas de Comerciales o Mecanicos");
        opciones_menu.add("Comprobar estado de Revisiones");
        opciones_menu.add("Operaciones con Promociones Comerciales");
    }

    /**
     * RESUMEN_1: Metodo para sacar en pantalla las opciones de un Menu
     */
    public void print()
    {
        int i = 1;
        System.out.println("¿Que desea hacer?:");
        for(String opcion : opciones_menu){
            System.out.println("    (" + i + ")" + " - " + opcion);
            i++;
        }
        System.out.println("    (s)" + " - Salir");
    }
}
