
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
        System.out.println("ID del encargado: " + ID_encargado);
    }
        
    /**
    * RESUMEN_2: Resumen de todas las variables dentro de Encargado()
    */
    public void resumen_encargado_completo()
    {
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
        System.out.println("");
    }
}
