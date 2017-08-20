import java.util.ArrayList;
/**
 * Clase para crear los ArrayList donde se almacenarán todos los datos.
 *
 * @author (Froylán Málaga)
 * @version (V.00)
 */

public class Datos_BD
{
    // Creando los ArrayList donde se almacenarán: encargados, comerciales, mecánicos, personas y vehículos
    private ArrayList<Trabajador> lista_trabajadores;
    private ArrayList<Cliente> lista_clientes;
    private ArrayList<Vehiculo> lista_vehiculos;
    private ArrayList<Ficha> lista_fichas;
    private Input input = new Input();

    /**
     * CONSTRUCTOR_1: Construye Base de Datos para todos los objetos
     */
    public Datos_BD()
    {
        lista_trabajadores = new ArrayList<Trabajador>();
        lista_clientes = new ArrayList<Cliente>();
        lista_vehiculos = new ArrayList<Vehiculo>() ;
        lista_fichas = new ArrayList<Ficha>();
        
        rellena_trabajadores_iniciales();
        rellena_clientes_iniciales();
        rellena_vehiculos_iniciales();
    }
    
    // ########## 1 - TRABAJADORES ##########
    
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
        int ID = -100;
        boolean salir = false;
        while(trabajador.DNI().equals("N/A")){
            trabajador = comprobar_trabajador_prompt(); //Devuelve No existe" si no se encuentra
        }
                
        for(Trabajador trabajador_loop : lista_trabajadores){
            ID = lista_trabajadores.indexOf(trabajador_loop);
            if(trabajador_loop.DNI().equals(trabajador.DNI())){break;}
        }
        
        while(salir == false){
            System.out.println("Indique que tipo de datos desdea modificar:");
            System.out.println("(1)  - DNI");
            System.out.println("(2)  - Telefono Personal");
            System.out.println("(3)  - Direccion");
            System.out.println("(4)  - Nombre");
            System.out.println("(5)  - Primer Apellido");
            System.out.println("(6)  - Segundo Apellido");
            System.out.println("(7)  - Fecha de Nacimiento");
            System.out.println("(8)  - Fecha de Alta");
            System.out.println("(9)  - ID del trabajador");
            System.out.println("(10) - Telefono del trabajador");
            System.out.println("(11) - Tipo de Trabajador");
            System.out.println("(12) - Turno");
            System.out.println("(s)  - Salir");
            System.out.println("");
            String opcion = input.invocar();
            
            if(opcion.toLowerCase().equals("s")){
                salir = true;
                System.out.println("");
            }
            else{
                System.out.println("Por favor introduzca el nuevo dato:");
                String nuevo_dato = input.invocar();
                System.out.println("");
        
                if(opcion.equals("1")){
                    lista_trabajadores.get(ID).modificar_DNI(nuevo_dato);
                    System.out.println("DNI modificado con exito");
                }
                else if(opcion.equals("2")){
                    lista_trabajadores.get(ID).modificar_tlfn_per(Integer.parseInt(nuevo_dato));
                    System.out.println("Telefono Personal modificado con exito");
                }
                else if(opcion.equals("3")){
                    lista_trabajadores.get(ID).modificar_direccion(nuevo_dato);
                    System.out.println("Direccion modificado con exito");
                }
                else if(opcion.equals("4")){
                    lista_trabajadores.get(ID).modificar_nombre(nuevo_dato);
                    System.out.println("Nombre modificado con exito");
                }
                else if(opcion.equals("5")){
                    lista_trabajadores.get(ID).modificar_primer_apellido(nuevo_dato);
                    System.out.println("Primer apellido modificado con exito");
                }
                else if(opcion.equals("6")){
                    lista_trabajadores.get(ID).modificar_segundo_apellido(nuevo_dato);
                    System.out.println("Segundo apellido modificado con exito");
                }
                else if(opcion.equals("7")){
                    lista_trabajadores.get(ID).modificar_fecha_de_nacimiento(nuevo_dato);
                    System.out.println("Fecha de nacimiento modificado con exito");
                }
                else if(opcion.equals("8")){
                    lista_trabajadores.get(ID).modificar_fecha_alta(nuevo_dato);
                    System.out.println("Fecha de alta modificado con exito");
                }
                else if(opcion.equals("9")){
                    lista_trabajadores.get(ID).modificar_ID_trabajador(Integer.parseInt(nuevo_dato));
                    System.out.println("ID del trabajador modificado con exito");
                }
                else if(opcion.equals("10")){
                    lista_trabajadores.get(ID).modificar_tlfn_empresa(Integer.parseInt(nuevo_dato));
                    System.out.println("Telefono del trabajador modificado con exito");
                }
                else if(opcion.equals("11")){
                    lista_trabajadores.get(ID).modificar_tipo_trabajador(nuevo_dato);
                    System.out.println("Tipo de Trabajador modificado con exito");
                }
                else if(opcion.equals("12")){
                    lista_trabajadores.get(ID).modificar_turno(nuevo_dato);
                    System.out.println("Turno Personal modificado con exito");
                }
                else{
                    System.out.println("Esa no es una opcion valida");
                }
                System.out.println("");
            }
        }
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
    * ACCESOR_1c: Metodo para verificar si existe un trabajador especifico en la BD por ID y devolverlo
    */
    public Trabajador comprobar_trabajador_ID(int ID_trabajador)
    {
        Trabajador trabajador = new Trabajador();
        
        for(Trabajador trabajador_loop : lista_trabajadores){
           if(trabajador_loop.ID_trabajador() == ID_trabajador){
               trabajador = trabajador_loop;
               break;
           }
        }
        return trabajador;
    }
    
    /**
    * ACCESOR_1d: Metodo para verificar si existe un trabajador especifico en la BD por ID y devolverlo
    */
    public Trabajador comprobar_trabajador_ID_prompt()
    {
        System.out.println("Introduzca el ID del trabajador:");
        System.out.println("");
        int ID_accesor_1d = Integer.parseInt(input.invocar());
        System.out.println("");
        
        Trabajador trabajador_acc_1d = new Trabajador();
        trabajador_acc_1d = comprobar_trabajador_ID(ID_accesor_1d);

        if(trabajador_acc_1d.ID_trabajador() == 0){
            System.out.println("No se encuentra un Trabajador con ese ID en la base de datos");
            System.out.println("");
        }

        return trabajador_acc_1d;
    }    
    
    // RESUMENES
    
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
    
    // INICIALIZADOR
    
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
    
    
    
    
    
    
    // ########## 2 - CLIENTE ##########
    
    //AÑADIR CLIENTES A BASE DE DATOS
    
