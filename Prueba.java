import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Prueba1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Prueba
{
    // Declaramos y creamos la base de datos de forma Global
    private static Datos_BD bd = new Datos_BD();
     // Declaramos y creamos objeto Input para usarlo cada vez que haya que introducir datos
    private static Input input = new Input();
    
    // Declaramos las variables de Log in
    private static boolean exit = false;
    private static String tipo_trabajador;
    private static String DNI;
    private static String password;
    private static boolean validation;
    
    // Declaramos las variables de Menu
    private static Menu menu;
    private static boolean menu_activo = true;
    private static String respuesta = "0";
    
    // Declaramos el objeto trabajador para almacenar el usuario activo
    private static Trabajador trabajador;
    
    public static void main (String[]args)
    {      
        // Bienvenida al Taller 
        new Prueba().bienvenida();
        
        // Log in section and validation or exit
        while(exit == false){
            new Prueba().login_validation_or_exit();
        }
        
        // Entrada a Menu de Trabajador
        while(menu_activo == true){
            menu = new Menu(trabajador.tipo_trabajador(), respuesta);
            menu.print();
            respuesta = input.invocar();
            if(respuesta.equals("s")){menu_activo = false;}
            
        }
        
    }
    
    private void bienvenida(){
        System.out.println("Bienvenido al taller Javeano");
        System.out.println("Si usted no es un trabajador activo no podrá acceder al sistema...");
        System.out.println("");
    }
          
    private void login_validation_or_exit(){
        System.out.println("Por favor identifiquese como:");
        System.out.println("    - Encargado (e)");
        System.out.println("    - Comercial (c)");
        System.out.println("    - Mecanico (m)");
        System.out.println("Seleccione cualquier otra cosa para salir...");
        tipo_trabajador = input.invocar();
        System.out.println("");
        
        if(tipo_trabajador.equals("e") || tipo_trabajador.equals("c") || tipo_trabajador.equals("m")){
            trabajador = new Trabajador();
            if(tipo_trabajador.equals("e")){tipo_trabajador = "encargado";}
            else if(tipo_trabajador.equals("c")){tipo_trabajador = "comercial";}
            else{tipo_trabajador = "mecanico";}
            
            System.out.println("Please enter your DNI");
            DNI = input.invocar();
            System.out.println("Please enter your password");
            password = input.invocar();
            System.out.println("");
            trabajador = bd.comprobar_trabajador(DNI);
            
            if (trabajador.DNI().equals("N/A")){
                System.out.println("ACCESO DENEGADO!! Por favor revise sus credenciales");
                System.out.println("");
                }
            else if(trabajador.password().equals(password) && trabajador.tipo_trabajador().equals(tipo_trabajador)){
                String bienvenida_usuario = "# Bienvenido: " + trabajador.nombre() + " " + trabajador.primer_apellido() + 
                                            " (" + tipo_trabajador.toUpperCase() + ") " + "#";
                String asterisco_bienvenida = "";
                int limit = bienvenida_usuario.length();
                for (int i = 0; i < limit; i++){asterisco_bienvenida = asterisco_bienvenida + "#";} 
                
                System.out.println(asterisco_bienvenida);
                System.out.println(bienvenida_usuario);
                System.out.println(asterisco_bienvenida);
                
                System.out.println("");
                exit =true;
            }
            else{
                System.out.println("ACCESO DENEGADO!! Por favor revise sus credenciales");
                System.out.println("");
            }
        }
        else{
            System.out.println("Hasta la Proxima");
            System.exit(0);
        }
    }
    
    // private void menu_encargado_2(){
        // System.out.println("¿Que desea hacer?:");
        // System.out.println("  (1) - Ver Resumen de Todos los Clientes");
        // System.out.println("  (2) - Ver Resumen de Cliente por DNI");
        // System.out.println("  (2) - Añadir Cliente");
        // System.out.println("  (2) - Eliminar Cliente existente");
        // System.out.println("  (2) - Modificar datos de Cliente");
        // System.out.println("  (2) - Gestionar Vehiculos de Cliente por DNI");
        // System.out.println("  (2) - Ir al menu anterior");
        // System.out.println("  (2) - Salir del programa");
    // }
    
}