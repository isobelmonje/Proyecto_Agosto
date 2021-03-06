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
            
            if(trabajador.tipo_trabajador().toLowerCase().equals("encargado")){
                if(respuesta.equals("s")){
                    System.out.println("Hasta la Proxima");
                    System.exit(0); //menu_activo = false;
                }
            
                // ********** ENCARGADO **********
            
                // Trabajador
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
                
                else if(respuesta.equals("0.1.5")){     //Modificar datos de Trabajador por DNI (0.1.5)
                    bd.modificar_trabajador_prompt();
                    respuesta = "0.1";
                }
                
                // ********** CLIENTE **********
                
                else if(respuesta.equals("0.2.1")){     //Ver Resumen de Todos los Clientes (0.2.1)
                    bd.resumen_todos_clientes();
                    respuesta = "0.2";
                }
            
                else if(respuesta.equals("0.2.2")){     //Ver Resumen de Cliente por DNI (0.2.2)
                    Cliente cliente_0_2_2 = new Cliente();
                    cliente_0_2_2 = bd.comprobar_cliente_prompt();
                    if(!cliente_0_2_2.DNI().equals("N/A")){
                        cliente_0_2_2.resumen_cliente();
                    }
                    respuesta = "0.2";
                }
                
                else if(respuesta.equals("0.2.3")){     //Añadir Cliente (0.2.3)
                    bd.nuevo_cliente_prompt();
                    respuesta = "0.2";
                }
                
                else if(respuesta.equals("0.2.4")){     //Eliminar Cliente existente por DNI (0.2.4)
                    bd.eliminar_cliente_prompt();
                    respuesta = "0.2";
                }
                
                else if(respuesta.equals("0.2.5")){     //Modificar datos de Cliente por DNI (0.2.5)
                    bd.modificar_cliente_prompt();
                    respuesta = "0.2";
                }
                
                else if(respuesta.equals("0.2.6")){     //Ver Vehiculos de Cliente por DNI (0.2.6)
                    bd.resumen_todos_vehiculos_por_cliente();
                    respuesta = "0.2";
                }
            
                // ********** VEHICULOS **********
                
                else if(respuesta.equals("0.3.1")){     //Ver Resumen de Vehiculo por matricula (0.3.1)
                    Vehiculo vehiculo_0_3_1 = new Vehiculo();
                    vehiculo_0_3_1 = bd.comprobar_vehiculo_prompt();
                    if(!vehiculo_0_3_1.matricula().equals("N/A")){
                        vehiculo_0_3_1.resumen_vehiculo();
                    }
                    respuesta = "0.3";
                }
                
                else if(respuesta.equals("0.3.2")){     //Añadir Vehiculo a cliente por DNI (0.3.2)
                    int DNI_cliente_0_3_2 = 0;
                    
                    while(DNI_cliente_0_3_2 == 0){
                        DNI_cliente_0_3_2 = bd.comprobar_cliente_prompt().ID_cliente();
                    }
                    
                    bd.nuevo_vehiculo_de_cliente_prompt(DNI_cliente_0_3_2);
                    respuesta = "0.3";
                }
                
                else if(respuesta.equals("0.3.3")){     //Eliminar Vehiculo existente por matricula (0.3.3)
                    bd.eliminar_vehiculo_prompt();
                    respuesta = "0.3";
                }
                
                else if(respuesta.equals("0.3.4")){     //Modificar datos de Vehiculo por matricula (0.3.4)
                    bd.modificar_vehiculo_prompt();
                    respuesta = "0.3";
                }
            
                // ********** TAREAS **********
                
                else if(respuesta.equals("0.4.1")){     //Añadir Tarea a Comercial (0.4.1)
                    bd.nueva_ficha_prompt("comercial");
                    respuesta = "0.4";
                }
                
                else if(respuesta.equals("0.4.2")){     //Añadir Tarea a Mecanico (0.4.2)
                    bd.nueva_ficha_prompt("mecanico");
                    respuesta = "0.4";
                }
                
                else if(respuesta.equals("0.4.3")){     //Resumen Tareas (0.4.2)
                    bd.resumen_tareas();
                    respuesta = "0.4";
                }
                
                else{respuesta_cache = respuesta;}
            }
            
            else{
                if(respuesta.equals("s")){
                    System.out.println("Hasta la Proxima");
                    System.exit(0); //menu_activo = false;
                }
            
                else if(respuesta.equals("0.1")){     //Ver Tareas Pendientes (0.1)
                    bd.resumen_tareas_DNI(trabajador.DNI());
                    respuesta = "0";
                }
                
                else if(respuesta.equals("0.2")){     //Añadir Tareas por ID de Ficha (0.2)
                    bd.nueva_tarea_DNI(trabajador.DNI());
                    respuesta = "0";
                }
            
                else if(respuesta.equals("0.3")){     //Cerrar Tareas por ID de Ficha (0.3)
                    bd.cerrar_tarea_DNI(trabajador.DNI());
                    respuesta = "0";
                }
                
                else if(respuesta.equals("0.4")){     //Eliminar Trabajador existente por DNI (0.4)
                    bd.eliminar_trabajador_prompt(trabajador.DNI());
                    respuesta = "0";
                }
                
                else{respuesta_cache = respuesta;}
            }
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