    /**
     * MODIFICADOR_CL_1.1.1a: Metodos para añadir nuevos Clientes a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_cliente(String DNI, int tlfn_personal, String direccion, String nombre, 
                                String primer_apellido, String segundo_apellido, String fecha_nacimiento, 
                                String fecha_alta, int ID_cliente)
    {
        if(comprobar_cliente(DNI).DNI().equals("N/A")){
            Cliente cliente = new Cliente(DNI, tlfn_personal, direccion, nombre, primer_apellido, 
                                            segundo_apellido, fecha_nacimiento, fecha_alta, ID_cliente);
            lista_clientes.add(cliente);
        }
        else{
            System.out.println("El cliente con DNI " + DNI + " ya existe en la base de datos");
        }
    }
    
    /**
     * MODIFICADOR_CL_1.1.1b: Metodos para añadir nuevos Clientes a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_cliente_prompt()
    {
        System.out.println("Por favor introduzca los datos del Nuevo cliente:");
        System.out.println("");
        
        boolean DNI_existe = true;
        
        while(DNI_existe == true){
            System.out.println("DNI:");
            String DNI = input.invocar();
            System.out.println("");
            
            if(comprobar_cliente(DNI).DNI().equals("N/A")){
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
                System.out.println("ID del cliente:");
                int ID_cliente = Integer.parseInt(input.invocar());
                System.out.println("");
                Cliente cliente = new Cliente(DNI, tlfn_personal, direccion, nombre, primer_apellido,
                                                segundo_apellido, fecha_nacimiento, fecha_alta,
                                                ID_cliente);
                lista_clientes.add(cliente);
                System.out.println("El cliente ha sido agregado con exito!!");
                System.out.println("");
                
                boolean respuesta_incorrecta = true;
                while(respuesta_incorrecta){
                    System.out.println("¿Desea agregar un vehiculo al cliente?: (s / n)");
                    System.out.println("");
                    String agregar_vehiculo = input.invocar();
                    if(agregar_vehiculo.toLowerCase().equals("s")){
                        respuesta_incorrecta = false;
                        nuevo_vehiculo_de_cliente_prompt(ID_cliente);
                    }
                    else if(agregar_vehiculo.toLowerCase().equals("n")){
                        respuesta_incorrecta = false;
                    }
                }
            }
            else{
                System.out.println("El DNI ya existe en la base de Datos, por favor introduzca otro");
            }
        }
    }
    
    /**
     * MODIFICADOR_CL_1.1.1c: Metodo para añadir un nuevo Cliente a la Base de Datos pasando un objeto
     * Cliente() previamente creado
     */
    public void nuevo_cliente(Cliente cliente)
    {
        String DNI = cliente.DNI();
        if(comprobar_cliente(DNI).DNI().equals("N/A")){
            lista_clientes.add(cliente);
        }
        else{
            System.out.println("El usuario con DNI " + DNI + " ya existe en la base de datos");
        }
    }
    
    //ELIMINAR CLIENTES DE BASE DE DATOS
    
        /**
     * MODIFICADOR_CL_1.1.2a: Metodos para ELIMINAR un Cliente de la Base de Datos por DNI
     */
    public void eliminar_cliente_prompt()
    {
        Cliente cliente = new Cliente();
        
        while(cliente.DNI().equals("N/A")){
            cliente = comprobar_cliente_prompt(); // Devuelve No existe" si no se encuentra
        }
        
        System.out.println("¿Esta seguro que desea eliminarlo?: (s / n)");
        System.out.println("");
        String continuar = input.invocar().toLowerCase();
        boolean no_existe_respuesta = true;
        
        while(no_existe_respuesta == true){
            if(continuar.equals("s")){
                lista_clientes.remove(cliente);
                System.out.println("El cliente ha sido eliminado con exito");
                no_existe_respuesta = false;
            }
            else if(continuar.equals("n")){
                no_existe_respuesta = false;
            }
        }
        
        System.out.println("");
    }
        
    /**
     * MODIFICADOR_CL_1.1.2b: Metodos para eliminar un Cliente de la Base de Datos pasando un objeto
     * Cliente() previamente creado
     */
    public void eliminar_cliente(Cliente cliente)
    {
        lista_clientes.remove(cliente);
    }
    
    //MODIFICAR DATO TRABAJADOR DE BASE DE DATOS
    
    public void modificar_cliente_prompt()
    {
        Cliente cliente = new Cliente();
        int ID = -100;
        boolean salir = false;
        while(cliente.DNI().equals("N/A")){
            cliente = comprobar_cliente_prompt(); //Devuelve No existe" si no se encuentra
        }
                
        for(Cliente cliente_loop : lista_clientes){
            ID = lista_clientes.indexOf(cliente_loop);
            if(cliente_loop.DNI().equals(cliente.DNI())){break;}
        }
        
        while(salir == false){
            System.out.println("Indique que tipo de datos desdea modificar:");
            System.out.println("(1)  - DNI");
            System.out.println("(2)  - Telefono Personal");
            System.out.println("(3)  - Direccion");
            System.out.println("(4)  - Nombre");
            System.out.println("(5)  - Primer Apellido");
            System.out.println("(6)  - Segundo Apellido");
            System.out.println("(7)  - Fecha de Nacimiento");
            System.out.println("(8)  - Fecha de Alta");
            System.out.println("(9)  - ID del client");
            System.out.println("(s)  - Salir");
            System.out.println("");
            String opcion = input.invocar();
            
            if(opcion.toLowerCase().equals("s")){
                salir = true;
                System.out.println("");
            }
            else{
                System.out.println("Por favor introduzca el nuevo dato:");
                String nuevo_dato = input.invocar();
                System.out.println("");
        
                if(opcion.equals("1")){
                    lista_clientes.get(ID).modificar_DNI(nuevo_dato);
                    System.out.println("DNI modificado con exito");
                }
                else if(opcion.equals("2")){
                    lista_clientes.get(ID).modificar_tlfn_per(Integer.parseInt(nuevo_dato));
                    System.out.println("Telefono Personal modificado con exito");
                }
                else if(opcion.equals("3")){
                    lista_clientes.get(ID).modificar_direccion(nuevo_dato);
                    System.out.println("Direccion modificado con exito");
                }
                else if(opcion.equals("4")){
                    lista_clientes.get(ID).modificar_nombre(nuevo_dato);
                    System.out.println("Nombre modificado con exito");
                }
                else if(opcion.equals("5")){
                    lista_clientes.get(ID).modificar_primer_apellido(nuevo_dato);
                    System.out.println("Primer apellido modificado con exito");
                }
                else if(opcion.equals("6")){
                    lista_clientes.get(ID).modificar_segundo_apellido(nuevo_dato);
                    System.out.println("Segundo apellido modificado con exito");
                }
                else if(opcion.equals("7")){
                    lista_clientes.get(ID).modificar_fecha_de_nacimiento(nuevo_dato);
                    System.out.println("Fecha de nacimiento modificado con exito");
                }
                else if(opcion.equals("8")){
                    lista_clientes.get(ID).modificar_fecha_alta(nuevo_dato);
                    System.out.println("Fecha de alta modificado con exito");
                }
                else if(opcion.equals("9")){
                    lista_clientes.get(ID).modificar_ID_cliente(Integer.parseInt(nuevo_dato));
                    System.out.println("ID del trabajador modificado con exito");
                }
                else{
                    System.out.println("Esa no es una opcion valida");
                }
                System.out.println("");
            }
        }
    }
    
