
/**
 * Clase Encargado: Extension de la clase "Trabajador y Persona" que almacenara el ID_encargado
 * del Encargado. Sirve principalmente 3 funciones:
 *  - Almacenar datos especificos para Encargados.
 *  - Contiene metodos para modificar todas las Personas (Trabajador o Clientes).
 *  - Es el objeto con mayor jerarquia dentro de Trabajadores y Clientes
 *
 * @author Jose Froylan Malaga Cardoza
 * @version V.0.00
 */
public class Encargado extends Trabajador
{
    private int ID_encargado;

    /**
     * CONSTRUCTOR_1: Construye objetos de la clase Encargado
     */
    public Encargado()
    {
        ID_encargado = 0;
    }
      
    /**
     * MODIFICADOR_1: Metodos para modificar el ID del Encargado
     */
    public void modificar_ID_encargado(int Nuevo_dato)
    {
        ID_encargado = Nuevo_dato;
    }
    
    /**
     * MODIFICADOR_2: Metodo para modificar TODOS los datos de Encargado, incluyendo
     * los de Personas y Trabajador
     */
    public void modificar_todo_encargado(String DNI_e, String direccion_e, String nombre_e, String primer_apellido_e, 
                                String segundo_apellido_e, String fecha_nacimiento_e, String fecha_alta_e, 
                                String turno_e, int tlfn_personal_e, int tlfn_empresa_e, int ID_trabajador_e, 
                                int ID_encargado_e)
    {
        modificar_DNI(DNI_e);
        modificar_direccion(direccion_e);
        modificar_nombre(nombre_e);
        modificar_primer_apellido(primer_apellido_e);
        modificar_segundo_apellido(segundo_apellido_e);
        modificar_fecha_de_nacimiento(fecha_nacimiento_e);
        modificar_fecha_alta(fecha_alta_e);
        modificar_turno(turno_e);
        modificar_tlfn_per(tlfn_personal_e);
        modificar_tlfn_empresa(tlfn_empresa_e);
        modificar_ID_trabajador(ID_trabajador_e);
        modificar_ID_encargado(ID_encargado_e);
    }
        
    /**
     * ACCESOR_1: Metodos para acceder al ID del Encargado
     */
    public int ID_encargado()
    {
        return ID_encargado;
    }
    
    /**
    * RESUMEN_1: Resumen de las variables dentro de Encargado()
    */
    public void resumen_encargado()
    {
        System.out.println("RESUMEN ESPECIFICO A ENCARGADO");
        System.out.println("ID del encargado: " + ID_encargado);
        System.out.println("");
    }
        
    /**
    * RESUMEN_2: Resumen de todas las variables dentro de Encargado()
    */
    public void resumen_encargado_completo()
    {
        System.out.println("*****************************************************");
        System.out.println("RESUMEN DEL ENCARGADO: " + nombre() + " " + primer_apellido());
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
        System.out.println("ID del encargado: " + ID_encargado);
        System.out.println("*****************************************************");
        System.out.println("");
    }
}
