
/**
 * Clase Trabajador: Extension de la clase "Persona" que almacenara datos especificos a
 * trabajadores (ID_trabajador, tlfn_empresa, etc...). Sirve principalmente para:
 *  - Almacenar datos generales y comunes para todos los trabajadores
 * 
 * @author Jose Froylan Malaga Cardoza
 * @version V.0.00
 */
public class Trabajador extends Persona
{
    private int ID_trabajador;
    private String turno;
    private int tlfn_empresa;
    
    /**
     * CONSTRUCTOR_1: Construye objetos de la clase trabajador y pide al usuario los datos relevantes
     */
    public Trabajador()
    {
       ID_trabajador = 0;
       turno = "";
       tlfn_empresa = 0;
    }
    
    /**
     * MODIFICADOR_1: Metodo para modificar el ID_trabajador;
     */
    public void modificar_numero_de_trabajador(int nuevo_dato)
    {
        // put your code here
        ID_trabajador = nuevo_dato;
    }
    
    /**
     * MODIFICADOR_2: Metodo para modificar el turno del trabajador;
     */
    public void modificar_turno(String nuevo_dato)
    {
        turno = nuevo_dato;
    }
    
    /**
     * MODIFICADOR_3: Metodo para modificar el telefono de empresa del trabajador;
     */
    public void modificar_tlfn_empresa(int nuevo_dato)
    {
        tlfn_empresa = nuevo_dato;
    }
    
     

    
    public int numero_de_trabajador()
    {
        // put your code here
        return ID_trabajador;
    }
}
