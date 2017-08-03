
/**
 * Definicion de objeto general "Personas".
 * @author (####### CAMBIAR A NUESTRO NOMBRE######) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String DNI;
    private String tlfn_per;
    private String direccion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String fecha_de_nacimiento;
    private String fecha_alta;
    private boolean alta;

    /**
     * Constructor for objects of class Trabajador
     */
    public Persona()
    {
        DNI = "N/A";
        tlfn_per = "N/A";
        direccion = "N/A";
        nombre = "N/A";
        primer_apellido = "N/A";
        segundo_apellido = "N/A";
        fecha_de_nacimiento = "N/A";
        fecha_alta = "N/A";
        alta = true;
    }

    /**
     * Metodos para modificar las variables
     */
    public void modificar_DNI(String dato_nuevo)
    {
        DNI= dato_nuevo;
    }
    public void modificar_tlfn_per(String dato_nuevo)
    {
        tlfn_per = dato_nuevo;
    }
    public void modificar_direccion(String dato_nuevo)
    {
        direccion = dato_nuevo;
    }
    public void modificar_nombre(String dato_nuevo)
    {
        nombre = dato_nuevo;
    }
    public void modificar_primer_apellido(String dato_nuevo)
    {
        primer_apellido = dato_nuevo;
    }
    public void modificar_segundo_apellido(String dato_nuevo)
    {
        segundo_apellido = dato_nuevo;
    }
    public void modificar_fecha_de_nacimiento(String dato_nuevo)
    {
        fecha_de_nacimiento = dato_nuevo;
    }
    public void modificar_fecha_alta(String dato_nuevo)
    {
        fecha_alta = dato_nuevo;
    }
    public void modificar_alta()
    {
        if (alta == false){
            alta = true;
        }
        else{
            alta = false;
        }
    }
    
    /**
     *Devuelve parametros del objeto persona
     */
    public String DNI()
    {
        // put your code here
        return DNI;
    }
    public String tlfn_per()
    {
        // put your code here
        return tlfn_per;
    }
     public String direccion()
    {
        // put your code here
        return direccion;
    }
     public String nombre()
    {
        // put your code here
        return nombre;
    }
    
     public String primer_apellido()
    {
        // put your code here
        return primer_apellido;
    }
     public String segundo_apellido()
    {
        // put your code here
        return segundo_apellido;
    }
     public String fecha_de_nacimiento()
    {
        // put your code here
        return fecha_de_nacimiento;
    } 
    
     public String fecha_alta()
    {
        // put your code here
        return fecha_alta;
    }
     public boolean alta()
    {
        // put your code here
        return alta;
    }
    
    public void resumen_persona()
    {
        System.out.println("Nombre completo: " + nombre + " " + primer_apellido + " " + segundo_apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Telefono personal: " + tlfn_per);
        System.out.println("Direccion: " + direccion);
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento);
        System.out.println("Fecha de alta: " + fecha_alta);
        System.out.println("Estado de alta: " + alta);
    }
}
