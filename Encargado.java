
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
     * CONSTRUCTOR_1: Construye objetos de la clase encargado y pide al usuario los datos relevantes
     */
    public Encargado()
    {
        ID_encargado = 0;
    }
      
    /**
     * MODIFICADOR_1: Metodos para modificar el ID del encargado
     */
    public void modificar_ID_encargado(int Nuevo_dato)
    {
        ID_encargado = Nuevo_dato;
    }
    
    /**
     * ACCESOR_1: Metodos para acceder al ID del encargado
     */
    public int ID_encargado()
    {
        return ID_encargado;
    }
}
