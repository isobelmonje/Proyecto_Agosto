
/**
 * Clase Comercial: Extension de la clase "Trabajador y Persona" que almacenara el ID_comercial
 * del Comercial. Sirve principalmente 3 funciones:
 *  - Almacenar datos especificos para Comerciales.
 *  - Contiene metodos para modificar todas los parametros de su estructura Trabajador y Persona.
 *  - Esta por debajo de Encargado en jerarquia y al mismo nivel que Mecanico (La jerarquia se define en
 *    la interfaz).
 *
 * @author (Jose Froylan Malaga Cardoza)
 * @version (V.0.00)
 */
public class Comercial extends Trabajador
{
    private int ID_comercial;

    /**
     * CONSTRUCTOR_1: Construye objetos de la clase Comercial
     */
    public Comercial()
    {
        ID_comercial = 0;
    }

    /**
     * MODIFICADOR_1: Metodos para modificar el ID del Comercial
     */
    public void modificar_ID_comercial(int Nuevo_dato)
    {
        ID_comercial = Nuevo_dato;
    }
    
    /**
     * MODIFICADOR_2: Metodo para modificar TODOS los datos de Comercial, incluyendo
     * los de Personas y Trabajador
     */
    public void modificar_todo_comercial(String DNI_c, String direccion_c, String nombre_c, String primer_apellido_c, 
                                String segundo_apellido_c, String fecha_nacimiento_c, String fecha_alta_c, 
                                String turno_c, int tlfn_personal_c, int tlfn_empresa_c, int ID_trabajador_c, 
                                int ID_comercial_c)
    {
        modificar_DNI(DNI_c);
        modificar_direccion(direccion_c);
        modificar_nombre(nombre_c);
        modificar_primer_apellido(primer_apellido_c);
        modificar_segundo_apellido(segundo_apellido_c);
        modificar_fecha_de_nacimiento(fecha_nacimiento_c);
        modificar_fecha_alta(fecha_alta_c);
        modificar_turno(turno_c);
        modificar_tlfn_per(tlfn_personal_c);
        modificar_tlfn_empresa(tlfn_empresa_c);
        modificar_ID_trabajador(ID_trabajador_c);
        modificar_ID_comercial(ID_comercial_c);
    }
        
    /**
     * ACCESOR_1: Metodos para acceder al ID del comercial
     */
    public int ID_comercial()
    {
        return ID_comercial;
    }
    
    /**
    * RESUMEN_1: Resumen de las variables dentro de Comercial()
    */
    public void resumen_comercial()
    {
        System.out.println("RESUMEN ESPECIFICO A COMERCIAL");
        System.out.println("ID del comercial: " + ID_comercial);
        System.out.println("");
    }
        
    /**
    * RESUMEN_2: Resumen de todas las variables dentro de Encargado()
    */
    public void resumen_comercial_completo()
    {
        System.out.println("*****************************************************");
        System.out.println("RESUMEN DEL COMERCIAL: " + nombre() + " " + primer_apellido());
        System.out.println("Nombre completo: " + nombre() + " " + primer_apellido() + " " + segundo_apellido());
        System.out.println("DNI: " + DNI());
        System.out.println("Telefono personal: " + tlfn_per());
        System.out.println("Direccion: " + direccion());
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento());
        System.out.println("Fecha de alta: " + fecha_alta());
        System.out.println("Estado de alta: " + alta());
        System.out.println("ID del trabajador: " + ID_trabajador());
        System.out.println("Turno: " + turno());
        System.out.println("Telefono de Empresa: " + tlfn_empresa());
        System.out.println("ID del comercial: " + ID_comercial);
        System.out.println("*****************************************************");
        System.out.println("");
    }
}