    //VERICACION SI UN CLIENTE EXISTE EN LA BASE DE DATOS
    
    /**
    * ACCESOR_CL_1a: Metodo para verificar si existe un cliente especifico en la BD por DNI y devolverlo
    */
    public Cliente comprobar_cliente(String DNI)
    {
        Cliente cliente = new Cliente();
        
        for(Cliente cliente_loop : lista_clientes){
           if (cliente_loop.DNI().toLowerCase().equals(DNI.toLowerCase())){
               cliente = cliente_loop;
               break;
           }
        }
        return cliente;
    }
            
    /**
    * ACCESOR_CL_1b: Metodo para verificar si existe un cliente especifico en la BD por DNI y devolverlo
    */
    public Cliente comprobar_cliente_prompt()
    {
        System.out.println("Introduzca el DNI del cliente:");
        System.out.println("");
        String DNI_accesor_1b = input.invocar();
        System.out.println("");
        
        Cliente cliente_acc_1b = new Cliente();
        cliente_acc_1b = comprobar_cliente(DNI_accesor_1b);
        
        if(cliente_acc_1b.DNI().equals("N/A")){
            System.out.println("No se encuentra un Cliente con ese DNI en la base de datos");
            System.out.println("");
        }

        return cliente_acc_1b;
    }
    
    // RESUMENES
    
    /**
     * RESUMEN_CL_1.1: Metodo para sacar un resumen de un Cliente particular
     */
    public void resumen_cliente_especifico(int ID_enc)
    {
        lista_clientes.get(ID_enc).resumen_cliente();
    }   

    /**
     * RESUMEN_CL_1.2: Metodo para sacar un resumen de todos los Clientes
     */
    public void resumen_todos_clientes()
    {
        if(lista_clientes.isEmpty()){
            System.out.println("No hay clientes en la Base de Datos");
            System.out.println("");
        }
        else{
            for(Cliente cliente : lista_clientes){
                cliente.resumen_cliente();
            }
        }
    }
    
    // INICIALIZADOR
    
    /**
    * AYUDANTE_CL_1: Metodo para crear los trabajadores iniciales de la base de datos
    */       
    private void rellena_clientes_iniciales()
    {      
        nuevo_cliente("11112222A", 662872191, "Madrid", "Luna", "Lopez", 
                        "Luena", "01/01/1981", "01/01/2001", 1);

        nuevo_cliente("22223333B", 662872192, "Casarrubios del Monte", "Estrella", "Erustondo", 
                        "Eloy", "02/02/1982", "02/02/2002", 2);
        
        nuevo_cliente("33334444C", 662872193, "Alcorcon", "Jimena", "Jaen", 
                        "Jimenez", "03/03/1983", "03/03/2003", 3);
    }
    
     
    
    
    
    
    
    // ########## 3 - VEHICULOS ##########
    
    //AÑADIR VEHICULOS A BASE DE DATOS
    
