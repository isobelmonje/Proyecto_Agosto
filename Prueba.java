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
    private static String respuesta_cache = "0";
    private static String DNI_menu = "";
    private static boolean zero = true;
    
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
            if(respuesta.equals("0")){zero = true;}
            else{zero = false;}
            menu.print(zero);
            
            respuesta = input.invocar();
            System.out.println("");
            respuesta = new Prueba().traductor_a_menu(respuesta_cache, respuesta);
            
            if(respuesta.equals("s")){
                System.out.println("Hasta la Proxima");
                System.exit(0); //menu_activo = false;
            }
            
            else if(respuesta.equals("0.1.1")){     //Ver Resumen de Todos los Trabajadores (0.1.1)
                bd.resumen_todos_trabajadores();
                respuesta = "0.1";
            }
            
            else if(respuesta.equals("0.1.2")){     //Ver Resumen de Trabajador por DNI (0.1.2)
                Trabajador trabajador_0_1_2 = new Trabajador();
                trabajador_0_1_2 = bd.comprobar_trabajador_prompt();
                if(!trabajador_0_1_2.DNI().equals("N/A")){
                    trabajador_0_1_2.resumen_trabajador_completo_s_passwd();
                }
                respuesta = "0.1";
            }
            
            else if(respuesta.equals("0.1.3")){     //Añadir Trabajador (0.1.3)
                bd.nuevo_trabajador_prompt();
                respuesta = "0.1";
            }
            
            else if(respuesta.equals("0.1.4")){     //Eliminar Trabajador existente por DNI (0.1.4)
                bd.eliminar_trabajador_prompt(trabajador.DNI());
                respuesta = "0.1";
            }
            
            else if(respuesta.equals("0.1.5")){     //Modificar Trabajador existente por DNI (0.1.5)
                bd.modificar_trabajador_prompt();
                respuesta = "0.1";
            }
            
            else{respuesta_cache = respuesta;}
            

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
    
    private String traductor_a_menu(String entr_acum, String entr){
        if (entr.equals("0") || entr.toLowerCase().equals("s")){return entr;}
        else if (entr.toLowerCase().equals("r")){
            boolean point = false;
            int i = entr_acum.length();
            while(point == false && i > 0){
                
                if(entr_acum.substring(i-1, i).equals(".")){
                    entr_acum = entr_acum.substring(0,i-1);
                    point = true;
                }
                else{
                    entr_acum = entr_acum.substring(0,i-1);
                }
                i--;
            }
            return entr_acum;
        }
        else{
            return entr_acum + "." + entr;
        }
    }
}