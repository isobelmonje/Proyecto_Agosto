
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
    private Input input = new Input();

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
    
    //AÑADIR TRABAJADORES A BASE DE DATOS
    
    /**
     * MODIFICADOR_1.1.1a: Metodos para añadir nuevos Encargados a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_trabajador(String DNI, int tlfn_personal, String direccion, String nombre, 
                                String primer_apellido, String segundo_apellido, String fecha_nacimiento, 
                                String fecha_alta, int ID_trabajador, int tlfn_empresa, 
                                String tipo_trabajador, String turno, String password)
    {
        if(comprobar_trabajador(DNI).DNI().equals("N/A")){
            Trabajador trabajador = new Trabajador(DNI, tlfn_personal, direccion, nombre, primer_apellido, 
                                                    segundo_apellido, fecha_nacimiento, fecha_alta, 
                                                    ID_trabajador, tlfn_empresa, tipo_trabajador, 
                                                    turno, password);
            lista_trabajadores.add(trabajador);
        }
        else{
            System.out.println("El usuario con DNI " + DNI + " ya existe en la base de datos");
        }
    }
    
    /**
     * MODIFICADOR_1.1.1b: Metodos para añadir nuevos Encargados a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_trabajador_prompt()
    {
        System.out.println("Por favor introduzca los datos del Nuevo trabajador:");
        System.out.println("");
        
        boolean DNI_existe = true;
        
        while(DNI_existe == true){
            System.out.println("DNI:");
            String DNI = input.invocar();
            System.out.println("");
            
            if(comprobar_trabajador(DNI).DNI().equals("N/A")){
                DNI_existe = false;
                
                System.out.println("Telefono Personal:");
                int tlfn_personal = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Direccion:");
                String direccion = input.invocar();
                System.out.println("");
                System.out.println("Nombre:");
                String nombre = input.invocar();
                System.out.println("");
                System.out.println("Primer Apellido:");
                String primer_apellido = input.invocar();
                System.out.println("");
                System.out.println("Segundo Apellido:");
                String segundo_apellido = input.invocar();
                System.out.println("");
                System.out.println("Fecha de Nacimiento:");
                String fecha_nacimiento = input.invocar();
                System.out.println("");
                System.out.println("Fecha de Alta:");
                String fecha_alta = input.invocar();
                System.out.println("");
                System.out.println("ID del trabajador:");
                int ID_trabajador = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Telefono de Empresa:");
                int tlfn_empresa = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Tipo de Trabajador:");
                String tipo_trabajador = input.invocar();
                System.out.println("");
                System.out.println("Turno:");
                String turno = input.invocar();
                System.out.println("");
                System.out.println("Password:");
                String password = input.invocar();
                System.out.println("");
                Trabajador trabajador = new Trabajador(DNI, tlfn_personal, direccion, nombre, primer_apellido,
                                                segundo_apellido, fecha_nacimiento, fecha_alta,
                                                ID_trabajador, tlfn_empresa, tipo_trabajador, turno,
                                                password);
                lista_trabajadores.add(trabajador);
                System.out.println("El trabajador ha sido agregado con exito!!");
                System.out.println("");
            }
            else{
                System.out.println("El DNI ya existe en la base de Datos, por favor introduzca otro");
            }
        }
    }
    
    /**
     * MODIFICADOR_1.1.1c: Metodo para añadir un nuevo Trabajador a la Base de Datos pasando un objeto
     * Trabajador() previamente creado
     */
    public void nuevo_trabajador(Trabajador trabajador)
    {
        String DNI = trabajador.DNI();
        if(comprobar_trabajador(DNI).DNI().equals("N/A")){
            lista_trabajadores.add(trabajador);
        }
        else{
            System.out.println("El usuario con DNI " + DNI + " ya existe en la base de datos");
        }
    }
    
    //ELIMINAR TRABAJADORES DE BASE DE DATOS
    
        /**
     * MODIFICADOR_1.1.2a: Metodos para ELIMINAR un Trabajador de la Base de Datos por DNI
     */
    public void eliminar_trabajador_prompt(String DNI_master_user)
    {
        Trabajador trabajador = new Trabajador();    
        boolean IsMaster = true;
        
        while(IsMaster == true){
            trabajador = comprobar_trabajador_prompt();
            if(trabajador.DNI().toLowerCase().equals(DNI_master_user.toLowerCase())){
                System.out.println("No puede eliminarse a si mismo de la base de datos");
            }
            else if(!trabajador.DNI().equals("N/A")){
                lista_trabajadores.remove(trabajador);
                System.out.println("El trabajador ha sido eliminado con exito");
                System.out.println("");
                IsMaster = false;
            }
        }
    }
        
    /**
     * MODIFICADOR_1.1.2b: Metodos para eliminar un Trabajador de la Base de Datos pasando un objeto
     * Trabajador() previamente creado
     */
    public void eliminar_trabajador(Trabajador trabajador)
    {
        lista_trabajadores.remove(trabajador);
    }
    
    //MODIFICAR DATO TRABAJADOR DE BASE DE DATOS
    
    public void modificar_trabajador_prompt()
    {
        Trabajador trabajador = new Trabajador();    
        trabajador = comprobar_trabajador_prompt();
        if(!trabajador.DNI().toLowerCase().equals("NA")){
            //System.out.println("No se encuentra un Trabajador con ese DNI en la base de datos");
            lista_trabajadores.remove(trabajador);
            System.out.println("El trabajador ha sido eliminado con exito");
        }
        // else{
            // lista_trabajadores.remove(trabajador);
            // System.out.println("El trabajador ha sido eliminado con exito");
        // }
        
    }
    
    
    
    
    
    //VERICACION SI UN TRABAJADOR EXISTE EN LA BASE DE DATOS
    
    /**
    * ACCESOR_1a: Metodo para verificar si existe un trabajador especifico en la BD por DNI y devolverlo
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
    * ACCESOR_1b: Metodo para verificar si existe un trabajador especifico en la BD por DNI y devolverlo
    */
    public Trabajador comprobar_trabajador_prompt()
    {
        System.out.println("Introduzca el DNI del trabajador:");
        System.out.println("");
        String DNI_accesor_1b = input.invocar();
        System.out.println("");
        
        Trabajador trabajador_acc_1b = new Trabajador();
        trabajador_acc_1b = comprobar_trabajador(DNI_accesor_1b);
        
        if(trabajador_acc_1b.DNI().equals("N/A")){
            System.out.println("No se encuentra un Trabajador con ese DNI en la base de datos");
            System.out.println("");
        }

        return trabajador_acc_1b;
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
        if(lista_trabajadores.isEmpty()){
            System.out.println("No hay trabajadores en la Base de Datos");
            System.out.println("");
        }
        else{
            for(Trabajador trabajador : lista_trabajadores){
                trabajador.resumen_trabajador_completo_s_passwd();
            }
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