    /**
     * MODIFICADOR_CL_1.1.1a: Metodos para añadir nuevos Vehiculos a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_vehiculo(String vehiculo, String tipo_vehiculo, String matricula,
                                String fecha_matriculacion, String fecha_ITV_ultima, String marca,
                                String modelo, String combustible, String color, String tipo_cambio,
                                int ID_cliente_pertenece, int num_ruedas, int num_puertas, boolean ABS,
                                boolean GPS, boolean aire_acondicionado)
    {
        if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
            Vehiculo vehic = new Vehiculo(vehiculo, tipo_vehiculo, matricula, fecha_matriculacion,
                                            fecha_ITV_ultima, marca, modelo, combustible, color,
                                            tipo_cambio, ID_cliente_pertenece, num_ruedas,
                                            num_puertas, ABS, GPS, aire_acondicionado);
            lista_vehiculos.add(vehic);
        }
        else{
            System.out.println("El vehiculo con matricula " + matricula + " ya existe en la base de datos");
        }
    }
    
    /**
     * MODIFICADOR_CL_1.1.1b: Metodos para añadir nuevos Vehiculos a la Base de Datos rellenando todos 
     * los parametros
     */
    public void nuevo_vehiculo_prompt()
    {
        System.out.println("Por favor introduzca los datos del Nuevo vehiculo:");
        System.out.println("");
        
        boolean matricula_existe = true;
        
        while(matricula_existe == true){
            System.out.println("Matricula:");
            String matricula = input.invocar();
            System.out.println("");
            
            if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
                matricula_existe = false;
                
                System.out.println("Vehiculo:");
                String vehiculo = input.invocar();
                System.out.println("");
                System.out.println("Tipo de vehiculo:");
                String tipo_vehiculo = input.invocar();
                System.out.println("");
                System.out.println("Fecha de matriculacion:");
                String fecha_matriculacion = input.invocar();
                System.out.println("");
                System.out.println("Fecha de ultima ITV:");
                String fecha_ITV_ultima = input.invocar();
                System.out.println("");
                System.out.println("Marca:");
                String marca = input.invocar();
                System.out.println("");
                System.out.println("Modelo:");
                String modelo = input.invocar();
                System.out.println("");
                System.out.println("Tipo de combustible:");
                String combustible = input.invocar();
                System.out.println("");
                System.out.println("Color:");
                String color = input.invocar();
                System.out.println("");
                System.out.println("Tipo de cambio:");
                String tipo_cambio = input.invocar();
                System.out.println("");
                System.out.println("Cliente(ID) al que el vehiculo pertenece:");
                int ID_cliente_pertenece = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Numero de ruedas:");
                int num_ruedas = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Numero de puertas:");
                int num_puertas = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Existencia de ABS:");
                boolean ABS = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                System.out.println("Existencia de GPS:");
                boolean GPS = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                System.out.println("Existencia de aire acondicionado:");
                boolean aire_acondicionado = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                Vehiculo vehic = new Vehiculo(vehiculo, tipo_vehiculo, matricula, fecha_matriculacion,
                                                fecha_ITV_ultima, marca, modelo, combustible, color,
                                                tipo_cambio, ID_cliente_pertenece, num_ruedas,
                                                num_puertas, ABS, GPS, aire_acondicionado);
                lista_vehiculos.add(vehic);
                System.out.println("El vehiculo ha sido agregado con exito!!");
                System.out.println("");
            }
            else{
                System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
            }
        }
    }
    
    /**
     * MODIFICADOR_CL_1.1.1c: Metodo para añadir un nuevo Vehiculo a la Base de Datos pasando un objeto
     * Vehiculo() previamente creado
     */
    public void nuevo_vehiculo(Vehiculo vehiculo)
    {
        String matricula = vehiculo.matricula();
        if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
            lista_vehiculos.add(vehiculo);
        }
        else{
            System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
        }
    }
    
        /**
     * MODIFICADOR_CL_1.1.1d: Metodos para añadir nuevos Vehiculos a la Base de Datos rellenando todos 
     * los parametros para un cliente especifico
     */
    public void nuevo_vehiculo_de_cliente_prompt(int ID_cliente_pertenece)
    {
        System.out.println("Por favor introduzca los datos del Nuevo vehiculo:");
        System.out.println("");
        
        boolean matricula_existe = true;
        
        while(matricula_existe == true){
            System.out.println("Matricula:");
            String matricula = input.invocar();
            System.out.println("");
            
            if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
                matricula_existe = false;
                
                System.out.println("Vehiculo:");
                String vehiculo = input.invocar();
                System.out.println("");
                System.out.println("Tipo de vehiculo:");
                String tipo_vehiculo = input.invocar();
                System.out.println("");
                System.out.println("Fecha de matriculacion:");
                String fecha_matriculacion = input.invocar();
                System.out.println("");
                System.out.println("Fecha de ultima ITV:");
                String fecha_ITV_ultima = input.invocar();
                System.out.println("");
                System.out.println("Marca:");
                String marca = input.invocar();
                System.out.println("");
                System.out.println("Modelo:");
                String modelo = input.invocar();
                System.out.println("");
                System.out.println("Tipo de combustible:");
                String combustible = input.invocar();
                System.out.println("");
                System.out.println("Color:");
                String color = input.invocar();
                System.out.println("");
                System.out.println("Tipo de cambio:");
                String tipo_cambio = input.invocar();
                System.out.println("");
                System.out.println("Numero de ruedas:");
                int num_ruedas = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Numero de puertas:");
                int num_puertas = Integer.parseInt(input.invocar());
                System.out.println("");
                System.out.println("Existencia de ABS:");
                boolean ABS = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                System.out.println("Existencia de GPS:");
                boolean GPS = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                System.out.println("Existencia de aire acondicionado:");
                boolean aire_acondicionado = Boolean.parseBoolean(input.invocar());
                System.out.println("");
                Vehiculo vehic = new Vehiculo(vehiculo, tipo_vehiculo, matricula, fecha_matriculacion,
                                                fecha_ITV_ultima, marca, modelo, combustible, color,
                                                tipo_cambio, ID_cliente_pertenece, num_ruedas,
                                                num_puertas, ABS, GPS, aire_acondicionado);
                lista_vehiculos.add(vehic);
                System.out.println("El vehiculo ha sido agregado con exito!!");
                System.out.println("");
            }
            else{
                System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
            }
        }
    }
    
    //ELIMINAR VEHICULOS DE BASE DE DATOS
    
        /**
     * MODIFICADOR_VL_1.1.2a: Metodos para ELIMINAR un Vehiculo de la Base de Datos por matricula
     */
    public void eliminar_vehiculo_prompt()
    {
        Vehiculo vehiculo = new Vehiculo();
        
        while(vehiculo.matricula().equals("N/A")){
            vehiculo = comprobar_vehiculo_prompt(); // Devuelve No existe" si no se encuentra
        }
        
        System.out.println("¿Esta seguro que desea eliminarlo?: (s / n)");
        System.out.println("");
        String continuar = input.invocar().toLowerCase();
        boolean no_existe_respuesta = true;
        
        while(no_existe_respuesta == true){
            if(continuar.equals("s")){
                lista_vehiculos.remove(vehiculo);
                System.out.println("El vehiculo ha sido eliminado con exito");
                no_existe_respuesta = false;
            }
            else if(continuar.equals("n")){
                no_existe_respuesta = false;
            }
        }
        
        System.out.println("");
    }
        
    /**
     * MODIFICADOR_VL_1.1.2b: Metodos para eliminar un Vehiculo de la Base de Datos pasando un objeto
     * Vehiculo() previamente creado
     */
    public void eliminar_vehiculo(Vehiculo vehiculo)
    {
        lista_vehiculos.remove(vehiculo);
    }
    
    //MODIFICAR DATOS VEHICULO EN BASE DE DATOS
    
    public void modificar_vehiculo_prompt()
    {
        Vehiculo vehiculo = new Vehiculo();
        int ID = -100;
        boolean salir = false;
        while(vehiculo.matricula().equals("N/A")){
            vehiculo = comprobar_vehiculo_prompt(); //Devuelve No existe" si no se encuentra
        }
                
        for(Vehiculo vehiculo_loop : lista_vehiculos){
            ID = lista_vehiculos.indexOf(vehiculo_loop);
            if(vehiculo_loop.matricula().equals(vehiculo.matricula())){break;}
        }
        
        while(salir == false){
            System.out.println("Indique que tipo de datos desdea modificar:");
            System.out.println(" (1)  - Vehiculo (Coche, Moto, Furgoneta, Camion)");
            System.out.println(" (2)  - Tipo de Vehiculo (N/A, Carretera, Campo, Servicios)");
            System.out.println(" (3)  - Matricula");
            System.out.println(" (4)  - Fecha de Matriculacion");
            System.out.println(" (5)  - Fecha de ultima ITV");
            System.out.println(" (6)  - Marca");
            System.out.println(" (7)  - Modelo");
            System.out.println(" (8)  - Tipo de combustible");
            System.out.println(" (9)  - Color");
            System.out.println("(10)  - Tipo de cambio");
            System.out.println("(11)  - ID del cliente al que pertenece");
            System.out.println("(12)  - Numero de ruedas");
            System.out.println("(13)  - Numero de Puertas");
            System.out.println("(14)  - ABS (true, false)");
            System.out.println("(15)  - GPS (true, false)");
            System.out.println("(16)  - Aire acondicionado (true, false)");
            System.out.println(" (s)  - Salir");
            System.out.println("");
            String opcion = input.invocar();
            
            if(opcion.toLowerCase().equals("s")){
                salir = true;
                System.out.println("");
            }
            else if(Integer.parseInt(opcion) < 17){
                System.out.println("Por favor introduzca el nuevo dato:");
                String nuevo_dato = input.invocar();
                System.out.println("");
                
                if(opcion.equals("1")){
                    lista_vehiculos.get(ID).modificar_vehiculo(nuevo_dato);
                    System.out.println("Vehiculo modificado con exito");
                }
                else if(opcion.equals("2")){
                    lista_vehiculos.get(ID).modificar_tipo_vehiculo(nuevo_dato);
                    System.out.println("Tipo vehiculo modificado con exito");
                }
                else if(opcion.equals("3")){
                    lista_vehiculos.get(ID).modificar_matricula(nuevo_dato);
                    System.out.println("Matricula modificada con exito");
                }
                else if(opcion.equals("4")){
                    lista_vehiculos.get(ID).modificar_fecha_matriculacion(nuevo_dato);
                    System.out.println("Fecha de matriculacion modificada con exito");
                }
                else if(opcion.equals("5")){
                    lista_vehiculos.get(ID).modificar_fecha_ITV_ultima(nuevo_dato);
                    System.out.println("Fecha de ultima ITV modificada con exito");
                }
                else if(opcion.equals("6")){
                    lista_vehiculos.get(ID).modificar_marca(nuevo_dato);
                    System.out.println("Marca modificada con exito");
                }
                else if(opcion.equals("7")){
                    lista_vehiculos.get(ID).modificar_modelo(nuevo_dato);
                    System.out.println("Modelo modificado con exito");
                }
                else if(opcion.equals("8")){
                    lista_vehiculos.get(ID).modificar_combustible(nuevo_dato);
                    System.out.println("Tipo de combustible modificado con exito");
                }
                else if(opcion.equals("9")){
                    lista_vehiculos.get(ID).modificar_color(nuevo_dato);
                    System.out.println("Color modificado con exito");
                }
                else if(opcion.equals("10")){
                    lista_vehiculos.get(ID).modificar_tipo_cambio(nuevo_dato);
                    System.out.println("Tipo de cambio modificado con exito");
                }
                else if(opcion.equals("11")){
                    lista_vehiculos.get(ID).modificar_ID_cliente_pertenece(Integer.parseInt(nuevo_dato));
                    System.out.println("Cliente(ID) al que el vehiculo pertenece modificado con exito");
                }
                else if(opcion.equals("12")){
                    lista_vehiculos.get(ID).modificar_num_ruedas(Integer.parseInt(nuevo_dato));
                    System.out.println("Numero de ruedas modificado con exito");
                }
                else if(opcion.equals("13")){
                    lista_vehiculos.get(ID).modificar_num_puertas(Integer.parseInt(nuevo_dato));
                    System.out.println("Numero de puertas modificado con exito");
                }
                else if(opcion.equals("14")){
                    lista_vehiculos.get(ID).modificar_ABS(Boolean.parseBoolean(nuevo_dato));
                    System.out.println("Existencia de ABS modificada con exito");
                }
                else if(opcion.equals("15")){
                    lista_vehiculos.get(ID).modificar_GPS(Boolean.parseBoolean(nuevo_dato));
                    System.out.println("Existencia de GPS modificada con exito");
                }
                else if(opcion.equals("16")){
                    lista_vehiculos.get(ID).modificar_aire_acondicionado(Boolean.parseBoolean(nuevo_dato));
                    System.out.println("Existencia de aire acondicioanda modificada con exito");
                }
            }
            else{
                System.out.println("Esa no es una opcion valida");
            }
            System.out.println("");
        }
    }
    
    // VERICACION SI UN VEHICULO EXISTE EN LA BASE DE DATOS
    
    /**
    * ACCESOR_VL_1a: Metodo para verificar si existe un vehiculo especifico en la BD por matricula y devolverlo
    */
    public Vehiculo comprobar_vehiculo(String matricula)
    {
        Vehiculo vehiculo = new Vehiculo();
        
        for(Vehiculo vehiculo_loop : lista_vehiculos){
           if (vehiculo_loop.matricula().toLowerCase().equals(matricula.toLowerCase())){
               vehiculo = vehiculo_loop;
               break;
           }
        }
        return vehiculo;
    }
            
    /**
    * ACCESOR_VL_1b: Metodo para verificar si existe un vehiculo especifico en la BD por matricula y devolverlo
    */
    public Vehiculo comprobar_vehiculo_prompt()
    {
        System.out.println("Introduzca la Matricula del vehiculo:");
        System.out.println("");
        String matricula_accesor_1b = input.invocar();
        System.out.println("");
        
        Vehiculo vehiculo_acc_1b = new Vehiculo();
        vehiculo_acc_1b = comprobar_vehiculo(matricula_accesor_1b);
        
        if(vehiculo_acc_1b.matricula().equals("N/A")){
            System.out.println("No se encuentra un vehiculo con esa matricula en la base de datos");
            System.out.println("");
        }

        return vehiculo_acc_1b;
    }
    
    // RESUMENES
    
    /**
     * RESUMEN_VL_1.1: Metodo para sacar un resumen de un Vehiculo particular
     */
    public void resumen_vehiculo_especifico(int ID_veh)
    {
        lista_vehiculos.get(ID_veh).resumen_vehiculo();
    }

    /**
     * RESUMEN_VL_1.2: Metodo para sacar un resumen de todos los Vehiculos
     */
    public void resumen_todos_vehiculos()
    {
        if(lista_vehiculos.isEmpty()){
            System.out.println("No hay vehiculos en la Base de Datos");
            System.out.println("");
        }
        else{
            for(Vehiculo vehiculo : lista_vehiculos){
                vehiculo.resumen_vehiculo();
            }
        }
    }
    
    /**
     * RESUMEN_VL_1.3: Metodo para sacar un resumen de todos los Vehiculos de un cliente especifico
     */
    public void resumen_todos_vehiculos_por_cliente()
    {
        Cliente cliente = comprobar_cliente_prompt();
        int ID_client = cliente.ID_cliente();
        boolean lista_vacia = true;
        
        for(Vehiculo vehiculo_loop : lista_vehiculos){
            if(vehiculo_loop.ID_cliente_pertenece() == (ID_client)){
                vehiculo_loop.resumen_vehiculo();
                lista_vacia = false;
            }
        }
        if(lista_vacia == true){
            System.out.println("No hay Vehiculos asociados a este cliente");
            System.out.println("");
        }
    }
    
    // INICIALIZADOR
    
    /**
    * AYUDANTE_VL_1: Metodo para crear los vehiculos iniciales de la base de datos
    */       
    private void rellena_vehiculos_iniciales()
    {      
        nuevo_vehiculo("Coche", "Servicios", "8473HRX", "01/07/2013", "15/07/2017",
                        "Toyota", "Auris", "Gasolina", "Azul Abisal", "Manual", 1, 4,
                        5, true, false, true);
        
        nuevo_vehiculo("Moto", "Carretera", "4521FTN", "01/03/2012", "15/07/2017",
                        "Toyota", "Auris", "Gasolina", "Azul Abisal", "Manual", 2, 4,
                        5, true, false, true);
                        
        nuevo_vehiculo("Camion", "Servicios", "4871GPO", "01/07/2013", "15/07/2017",
                        "Mercedes", "Vito", "Diesel", "Blanco", "Automatico", 2, 4,
                        5, true, false, true);
    }
        
     
    
    
    
    
    
    // ########## 4 - FICHAS ##########
    
    //AÑADIR FICHAS A BASE DE DATOS
    
    /**
     * MODIFICADOR_CL_1.1.1a: Metodos para añadir nuevos Fichas a la Base de Datos
     */
    public void nueva_ficha_prompt(String tipo_trabajador)
    {
        if(tipo_trabajador.toLowerCase().equals("comercial")){
            System.out.println("LISTADO DE COMERCIALES:");
        }
        else{
            System.out.println("LISTADO DE MECANICOS:");
        }
        System.out.println("");
                        
        Trabajador trabajador = new Trabajador();
        while(trabajador.ID_trabajador() == 0){
            for(Trabajador trabajador_loop : lista_trabajadores){
                if(trabajador_loop.tipo_trabajador().toLowerCase().equals(tipo_trabajador.toLowerCase())){
                    System.out.print("  ");
                    System.out.println(trabajador_loop.nombre() + " " + trabajador_loop.primer_apellido()
                                        + " " + trabajador_loop.segundo_apellido() + " (" + 
                                    trabajador_loop.ID_trabajador() + ")");
                }
            }
            System.out.println("");
            trabajador = comprobar_trabajador_ID_prompt();
        }
        
        Vehiculo vehiculo = new Vehiculo();
        while(vehiculo.matricula().equals("N/A")){
            vehiculo = comprobar_vehiculo_prompt();
        }
        
        Ficha ficha = new Ficha(vehiculo, trabajador);
        boolean continuar = true;
        String respuesta;
        
        while(continuar){
            System.out.println("Desea añadir tareas?:(s / n)");
            System.out.println("");
            respuesta = input.invocar();
            
            if(respuesta.toLowerCase().equals("s")){
                System.out.println("Introduzca la nueva tarea:");
                System.out.println("");
                respuesta = input.invocar();
                ficha.nueva_tarea(respuesta);
            }
            else if(respuesta.toLowerCase().equals("n")){
                continuar = false;
            }
            else{
                System.out.println("Esa no es una respuesta correcta.");
            }
        }
        
        ficha.resumen_tareas();
        
        //lista_fichas.add(ficha);
    }
    
    // /**
     // * MODIFICADOR_CL_1.1.1b: Metodos para añadir nuevos Vehiculos a la Base de Datos rellenando todos 
     // * los parametros
     // */
    // public void nuevo_vehiculo_prompt()
    // {
        // System.out.println("Por favor introduzca los datos del Nuevo vehiculo:");
        // System.out.println("");
        
        // boolean matricula_existe = true;
        
        // while(matricula_existe == true){
            // System.out.println("Matricula:");
            // String matricula = input.invocar();
            // System.out.println("");
            
            // if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
                // matricula_existe = false;
                
                // System.out.println("Vehiculo:");
                // String vehiculo = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de vehiculo:");
                // String tipo_vehiculo = input.invocar();
                // System.out.println("");
                // System.out.println("Fecha de matriculacion:");
                // String fecha_matriculacion = input.invocar();
                // System.out.println("");
                // System.out.println("Fecha de ultima ITV:");
                // String fecha_ITV_ultima = input.invocar();
                // System.out.println("");
                // System.out.println("Marca:");
                // String marca = input.invocar();
                // System.out.println("");
                // System.out.println("Modelo:");
                // String modelo = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de combustible:");
                // String combustible = input.invocar();
                // System.out.println("");
                // System.out.println("Color:");
                // String color = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de cambio:");
                // String tipo_cambio = input.invocar();
                // System.out.println("");
                // System.out.println("Cliente(ID) al que el vehiculo pertenece:");
                // int ID_cliente_pertenece = Integer.parseInt(input.invocar());
                // System.out.println("");
                // System.out.println("Numero de ruedas:");
                // int num_ruedas = Integer.parseInt(input.invocar());
                // System.out.println("");
                // System.out.println("Numero de puertas:");
                // int num_puertas = Integer.parseInt(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de ABS:");
                // boolean ABS = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de GPS:");
                // boolean GPS = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de aire acondicionado:");
                // boolean aire_acondicionado = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // Vehiculo vehic = new Vehiculo(vehiculo, tipo_vehiculo, matricula, fecha_matriculacion,
                                                // fecha_ITV_ultima, marca, modelo, combustible, color,
                                                // tipo_cambio, ID_cliente_pertenece, num_ruedas,
                                                // num_puertas, ABS, GPS, aire_acondicionado);
                // lista_vehiculos.add(vehic);
                // System.out.println("El vehiculo ha sido agregado con exito!!");
                // System.out.println("");
            // }
            // else{
                // System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
            // }
        // }
    // }
    
    // /**
     // * MODIFICADOR_CL_1.1.1c: Metodo para añadir un nuevo Vehiculo a la Base de Datos pasando un objeto
     // * Vehiculo() previamente creado
     // */
    // public void nuevo_vehiculo(Vehiculo vehiculo)
    // {
        // String matricula = vehiculo.matricula();
        // if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
            // lista_vehiculos.add(vehiculo);
        // }
        // else{
            // System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
        // }
    // }
    
        // /**
     // * MODIFICADOR_CL_1.1.1d: Metodos para añadir nuevos Vehiculos a la Base de Datos rellenando todos 
     // * los parametros para un cliente especifico
     // */
    // public void nuevo_vehiculo_de_cliente_prompt(int ID_cliente_pertenece)
    // {
        // System.out.println("Por favor introduzca los datos del Nuevo vehiculo:");
        // System.out.println("");
        
        // boolean matricula_existe = true;
        
        // while(matricula_existe == true){
            // System.out.println("Matricula:");
            // String matricula = input.invocar();
            // System.out.println("");
            
            // if(comprobar_vehiculo(matricula).matricula().equals("N/A")){
                // matricula_existe = false;
                
                // System.out.println("Vehiculo:");
                // String vehiculo = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de vehiculo:");
                // String tipo_vehiculo = input.invocar();
                // System.out.println("");
                // System.out.println("Fecha de matriculacion:");
                // String fecha_matriculacion = input.invocar();
                // System.out.println("");
                // System.out.println("Fecha de ultima ITV:");
                // String fecha_ITV_ultima = input.invocar();
                // System.out.println("");
                // System.out.println("Marca:");
                // String marca = input.invocar();
                // System.out.println("");
                // System.out.println("Modelo:");
                // String modelo = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de combustible:");
                // String combustible = input.invocar();
                // System.out.println("");
                // System.out.println("Color:");
                // String color = input.invocar();
                // System.out.println("");
                // System.out.println("Tipo de cambio:");
                // String tipo_cambio = input.invocar();
                // System.out.println("");
                // System.out.println("Numero de ruedas:");
                // int num_ruedas = Integer.parseInt(input.invocar());
                // System.out.println("");
                // System.out.println("Numero de puertas:");
                // int num_puertas = Integer.parseInt(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de ABS:");
                // boolean ABS = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de GPS:");
                // boolean GPS = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // System.out.println("Existencia de aire acondicionado:");
                // boolean aire_acondicionado = Boolean.parseBoolean(input.invocar());
                // System.out.println("");
                // Vehiculo vehic = new Vehiculo(vehiculo, tipo_vehiculo, matricula, fecha_matriculacion,
                                                // fecha_ITV_ultima, marca, modelo, combustible, color,
                                                // tipo_cambio, ID_cliente_pertenece, num_ruedas,
                                                // num_puertas, ABS, GPS, aire_acondicionado);
                // lista_vehiculos.add(vehic);
                // System.out.println("El vehiculo ha sido agregado con exito!!");
                // System.out.println("");
            // }
            // else{
                // System.out.println("La matricula ya existe en la base de Datos, por favor introduzca otra");
            // }
        // }
    // }
    
    // //ELIMINAR VEHICULOS DE BASE DE DATOS
    
        // /**
     // * MODIFICADOR_VL_1.1.2a: Metodos para ELIMINAR un Vehiculo de la Base de Datos por matricula
     // */
    // public void eliminar_vehiculo_prompt()
    // {
        // Vehiculo vehiculo = new Vehiculo();
        
        // while(vehiculo.matricula().equals("N/A")){
            // vehiculo = comprobar_vehiculo_prompt(); // Devuelve No existe" si no se encuentra
        // }
        
        // System.out.println("¿Esta seguro que desea eliminarlo?: (s / n)");
        // System.out.println("");
        // String continuar = input.invocar().toLowerCase();
        // boolean no_existe_respuesta = true;
        
        // while(no_existe_respuesta == true){
            // if(continuar.equals("s")){
                // lista_vehiculos.remove(vehiculo);
                // System.out.println("El vehiculo ha sido eliminado con exito");
                // no_existe_respuesta = false;
            // }
            // else if(continuar.equals("n")){
                // no_existe_respuesta = false;
            // }
        // }
        
        // System.out.println("");
    // }
        
    // /**
     // * MODIFICADOR_VL_1.1.2b: Metodos para eliminar un Vehiculo de la Base de Datos pasando un objeto
     // * Vehiculo() previamente creado
     // */
    // public void eliminar_vehiculo(Vehiculo vehiculo)
    // {
        // lista_vehiculos.remove(vehiculo);
    // }
    
    // //MODIFICAR DATOS VEHICULO EN BASE DE DATOS
    
    // public void modificar_vehiculo_prompt()
    // {
        // Vehiculo vehiculo = new Vehiculo();
        // int ID = -100;
        // boolean salir = false;
        // while(vehiculo.matricula().equals("N/A")){
            // vehiculo = comprobar_vehiculo_prompt(); //Devuelve No existe" si no se encuentra
        // }
                
        // for(Vehiculo vehiculo_loop : lista_vehiculos){
            // ID = lista_vehiculos.indexOf(vehiculo_loop);
            // if(vehiculo_loop.matricula().equals(vehiculo.matricula())){break;}
        // }
        
        // while(salir == false){
            // System.out.println("Indique que tipo de datos desdea modificar:");
            // System.out.println(" (1)  - Vehiculo (Coche, Moto, Furgoneta, Camion)");
            // System.out.println(" (2)  - Tipo de Vehiculo (N/A, Carretera, Campo, Servicios)");
            // System.out.println(" (3)  - Matricula");
            // System.out.println(" (4)  - Fecha de Matriculacion");
            // System.out.println(" (5)  - Fecha de ultima ITV");
            // System.out.println(" (6)  - Marca");
            // System.out.println(" (7)  - Modelo");
            // System.out.println(" (8)  - Tipo de combustible");
            // System.out.println(" (9)  - Color");
            // System.out.println("(10)  - Tipo de cambio");
            // System.out.println("(11)  - ID del cliente al que pertenece");
            // System.out.println("(12)  - Numero de ruedas");
            // System.out.println("(13)  - Numero de Puertas");
            // System.out.println("(14)  - ABS (true, false)");
            // System.out.println("(15)  - GPS (true, false)");
            // System.out.println("(16)  - Aire acondicionado (true, false)");
            // System.out.println(" (s)  - Salir");
            // System.out.println("");
            // String opcion = input.invocar();
            
            // if(opcion.toLowerCase().equals("s")){
                // salir = true;
                // System.out.println("");
            // }
            // else if(Integer.parseInt(opcion) < 17){
                // System.out.println("Por favor introduzca el nuevo dato:");
                // String nuevo_dato = input.invocar();
                // System.out.println("");
                
                // if(opcion.equals("1")){
                    // lista_vehiculos.get(ID).modificar_vehiculo(nuevo_dato);
                    // System.out.println("Vehiculo modificado con exito");
                // }
                // else if(opcion.equals("2")){
                    // lista_vehiculos.get(ID).modificar_tipo_vehiculo(nuevo_dato);
                    // System.out.println("Tipo vehiculo modificado con exito");
                // }
                // else if(opcion.equals("3")){
                    // lista_vehiculos.get(ID).modificar_matricula(nuevo_dato);
                    // System.out.println("Matricula modificada con exito");
                // }
                // else if(opcion.equals("4")){
                    // lista_vehiculos.get(ID).modificar_fecha_matriculacion(nuevo_dato);
                    // System.out.println("Fecha de matriculacion modificada con exito");
                // }
                // else if(opcion.equals("5")){
                    // lista_vehiculos.get(ID).modificar_fecha_ITV_ultima(nuevo_dato);
                    // System.out.println("Fecha de ultima ITV modificada con exito");
                // }
                // else if(opcion.equals("6")){
                    // lista_vehiculos.get(ID).modificar_marca(nuevo_dato);
                    // System.out.println("Marca modificada con exito");
                // }
                // else if(opcion.equals("7")){
                    // lista_vehiculos.get(ID).modificar_modelo(nuevo_dato);
                    // System.out.println("Modelo modificado con exito");
                // }
                // else if(opcion.equals("8")){
                    // lista_vehiculos.get(ID).modificar_combustible(nuevo_dato);
                    // System.out.println("Tipo de combustible modificado con exito");
                // }
                // else if(opcion.equals("9")){
                    // lista_vehiculos.get(ID).modificar_color(nuevo_dato);
                    // System.out.println("Color modificado con exito");
                // }
                // else if(opcion.equals("10")){
                    // lista_vehiculos.get(ID).modificar_tipo_cambio(nuevo_dato);
                    // System.out.println("Tipo de cambio modificado con exito");
                // }
                // else if(opcion.equals("11")){
                    // lista_vehiculos.get(ID).modificar_ID_cliente_pertenece(Integer.parseInt(nuevo_dato));
                    // System.out.println("Cliente(ID) al que el vehiculo pertenece modificado con exito");
                // }
                // else if(opcion.equals("12")){
                    // lista_vehiculos.get(ID).modificar_num_ruedas(Integer.parseInt(nuevo_dato));
                    // System.out.println("Numero de ruedas modificado con exito");
                // }
                // else if(opcion.equals("13")){
                    // lista_vehiculos.get(ID).modificar_num_puertas(Integer.parseInt(nuevo_dato));
                    // System.out.println("Numero de puertas modificado con exito");
                // }
                // else if(opcion.equals("14")){
                    // lista_vehiculos.get(ID).modificar_ABS(Boolean.parseBoolean(nuevo_dato));
                    // System.out.println("Existencia de ABS modificada con exito");
                // }
                // else if(opcion.equals("15")){
                    // lista_vehiculos.get(ID).modificar_GPS(Boolean.parseBoolean(nuevo_dato));
                    // System.out.println("Existencia de GPS modificada con exito");
                // }
                // else if(opcion.equals("16")){
                    // lista_vehiculos.get(ID).modificar_aire_acondicionado(Boolean.parseBoolean(nuevo_dato));
                    // System.out.println("Existencia de aire acondicioanda modificada con exito");
                // }
            // }
            // else{
                // System.out.println("Esa no es una opcion valida");
            // }
            // System.out.println("");
        // }
    // }
    
    // // VERICACION SI UN VEHICULO EXISTE EN LA BASE DE DATOS
    
    // /**
    // * ACCESOR_VL_1a: Metodo para verificar si existe un vehiculo especifico en la BD por matricula y devolverlo
    // */
    // public Vehiculo comprobar_vehiculo(String matricula)
    // {
        // Vehiculo vehiculo = new Vehiculo();
        
        // for(Vehiculo vehiculo_loop : lista_vehiculos){
           // if (vehiculo_loop.matricula().toLowerCase().equals(matricula.toLowerCase())){
               // vehiculo = vehiculo_loop;
               // break;
           // }
        // }
        // return vehiculo;
    // }
            
    // /**
    // * ACCESOR_VL_1b: Metodo para verificar si existe un vehiculo especifico en la BD por matricula y devolverlo
    // */
    // public Vehiculo comprobar_vehiculo_prompt()
    // {
        // System.out.println("Introduzca la Matricula del vehiculo:");
        // System.out.println("");
        // String matricula_accesor_1b = input.invocar();
        // System.out.println("");
        
        // Vehiculo vehiculo_acc_1b = new Vehiculo();
        // vehiculo_acc_1b = comprobar_vehiculo(matricula_accesor_1b);
        
        // if(vehiculo_acc_1b.matricula().equals("N/A")){
            // System.out.println("No se encuentra un vehiculo con esa matricula en la base de datos");
            // System.out.println("");
        // }

        // return vehiculo_acc_1b;
    // }
    
    // // RESUMENES
    
    // /**
     // * RESUMEN_VL_1.1: Metodo para sacar un resumen de un Vehiculo particular
     // */
    // public void resumen_vehiculo_especifico(int ID_veh)
    // {
        // lista_vehiculos.get(ID_veh).resumen_vehiculo();
    // }

    // /**
     // * RESUMEN_VL_1.2: Metodo para sacar un resumen de todos los Vehiculos
     // */
    // public void resumen_todos_vehiculos()
    // {
        // if(lista_vehiculos.isEmpty()){
            // System.out.println("No hay vehiculos en la Base de Datos");
            // System.out.println("");
        // }
        // else{
            // for(Vehiculo vehiculo : lista_vehiculos){
                // vehiculo.resumen_vehiculo();
            // }
        // }
    // }
    
    // /**
     // * RESUMEN_VL_1.3: Metodo para sacar un resumen de todos los Vehiculos de un cliente especifico
     // */
    // public void resumen_todos_vehiculos_por_cliente()
    // {
        // Cliente cliente = comprobar_cliente_prompt();
        // int ID_client = cliente.ID_cliente();
        // boolean lista_vacia = true;
        
        // for(Vehiculo vehiculo_loop : lista_vehiculos){
            // if(vehiculo_loop.ID_cliente_pertenece() == (ID_client)){
                // vehiculo_loop.resumen_vehiculo();
                // lista_vacia = false;
            // }
        // }
        // if(lista_vacia == true){
            // System.out.println("No hay Vehiculos asociados a este cliente");
            // System.out.println("");
        // }
    // }
    
    // // INICIALIZADOR
    
    // /**
    // * AYUDANTE_VL_1: Metodo para crear los vehiculos iniciales de la base de datos
    // */       
    // private void rellena_vehiculos_iniciales()
    // {      
        // nuevo_vehiculo("Coche", "Monovolumen", "8473HRX", "01/07/2013", "15/07/2017",
                        // "Toyota", "Auris", "Gasolina", "Azul Abisal", "Manual", 1, 4,
                        // 5, true, false, true);
        
        // nuevo_vehiculo("Moto", "Carretera", "4521FTN", "01/03/2012", "15/07/2017",
                        // "Toyota", "Auris", "Gasolina", "Azul Abisal", "Manual", 2, 4,
                        // 5, true, false, true);
                        
        // nuevo_vehiculo("Camion", "Servicios", "4871GPO", "01/07/2013", "15/07/2017",
                        // "Mercedes", "Vito", "Diesel", "Blanco", "Automatico", 2, 4,
                        // 5, true, false, true);
    // }
}