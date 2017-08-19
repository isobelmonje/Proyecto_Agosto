/**
 * La clase cliente .
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente extends Persona
{  
    private int ID_cliente;
    
    // CONSTRUCTORES

    /**
    * CONSTRUCTOR_1: Construye objetos de la clase Cliente e inicializa las variables
    */
    public Cliente()
    {
        ID_cliente = 0;
    }
    
    /**
    * CONSTRUCTOR_2: Construye objetos de la clase Cliente e inicializa las variables con parametros
    *                   que le pasará el usuario.
    */
    public Cliente(String DNI_cl, int tlfn_personal_cl, String direccion_cl, String nombre_cl,
                        String primer_apellido_cl, String segundo_apellido_cl, String fecha_nacimiento_cl,
                        String fecha_alta_cl, int ID_cliente_cl)
    {
        modificar_DNI(DNI_cl);
        modificar_tlfn_per(tlfn_personal_cl);
        modificar_direccion(direccion_cl);
        modificar_nombre(nombre_cl);
        modificar_primer_apellido(primer_apellido_cl);
        modificar_segundo_apellido(segundo_apellido_cl);
        modificar_fecha_de_nacimiento(fecha_nacimiento_cl);
        modificar_fecha_alta(fecha_alta_cl);
        
        ID_cliente = ID_cliente_cl;
    }
    
    // MODIFICADORES

    /**
    * MODIFICADOR_1: Metodo para modificar el ID del Cliente
    */
    public void modificar_ID_cliente(int Nuevo_dato)
    {
        ID_cliente = Nuevo_dato;
    }
    
    /**
    * MODIFICADOR_2: Metodo para modificar TODOS los datos de Cliente, incluyendo
    * los de Personas
    */
    public void modificar_todo_cliente(String DNI_cl, int tlfn_personal_cl, String direccion_cl,
                        String nombre_cl, String primer_apellido_cl, String segundo_apellido_cl,
                        String fecha_nacimiento_cl, String fecha_alta_cl, int ID_cliente_cl)
    {
        modificar_DNI(DNI_cl);
        modificar_tlfn_per(tlfn_personal_cl);
        modificar_direccion(direccion_cl);
        modificar_nombre(nombre_cl);
        modificar_primer_apellido(primer_apellido_cl);
        modificar_segundo_apellido(segundo_apellido_cl);
        modificar_fecha_de_nacimiento(fecha_nacimiento_cl);
        modificar_fecha_alta(fecha_alta_cl);
        
        ID_cliente = ID_cliente_cl;
    }
    
    // ACCESORES
    
    /**
    * ACCESOR_1: Metodo para acceder al ID del cliente
    */
    public int ID_cliente()
    {
        return ID_cliente;
    }
    
    // RESUMENES
   
    /**
    * RESUMEN_1: Resumen de todas las variables dentro de Cliente()
    */
    public void resumen_cliente()
    {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("RESUMEN DEL CLIENTE: " + nombre() + " " + primer_apellido());
        System.out.println("Nombre completo: " + nombre() + " " + primer_apellido() + " " + segundo_apellido());
        System.out.println("DNI: " + DNI());
        System.out.println("Telefono personal: " + tlfn_per());
        System.out.println("Direccion: " + direccion());
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento());
        System.out.println("Fecha de alta: " + fecha_alta());
        System.out.println("Estado de alta: " + alta());
        System.out.println("ID del cliente: " + ID_cliente);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("");
    }
}