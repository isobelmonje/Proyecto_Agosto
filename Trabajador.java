import java.text.Normalizer;
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
    private int tlfn_empresa;
    private String tipo_trabajador;
    private String turno;
    private String email;
    private String password;
    
    /**
    * CONSTRUCTOR_1: Construye objetos de la clase Trabajador e inicializa las variables
    */
    public Trabajador()
    {
       ID_trabajador = 0;
       tlfn_empresa = 0;
       tipo_trabajador = "";
       turno = "";
       email = "";
       password = "";
    }
    
    /**
    * CONSTRUCTOR_2: Construye objetos de la clase Trabajador e inicializa las variables con parametros
    *                   que le pasará el usuario.
    */
    public Trabajador(String DNI_t, int tlfn_personal_t, String direccion_t, String nombre_t,
                        String primer_apellido_t, String segundo_apellido_t, String fecha_nacimiento_t,
                        String fecha_alta_t, int ID_trabajador_t, int tlfn_empresa_t, 
                        String tipo_trabajador_t, String turno_t, String password_t)
    {
        modificar_DNI(DNI_t);
        modificar_tlfn_per(tlfn_personal_t);
        modificar_direccion(direccion_t);
        modificar_nombre(nombre_t);
        modificar_primer_apellido(primer_apellido_t);
        modificar_segundo_apellido(segundo_apellido_t);
        modificar_fecha_de_nacimiento(fecha_nacimiento_t);
        modificar_fecha_alta(fecha_alta_t);
        
        ID_trabajador = ID_trabajador_t;
        tlfn_empresa = tlfn_empresa_t;
        tipo_trabajador = tipo_trabajador_t;
        turno = turno_t;
        email = email_generator();
        password = password_t;
    }
    
    /**
    * MODIFICADOR_1: Metodo para modificar el ID del Trabajador
    */
    public void modificar_ID_trabajador(int nuevo_dato)
    {
        ID_trabajador = nuevo_dato;
    }
    
        /**
    * MODIFICADOR_2: Metodo para modificar el telefono de empresa del trabajador;
    */
    public void modificar_tlfn_empresa(int nuevo_dato)
    {
        tlfn_empresa = nuevo_dato;
    }
    
    /**
    * MODIFICADOR_3: Metodo para modificar el turno del Trabajador
    */
    public void modificar_tipo_trabajador(String nuevo_dato)
    {
        tipo_trabajador = nuevo_dato;
    }
    
    /**
    * MODIFICADOR_4: Metodo para modificar el turno del Trabajador
    */
    public void modificar_turno(String nuevo_dato)
    {
        turno = nuevo_dato;
    }
    
    /**
    * MODIFICADOR_5: Metodo para modificar el email del Trabajador
    */
    public void modificar_email(String nuevo_dato)
    {
        email = nuevo_dato;
    }
    
    /**
    * MODIFICADOR_6: Metodo para modificar el password del Trabajador
    */
    public void modificar_password(String nuevo_dato)
    {
        password = nuevo_dato;
    }
   
    /**
    * MODIFICADOR_7: Metodo para modificar TODOS los datos de Trabajador, incluyendo
    * los de Personas
    */
    public void modificar_todo_trabajador(String DNI_t, int tlfn_personal_t, String direccion_t, 
                                String nombre_t, String primer_apellido_t, String segundo_apellido_t,
                                String fecha_nacimiento_t, String fecha_alta_t, int ID_trabajador_t,
                                int tlfn_empresa_t, String tipo_trabajador_t, String turno_t)
    {
        modificar_DNI(DNI_t);
        modificar_tlfn_per(tlfn_personal_t);
        modificar_direccion(direccion_t);
        modificar_nombre(nombre_t);
        modificar_primer_apellido(primer_apellido_t);
        modificar_segundo_apellido(segundo_apellido_t);
        modificar_fecha_de_nacimiento(fecha_nacimiento_t);
        modificar_fecha_alta(fecha_alta_t);
        
        ID_trabajador = ID_trabajador_t;
        tlfn_empresa = tlfn_empresa_t;
        tipo_trabajador = tipo_trabajador_t;
        turno = turno_t;
        email = email_generator();
    }
    
    /**
    * ACCESOR_1: Metodo para acceder al ID_trabajador del trabajador
    */
    public int ID_trabajador()
    {
        return ID_trabajador;
    }
    
    /**
    * ACCESOR_2: Metodo para acceder al telefono de empresa del trabajador
    */
    public int tlfn_empresa()
    {
        return tlfn_empresa;
    }
    
    /**
    * ACCESOR_3: Metodo para acceder al tipo de trabajador
    */
    public String tipo_trabajador()
    {
        return tipo_trabajador;
    }
    
    /**
    * ACCESOR_4: Metodo para acceder al turno del trabajador
    */
    public String turno()
    {
        return turno;
    }
    
    /**
    * ACCESOR_5: Metodo para acceder al email del trabajador
    */
    public String email()
    {
        return email;
    }
    
    /**
    * ACCESOR_6: Metodo para acceder al password del trabajador
    */
    public String password()
    {
        return password;
    }
    
    /**
    * RESUMEN_1: Resumen de las variables dentro de Trabajador()
    */
    public void resumen_trabajador()
    {
        System.out.println("RESUMEN ESPECIFICO A TRABAJADOR");
        System.out.println("ID del trabajador: " + ID_trabajador);
        System.out.println("Tipo de Trabajador: " + tipo_trabajador);
        System.out.println("Telefono de Empresa: " + tlfn_empresa);
        System.out.println("E-mail: " + email);
        System.out.println("Turno: " + turno);
        System.out.println("");
    }
        
    /**
    * RESUMEN_2: Resumen de todas las variables dentro de Trabajador(), excepto password
    */
    public void resumen_trabajador_completo_s_passwd()
    {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("***** " + tipo_trabajador.toUpperCase() + " *****");
        System.out.println("RESUMEN DEL TRABAJADOR: " + nombre() + " " + primer_apellido());
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
        System.out.println("E-mail: " + email);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("");
    }
    
    /**
    * RESUMEN_3: Resumen de todas las variables dentro de Trabajador()
    */
    public void resumen_trabajador_completo_c_passwd()
    {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("***** " + tipo_trabajador.toUpperCase() + " *****");
        System.out.println("RESUMEN DEL TRABAJADOR: " + nombre() + " " + primer_apellido());
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
        System.out.println("E-mail: " + email);
        System.out.println("Password: " + password);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("");
    }
    
    /**
    * AYUDANTE_1: Metodo privado para crear emails validos
    */
    private String email_generator()
    {
        int limit = nombre().length();
        String email_ayud = "";
        
        for(int i=0; i<limit ;i++)
        {
            char caracter = nombre().charAt(i);
            
            if(caracter == ' '){
            }
            else{
                email_ayud = email_ayud + nombre().charAt(i);
            }
        }
        
        email_ayud = email_ayud + "_" + primer_apellido() + "@tallerj.com";
        
        email_ayud = Normalizer.normalize(email_ayud, Normalizer.Form.NFD); //Para quitar acentos
        email_ayud = email_ayud.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return email_ayud.toLowerCase();
    }
}