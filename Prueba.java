
/**
 * Write a description of class Prueba1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;
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
        
        // Opciones Despues de validar
        new Prueba().prompt_despues_de_validar();
               
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
    
    private void prompt_despues_de_validar(){
        if(trabajador.tipo_trabajador().toLowerCase().equals("encargado")){
            System.out.println("¿Que desea hacer?:");
            System.out.println("  (1) - Operaciones con Trabajadores dentro de la Base de Datos");
            System.out.println("  (2) - Operaciones con Clientes dentro de la Base de Datos");
            System.out.println("  (3) - Operaciones con tareas de Comerciales o Mecanicos");
            System.out.println("  (4) - Comprobar estado de Revisiones");
            System.out.println("  (5) - Operaciones con Promociones Comerciales");
            System.out.println("  (6) - Salir");
        }
        else if(trabajador.tipo_trabajador().toLowerCase().equals("comercial")){
            System.out.println("¿Que desea hacer?:");
            System.out.println("  (1) - Ver Promociones Actuales");
            System.out.println("  (2) - Operaciones con Clientes dentro de la Base de Datos");
            System.out.println("  (3) - Salir");
        }
        else{
            System.out.println("¿Que desea hacer?:");
            System.out.println("  (1) - Operaciones con Tareas Asignadas");
            System.out.println("  (2) - Salir");
        }
    }
}