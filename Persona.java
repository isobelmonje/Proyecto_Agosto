
/**
 * Clase Persona: Encargada de gestionar la información referente a las personas dentro de la bd:
 *  - Almacenar información personal fuera del aḿbito del trabajo
 *  - Contiene metodos para modificar todas las variables.
 *  - Es el objeto con menor jerarquia junto con vehiculo y es la base para Clientes y Trabajadores
 *  
 * @author Jose Froylan Malaga Cardoza
 * @version V.0.00
 */
public class Persona
{
    private String DNI;
    private int tlfn_per;
    private String direccion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String fecha_de_nacimiento;
    private String fecha_alta;
    private boolean alta;
    
    /**
    * CONSTRUCTOR_1: Construye objetos de la clase Persona e inicializa las variables
    */
    public Persona()
    {
        DNI = "N/A";
        tlfn_per = 0;
        direccion = "N/A";
        nombre = "N/A";
        primer_apellido = "N/A";
        segundo_apellido = "N/A";
        fecha_de_nacimiento = "N/A";
        fecha_alta = "N/A";
        alta = true;
    }
    
    /**
    * CONSTRUCTOR_2: Construye objetos de la clase Persona e inicializa las variables con parametros
    *                   que le pasará el usuario.
    */
    public Persona(String DNI_p, int tlfn_personal_p, String direccion_p, String nombre_p,
                        String primer_apellido_p, String segundo_apellido_p, String fecha_nacimiento_p,
                        String fecha_alta_p)
    {
        DNI = DNI_p;
        tlfn_per = tlfn_personal_p;
        direccion = direccion_p;
        nombre = nombre_p;
        primer_apellido = primer_apellido_p;
        segundo_apellido = segundo_apellido_p;
        fecha_de_nacimiento = fecha_nacimiento_p;
        fecha_alta = fecha_alta_p;
        alta = true;
    }
    
    /**
    * MODIFICADOR_1: Metodo para modificar el DNI de la Persona
    */
    public void modificar_DNI(String dato_nuevo)
    {
        DNI= dato_nuevo;
    }
    
    /**
    * MODIFICADOR_2: Metodo para modificar el telefono personal de la Persona
    */
    public void modificar_tlfn_per(int dato_nuevo)
    {
        tlfn_per = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_3: Metodo para modificar la dirección de la Persona
    */
    public void modificar_direccion(String dato_nuevo)
    {
        direccion = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_4: Metodo para modificar el nombre de la Persona
    */
    public void modificar_nombre(String dato_nuevo)
    {
        nombre = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_5: Metodo para modificar el primer apellido de la Persona
    */
    public void modificar_primer_apellido(String dato_nuevo)
    {
        primer_apellido = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_6: Metodo para modificar el segundo apellido de la Persona
    */
    public void modificar_segundo_apellido(String dato_nuevo)
    {
        segundo_apellido = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_7: Metodo para modificar la fecha de nacimiento de la Persona
    */
    public void modificar_fecha_de_nacimiento(String dato_nuevo)
    {
        fecha_de_nacimiento = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_8: Metodo para modificar la fecha de alta de la Persona
    */
    public void modificar_fecha_alta(String dato_nuevo)
    {
        fecha_alta = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_9: Metodo para modificar el estado de alta de la Persona
    */
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
    * MODIFICADOR_10: Metodo para modificar TODOS los datos de Persona, excepto el alta que deberá modificarse 
    * mediante MODIFICADOR_9: modificar_alta()
    */
    public void modificar_todo_persona(String DNI_p, String direccion_p, String nombre_p, String primer_apellido_p, 
                                String segundo_apellido_p, String fecha_nacimiento_p, String fecha_alta_p, int tlfn_personal_p)
    {
        modificar_DNI(DNI_p);
        modificar_direccion(direccion_p);
        modificar_nombre(nombre_p);
        modificar_primer_apellido(primer_apellido_p);
        modificar_segundo_apellido(segundo_apellido_p);
        modificar_fecha_de_nacimiento(fecha_nacimiento_p);
        modificar_fecha_alta(fecha_alta_p);
        modificar_tlfn_per(tlfn_personal_p);
    }
   
    /**
    * ACCESOR_1: Metodo para acceder al DNI de la Persona
    */
    public String DNI()
    {
        return DNI;
    }
    
    /**
    * ACCESOR_2: Metodo para acceder al telefono personal de la Persona
    */
    public int tlfn_per()
    {
        return tlfn_per;
    }
    
    /**
    * ACCESOR_3: Metodo para acceder a la dirección de la Persona
    */
     public String direccion()
    {
        return direccion;
    }
    
    /**
    * ACCESOR_4: Metodo para acceder al nombre de la Persona
    */
    public String nombre()
    {
        return nombre;
    }
    
    /**
    * ACCESOR_5: Metodo para acceder al primer apellido de la Persona
    */
    public String primer_apellido()
    {
        return primer_apellido;
    }
    
    /**
    * ACCESOR_6: Metodo para acceder al segundo apellido de la Persona
    */
    public String segundo_apellido()
    {
        return segundo_apellido;
    }
    
    /**
    * ACCESOR_7: Metodo para acceder a la fecha de nacimiento de la Persona
    */
     public String fecha_de_nacimiento()
    {
        return fecha_de_nacimiento;
    } 
    
    /**
    * ACCESOR_8: Metodo para acceder a la fecha de alta de la Persona
    */
    public String fecha_alta()
    {
        return fecha_alta;
    }
 
    /**
    * ACCESOR_9: Metodo para acceder al estado de alta de la Persona
    */
    public boolean alta()
    {
        return alta;
    }

    /**
    * RESUMEN_1: Resumen de todas las variables dentro de Persona()
    */
    public void resumen_persona()
    {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("***** " + nombre.toUpperCase() + " " + primer_apellido.toUpperCase() + " *****");
        // System.out.println("RESUMEN DE LA PERSONA: " + nombre() + " " + primer_apellido());
        System.out.println("Nombre completo: " + nombre + " " + primer_apellido + " " + segundo_apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Telefono personal: " + tlfn_per);
        System.out.println("Direccion: " + direccion);
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento);
        System.out.println("Fecha de alta: " + fecha_alta);
        System.out.println("Estado de alta: " + alta);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("");
    }
}
