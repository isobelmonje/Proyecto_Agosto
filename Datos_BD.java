
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
     * MODIFICADOR_1.1.1: Metodos para añadir nuevos Encargados a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_encargado(String DNI, String direccion, String nombre, String primer_apellido, 
                                String segundo_apellido, String fecha_nacimiento, String fecha_alta, 
                                String turno, int tlfn_personal, int tlfn_empresa, int ID_trabajador, 
                                int ID_encargado)
    {
        Encargado encargado = new Encargado();
        
        encargado.modificar_ID_encargado(DNI, direccion, nombre, primer_apellido, 
                                segundo_apellido, fecha_nacimiento, fecha_alta, 
                                turno, tlfn_personal, tlfn_empresa, ID_trabajador, 
                                ID_encargado);
                                
        lista_encargados.add(encargado);
    }
    
    /**
     * MODIFICADOR_1.1.2: Metodos para añadir nuevos Encargados a la Base de Datos pasando un objeto
     * Encargado() previamente creado
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
        nuevo_encargado("11111111A", "Madrid", "Pablo", "Iglesias", 
                        "Turrion", "18/01/1987", "01/01/2001", "mañana", 
                        121232343, 662872195, 1, 101);

        nuevo_encargado("22222222B", "Madrid", "Pedro", "Sanchez", 
                        "Castejón", "01/01/1981", "02/02/2002", "tarde", 
                        232343454, 662872195, 2, 202);
        
        nuevo_encargado("33333333C", "Galicia", "Mariano", "Rajoy", 
                        "Brey", "03/03/1983", "03/03/2003", "mañana", 
                        343454565, 662872195, 3, 303);
                        
        nuevo_encargado("44444444D", "Andalucia", "Alberto", "Garzón", 
                        "Espinosa", "04/04/1984", "04/04/2004", "tarde", 
                        454565676, 662872195, 4, 404);
        
        nuevo_encargado("55555555E", "Cataluña", "Albert", "Rivera", 
                        "Diaz", "05/05/1985", "05/05/2005", "fin de semana", 
                        565676787, 662872195, 5, 505);
    }
}
