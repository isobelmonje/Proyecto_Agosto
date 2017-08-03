
/**
 * Write a description of class Prueba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;

public class Prueba
{
    public static void main (String[]args){ 
       // Bienvenida al Taller
       System.out.println("Bienvenido al taller Javeano");
       System.out.println("");
       
       // Creamos objeto Input para usarlo cada vez que haya que introducir datos
       Input input = new Input();
      
      new Prueba().creacion_bd();
           
       /** 
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
       **/
    
    }
   
    
    private void creacion_bd()
    {
        // Creamos Array_lists para guardar los datos de encargados, comerciales, mecanicos, clientes
        // y vehiculos
        
        // ENCARGADOS:
        int num_enc = 5;
        int columnas = 8;
        Encargado encargado;
        encargado = new Encargado();
       
        // DNI de encargados:
        String[][] datos_per_enc = new String[columnas][num_enc];
        datos_per_enc[0][0] = "11111111A";
        datos_per_enc[0][1] = "22222222B";
        datos_per_enc[0][2] = "33333333C";
        datos_per_enc[0][3] = "44444444D";
        datos_per_enc[0][4] = "55555555E";
        
        // Telefonos personales de encargados:
        datos_per_enc[1][0] = "121232343";
        datos_per_enc[1][1] = "232343454";
        datos_per_enc[1][2] = "343454565";
        datos_per_enc[1][3] = "454565676";
        datos_per_enc[1][4] = "565676787";
        
        // Direccion de encargados:
        datos_per_enc[2][0] = "Madrid";
        datos_per_enc[2][1] = "Madrid";
        datos_per_enc[2][2] = "Galicia";
        datos_per_enc[2][3] = "Andalucia";
        datos_per_enc[2][4] = "Cataluña";
        
        // Nombre de encargados:
        datos_per_enc[3][0] = "Pablo";
        datos_per_enc[3][1] = "Pedro";
        datos_per_enc[3][2] = "Mariano";
        datos_per_enc[3][3] = "Alberto";
        datos_per_enc[3][4] = "Albert";
        
        // Primer apellido de encargados:
        datos_per_enc[4][0] = "Iglesias";
        datos_per_enc[4][1] = "Sanchez";
        datos_per_enc[4][2] = "Rajoy";
        datos_per_enc[4][3] = "Garzon";
        datos_per_enc[4][4] = "Rivera";
        
        // Segundo Apellido de encargados:
        datos_per_enc[5][0] = "Turrion";
        datos_per_enc[5][1] = "Castejon";
        datos_per_enc[5][2] = "Brey";
        datos_per_enc[5][3] = "Espinosa";
        datos_per_enc[5][4] = "Diaz";
        
        // Fecha de nacimiento de encargados:
        datos_per_enc[6][0] = "01/01/1981";
        datos_per_enc[6][1] = "02/02/1982";
        datos_per_enc[6][2] = "03/03/1983";
        datos_per_enc[6][3] = "04/04/1984";
        datos_per_enc[6][4] = "05/05/1985";
        
        // Fecha de alta de encargados:
        datos_per_enc[7][0] = "01/01/2001";
        datos_per_enc[7][1] = "02/02/2002";
        datos_per_enc[7][2] = "03/03/2003";
        datos_per_enc[7][3] = "04/04/2004";
        datos_per_enc[7][4] = "05/05/2005";
     
       
       for (int i = 0; i <5; i++){
           encargado.modificar_DNI(datos_per_enc[0][i]);
           encargado.modificar_tlfn_per(datos_per_enc[1][i]);
           encargado.modificar_direccion(datos_per_enc[2][i]);
           encargado.modificar_nombre(datos_per_enc[3][i]);
           encargado.modificar_primer_apellido(datos_per_enc[4][i]);
           encargado.modificar_segundo_apellido(datos_per_enc[5][i]);
           encargado.modificar_fecha_de_nacimiento(datos_per_enc[6][i]);
           encargado.modificar_fecha_alta(datos_per_enc[7][i]);

           encargado.resumen_persona();
           System.out.println("");
           System.out.println("");
           
           
           
          // encargado.modificar_ID_encargado(i+1);
      
           
           //System.out.println("El encargado es:" + encargado.ID_encargado());
           //System.out.println(datos_per_enc[0][i]);
           //System.out.println(datos_per_enc[1][i]);
           //System.out.println(datos_per_enc[2][i]);
        }
       
       //List<Integer> ID_enc = new ArrayList<>();
       //ID_enc.add(1);
       //ID_enc.add(1);
       //ID_enc.add(1);
       
       // Creamos objetos de todos los tipos
    }
}