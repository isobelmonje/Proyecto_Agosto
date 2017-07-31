
/**
 * Definicion de objeto general "Personas".
 * @author (####### CAMBIAR A NUESTRO NOMBRE######) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String DNI;
    private String telefono;
    private String direccion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String fecha_de_nacimiento;
    private String fecha_alta_en_la_base;
    private boolean alta;

    /**
     * Constructor for objects of class Trabajador
     */
    public Persona()
    {
        DNI = "N/A";
        telefono = "N/A";
        direccion = "N/A";
        nombre = "N/A";
        primer_apellido = "N/A";
        segundo_apellido = "N/A";
        fecha_de_nacimiento = "N/A";
        fecha_alta_en_la_base = "N/A";
        alta = true;
    }

    /**
     * Metodos para modificar las variables
     */
    public void Modificar_DNI(String dato_nuevo)
    {
        DNI= dato_nuevo;
    }
    public void Modificar_telefono(String dato_nuevo)
    {
        telefono = dato_nuevo;
    }
    public void Modificar_direccion(String dato_nuevo)
    {
        direccion = dato_nuevo;
    }
    public void Modificar_nombre(String dato_nuevo)
    {
        nombre = dato_nuevo;
    }
    public void Modificar_primer_apellido(String dato_nuevo)
    {
        primer_apellido = dato_nuevo;
    }
    public void Modificar_segundo_apellido(String dato_nuevo)
    {
        segundo_apellido = dato_nuevo;
    }
    public void Modificar_fecha_de_nacimiento(String dato_nuevo)
    {
        fecha_de_nacimiento = dato_nuevo;
    }
    public void Modificar_fecha_alta_en_la_base(String dato_nuevo)
    {
        fecha_alta_en_la_base = dato_nuevo;
    }
    public void Modificar_alta()
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
    public String telefono()
    {
        // put your code here
        return telefono;
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
    
     public String fecha_alta_en_la_base()
    {
        // put your code here
        return fecha_alta_en_la_base;
    }
     public boolean alta()
    {
        // put your code here
        return alta;
    }
    

}
