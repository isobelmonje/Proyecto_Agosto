
/**
 * Write a description of class Formulario_Taller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;


public class Formulario_Taller
{
    public static void main (String[]args){
        /**
         * Creamos objeto Input para usarlo cada vez que haya que introducir datos
         */
        Input input = new Input();
              
        /**
        * Creamos un Encargado para la tienda
        */
        Encargado Encargado1 = new Encargado();
        Encargado1.Modificar_DNI("50547750K");
        Encargado1.Modificar_telefono("662843085");
        Encargado1.Modificar_direccion("Paseo de Extremadura 87, 2D");
        Encargado1.Modificar_nombre("Pedro");
        Encargado1.Modificar_primer_apellido("Rios");
        Encargado1.Modificar_segundo_apellido("Montalván");
        Encargado1.Modificar_fecha_de_nacimiento("01/01/1990");
        Encargado1.Modificar_fecha_alta_en_la_base("01/01/2015");
        
        
        System.out.println("Bienvenido al taller Javeano");
        System.out.println("");
        input.F_input("Identifiquese como Encargado/a(e), comercial(c) o mecánico(m). Pulse cualquier otra cosa para salir");
        String Respuesta = input.Input();
        if (input.Input().equals("e")){
            System.out.println("Muy buenas encargado/a");
        }
        else if (input.Input().equals("c")){
            System.out.println("Muy buenas comercial");
        }
        else if (input.Input().equals("m")){
            System.out.println("Muy buenas mecánico/a");
        }
        else{
            System.out.println("Adios");
        }
        
   
        
        
        System.out.println("El encargado tiene turno de: " + Encargado1.turno());
        System.out.println("El encargado tiene DNI: " + Encargado1.DNI());
        System.out.println(Respuesta);
    
    }
}
