
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
    * CONSTRUCTOR_1: Construye objetos de la clase Trabajador e inicializa las variables
    */
    public Trabajador()
    {
       ID_trabajador = 0;
       turno = "";
       tlfn_empresa = 0;
    }
    
    /**
    * MODIFICADOR_1: Metodo para modificar el ID del Trabajador
    */
    public void modificar_ID_trabajador(int nuevo_dato)
    {
        ID_trabajador = nuevo_dato;
    }
    
    /**
    * MODIFICADOR_2: Metodo para modificar el turno del Trabajador
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
    
    /**
    * ACCESOR_1: Metodo para acceder al ID_trabajador del trabajador
    */
    public int ID_trabajador()
    {
        return ID_trabajador;
    }
    
    /**
    * ACCESOR_2: Metodo para acceder al turno del trabajador
    */
    public String turno()
    {
        return turno;
    }
    
    /**
    * ACCESOR_3: Metodo para acceder al telefono de empresa del trabajador
    */
    public int tlfn_empresa()
    {
        return tlfn_empresa;
    }
    
    /**
    * RESUMEN_1: Resumen de las variables dentro de Trabajador()
    */
    public void resumen_trabajador()
    {
        System.out.println("ID del trabajador: " + ID_trabajador);
        System.out.println("Turno: " + turno);
        System.out.println("Telefono de Empresa: " + tlfn_empresa);
    }
        
    /**
    * RESUMEN_2: Resumen de todas las variables dentro de Persona()
    */
    public void resumen_trabajador_completo()
    {
        System.out.println("Nombre completo: " + nombre() + " " + primer_apellido() + " " + segundo_apellido());
        System.out.println("DNI: " + DNI());
        System.out.println("Telefono personal: " + tlfn_per());
        System.out.println("Direccion: " + direccion());
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento());
        System.out.println("Fecha de alta: " + fecha_alta());
        System.out.println("Estado de alta: " + alta());
        System.out.println("ID del trabajador: " + ID_trabajador);
        System.out.println("Turno: " + turno);
        System.out.println("Telefono de Empresa: " + tlfn_empresa);
    }
}
