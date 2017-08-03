
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
        // Bienvenida al Taller
        System.out.println("Bienvenido al taller Javeano");
        System.out.println("");
    
        // Creamos objeto Input para usarlo cada vez que haya que introducir datos
        Input input = new Input();
        Datos_BD bd = new Datos_BD();
        bd.resumen_todos_encargados();
    }
}