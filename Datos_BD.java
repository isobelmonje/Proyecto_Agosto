
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
    private ArrayList<Trabajador> lista_trabajadores;
    private ArrayList<Cliente> lista_clientes;
    private ArrayList<Vehiculo> lista_vehiculos;

     /**
     * CONSTRUCTOR_1: Construye Base de Datos para todos los objetos
     */
    public Datos_BD()
    {
        lista_trabajadores = new ArrayList<Trabajador>();
        lista_clientes = new ArrayList<Cliente>();
        lista_vehiculos = new ArrayList<Vehiculo>() ;
        
        rellena_trabajadores_iniciales();
    }
    
    /**
     * MODIFICADOR_1.1.1: Metodos para añadir nuevos Encargados a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_trabajador(String DNI, int tlfn_personal, String direccion, String nombre, 
                                String primer_apellido, String segundo_apellido, String fecha_nacimiento, 
                                String fecha_alta, int ID_trabajador, int tlfn_empresa, 
                                String tipo_trabajador, String turno, String password)
    {
        Trabajador trabajador = new Trabajador(DNI, tlfn_personal, direccion, nombre, primer_apellido,
                                                segundo_apellido, fecha_nacimiento, fecha_alta,
                                                ID_trabajador, tlfn_empresa, tipo_trabajador, turno,
                                                password);
        lista_trabajadores.add(trabajador);
    }
    
    /**
     * MODIFICADOR_1.1.2: Metodos para añadir nuevos Encargados a la Base de Datos pasando un objeto
     * Trabajador() previamente creado
     */
    public void nuevo_trabajador(Trabajador trabajador)
    {
        lista_trabajadores.add(trabajador);
    }
    
    /**
    * ACCESOR_2: Metodo para verificar si existe un trabajador especifico en la BD por DNI y devolverlo
    */
    public Trabajador comprobar_trabajador(String DNI)
    {
        Trabajador trabajador = new Trabajador();
        
        for(Trabajador trabajador_loop : lista_trabajadores){
           if (trabajador_loop.DNI().toLowerCase().equals(DNI.toLowerCase())){
               trabajador = trabajador_loop;
               break;
           }
        }
        return trabajador;
    }
    
    
    
    /**
     * RESUMEN_1.1: Metodo para sacar un resumen de un Trabajador particular, excepto password
     */
    public void resumen_trabajador_especifico_s_passwd(int ID_enc)
    {
        lista_trabajadores.get(ID_enc).resumen_trabajador_completo_s_passwd();
    }
    
    /**
     * RESUMEN_1.1: Metodo para sacar un resumen de un Trabajador particular completo
     */
    public void resumen_trabajador_especifico_c_passwd(int ID_enc)
    {
        lista_trabajadores.get(ID_enc).resumen_trabajador_completo_c_passwd();
    }
    
    /**
     * RESUMEN_1.2: Metodo para sacar un resumen de todos los Trabajadores
     */
    public void resumen_todos_trabajadores()
    {
        for(Trabajador trabajador : lista_trabajadores){
            trabajador.resumen_trabajador_completo_s_passwd();
        }
    }
    
    /**
     * AYUDANTE_1: Metodo para crear los trabajadores iniciales de la base de datos
     */       
    private void rellena_trabajadores_iniciales()
    {      
        nuevo_trabajador("11111111A", 662872195, "Madrid", "Pablo", "Iglesias", 
                        "Turrion", "01/01/1981", "01/01/2001", 1, 121232343, 
                        "encargado", "mañana", "1111");

        nuevo_trabajador("22222222B", 662872195, "Madrid", "Pedro", "Sanchez", 
                        "Castejón", "02/02/1982", "02/02/2002", 2, 232343454, 
                        "comercial", "tarde", "2222");
        
        nuevo_trabajador("33333333C", 662872195, "Galicia", "Mariano", "Rajoy", 
                        "Brey", "03/03/1983", "03/03/2003", 3, 343454565, 
                        "mecanico", "mañana", "3333");
                        
        nuevo_trabajador("44444444D", 662872195, "Andalucia", "Alberto", "Garzón", 
                        "Espinosa", "04/04/1984", "04/04/2004", 4, 454565676, 
                        "comercial", "tarde", "4444");
        
        nuevo_trabajador("55555555E", 662872195, "Cataluña", "Albert", "Rivera", 
                        "Diaz", "05/05/1985", "05/05/2005", 5, 565676787,
                        "mecanico", "fin de semana", "5555");
    }
}
