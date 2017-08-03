
/**
 * Clase para crear los ArrayList donde se almacenarán todos los datos.
 *
 * @author (Froylán Málaga)
 * @version (V.00)
 */

import java.util.ArrayList;

public class Datos_BD
{
    // Creando los ArrayList donde se almacenarán: encargados, comerciales, mecánicos, personas y vehículos
    private ArrayList<Encargado> lista_encargados;
    private ArrayList<Comercial> lista_comerciales;
    private ArrayList<Mecanico> lista_mecanicos;
    private ArrayList<Cliente> lista_clientes;
    private ArrayList<Vehiculo> lista_vehiculos;

     /**
     * CONSTRUCTOR_1: Construye Base de Datos para todos los objetos
     */
    public Datos_BD()
    {
        lista_encargados = new ArrayList<Encargado>();
        lista_comerciales = new ArrayList<Comercial>();
        lista_mecanicos = new ArrayList<Mecanico>();
        lista_clientes = new ArrayList<Cliente>();
        lista_vehiculos = new ArrayList<Vehiculo>() ;
        
        rellena_encargados_iniciales();
    }
    
    /**
     * MODIFICADOR_1.1: Metodos para añadir nuevos Encargados a la Base de Datos
     */
    public void nuevo_encargado(Encargado encargado)
    {
        lista_encargados.add(encargado);
    }
    
    
    /**
     * RESUMEN_1.1: Metodos para sacar un resumen de un Encargado particular
     */
    public void resumen_encargado_especifico(int ID_enc)
    {
        lista_encargados.get(ID_enc).resumen_encargado_completo();
    }
    
    /**
     * RESUMEN_1.2: Metodos para sacar un resumen de todos los Encargados
     */
    public void resumen_todos_encargados()
    {
        for(Encargado encargado : lista_encargados){
            encargado.resumen_encargado_completo();
        }
    }
    
    
      
    private void rellena_encargados_iniciales()
    {
        int num_enc = 5;
        int string_columnas = 8;
        int integer_columnas = 4;
        Encargado encargado;
                
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
        int_data_enc[2][2] = 666555003;
        int_data_enc[2][3] = 666555004;
        int_data_enc[2][4] = 666555005;
        
        // ID_encargado de encargados:
        int_data_enc[3][0] = 101;
        int_data_enc[3][1] = 102;
        int_data_enc[3][2] = 103;
        int_data_enc[3][3] = 104;
        int_data_enc[3][4] = 105;
        
        
        for (int i = 0; i <num_enc; i++){
            encargado = new Encargado();
            
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
            encargado.modificar_ID_encargado(int_data_enc[3][i]);

            lista_encargados.add(encargado);
        }
    }
}
