
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
    public static void main (String[]args)
    { 
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
        int string_columnas = 8;
        int integer_columnas = 3;
        Encargado encargado;
        encargado = new Encargado();
        
        // STRINGS de encargados:
        String[][] String_data_enc = new String[string_columnas][num_enc];
        
        // DNI de encargados;
        String_data_enc[0][0] = "11111111A";
        String_data_enc[0][1] = "22222222B";
        String_data_enc[0][2] = "33333333C";
        String_data_enc[0][3] = "44444444D";
        String_data_enc[0][4] = "55555555E";
        
        // Direccion de encargados:
        String_data_enc[1][0] = "Madrid";
        String_data_enc[1][1] = "Madrid";
        String_data_enc[1][2] = "Galicia";
        String_data_enc[1][3] = "Andalucia";
        String_data_enc[1][4] = "Cataluña";
        
        // Nombre de encargados:
        String_data_enc[2][0] = "Pablo";
        String_data_enc[2][1] = "Pedro";
        String_data_enc[2][2] = "Mariano";
        String_data_enc[2][3] = "Alberto";
        String_data_enc[2][4] = "Albert";
        
        // Primer apellido de encargados:
        String_data_enc[3][0] = "Iglesias";
        String_data_enc[3][1] = "Sanchez";
        String_data_enc[3][2] = "Rajoy";
        String_data_enc[3][3] = "Garzon";
        String_data_enc[3][4] = "Rivera";
        
        // Segundo Apellido de encargados:
        String_data_enc[4][0] = "Turrion";
        String_data_enc[4][1] = "Castejon";
        String_data_enc[4][2] = "Brey";
        String_data_enc[4][3] = "Espinosa";
        String_data_enc[4][4] = "Diaz";
        
        // Fecha de nacimiento de encargados:
        String_data_enc[5][0] = "01/01/1981";
        String_data_enc[5][1] = "02/02/1982";
        String_data_enc[5][2] = "03/03/1983";
        String_data_enc[5][3] = "04/04/1984";
        String_data_enc[5][4] = "05/05/1985";
        
        // Fecha de alta de encargados:
        String_data_enc[6][0] = "01/01/2001";
        String_data_enc[6][1] = "02/02/2002";
        String_data_enc[6][2] = "03/03/2003";
        String_data_enc[6][3] = "04/04/2004";
        String_data_enc[6][4] = "05/05/2005";
        
        // Fecha de alta de encargados:
        String_data_enc[7][0] = "mañana";
        String_data_enc[7][1] = "tarde";
        String_data_enc[7][2] = "mañana";
        String_data_enc[7][3] = "tarde";
        String_data_enc[7][4] = "fin de semana";
        
        
        // INTEGERS de encargados:
        int[][] int_data_enc = new int[integer_columnas][num_enc];
                     
        // Telefono personal de encargados:
        int_data_enc[0][0] = 121232343;
        int_data_enc[0][1] = 232343454;
        int_data_enc[0][2] = 343454565;
        int_data_enc[0][3] = 454565676;
        int_data_enc[0][4] = 565676787;
        
        // ID_trabajador de encargados:
        int_data_enc[1][0] = 1;
        int_data_enc[1][1] = 2;
        int_data_enc[1][2] = 3;
        int_data_enc[1][3] = 4;
        int_data_enc[1][4] = 5;
        
        // Telefono de trabajo de encargados:
        int_data_enc[2][0] = 666555001;
        int_data_enc[2][1] = 666555002;
        int_data_enc[2][2] = 666555002;
        int_data_enc[2][3] = 666555002;
        int_data_enc[2][4] = 666555002;
        
        
       
        for (int i = 0; i <5; i++){
            encargado.modificar_DNI(String_data_enc[0][i]);
            encargado.modificar_direccion(String_data_enc[1][i]);
            encargado.modificar_nombre(String_data_enc[2][i]);
            encargado.modificar_primer_apellido(String_data_enc[3][i]);
            encargado.modificar_segundo_apellido(String_data_enc[4][i]);
            encargado.modificar_fecha_de_nacimiento(String_data_enc[5][i]);
            encargado.modificar_fecha_alta(String_data_enc[6][i]);
            encargado.modificar_turno(String_data_enc[7][i]);
           
            encargado.modificar_tlfn_per(int_data_enc[0][i]);
            encargado.modificar_ID_trabajador(int_data_enc[1][i]);
            encargado.modificar_tlfn_empresa(int_data_enc[2][i]);

            encargado.resumen_trabajador_completo();
            System.out.println("");
            System.out.println("");
           
           
           
            // encargado.modificar_ID_encargado(i+1);
      
           
            //System.out.println("El encargado es:" + encargado.ID_encargado());
            //System.out.println(String_data_enc[0][i]);
            //System.out.println(String_data_enc[1][i]);
            //System.out.println(String_data_enc[2][i]);
        }
       
        //List<Integer> ID_enc = new ArrayList<>();
        //ID_enc.add(1);
        //ID_enc.add(1);
        //ID_enc.add(1);
       
        // Creamos objetos de todos los tipos
    }
}