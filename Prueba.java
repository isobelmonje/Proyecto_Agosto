
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
    
    public static void main (String[]args)
    {
        // Creamos la base de datos del programa y variables de Log in
        Datos_BD bd = new Datos_BD();
        String tipo_trabajador;
        String DNI;
        String password;
    
        // Creamos objeto Input para usarlo cada vez que haya que introducir datos
        Input input = new Input();
        
        // Bienvenida al Taller
        new Prueba().bienvenida_and_initial_prompt(); // void para dar la bienvenida
        tipo_trabajador = input.invocar();
        
        if(tipo_trabajador.equals("e") || tipo_trabajador.equals("c") || tipo_trabajador.equals("m")){
            Trabajador trabajador = new Trabajador();
        }
        else{
            System.exit(0);
        }
        
        // Log in section and validation
        System.out.println("Please enter your DNI");
        DNI = input.invocar();
        System.out.println("Please enter your password");
        password = input.invocar();
        System.out.println(DNI + "   " + password);
        
    }
    
    private void bienvenida_and_initial_prompt()
    {
        System.out.println("Bienvenido al taller Javeano");
        System.out.println("Si usted no es un trabajador activo no podrá acceder al sistema...");
        System.out.println("");
        System.out.println("Por favor identifiquese como:");
        System.out.println("    - Encargado (e)");
        System.out.println("    - Comercial (c)");
        System.out.println("    - Mecanico (m)");
        System.out.println("Seleccione cualquier otra cosa para salir...");
    }
}