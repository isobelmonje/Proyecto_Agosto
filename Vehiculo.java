
/** Write a description of class Vehículo here.
 * Esta clase se ha creado para poder almacenar la información referente a vehículos, adicionalmente 
 * se han desarrollado métodos para poder acceder y/o modificar los atributos del objeto.
 * @author Miriam Monje Morales 
 * @version (v.0)
 */

public class Vehiculo
{
    private String vehiculo;
    private String tipo_vehiculo;
    private String matricula;
    private String fecha_matriculacion;
    private String fecha_ITV_ultima;
    private String marca;
    private String modelo;
    private String combustible;
    private String color;
    private String tipo_cambio;
    private int ID_cliente_pertenece;
    private int num_ruedas;
    private int num_puertas;
    private boolean ABS;
    private boolean GPS;
    private boolean aire_acondicionado;
    
    // CONSTRUCTORES

    /**
    * CONSTRUCTOR_1: Construye objetos de la clase Vehiculo e inicializa las variables
    */
    public Vehiculo()
    {
        vehiculo = "N/A";
        tipo_vehiculo = "N/A";
        matricula = "N/A";
        fecha_matriculacion = "N/A";
        fecha_ITV_ultima = "N/A";
        marca = "N/A";
        modelo = "N/A";
        combustible = "N/A";
        color= "N/A";
        tipo_cambio = "N/A";
        ID_cliente_pertenece = 0;
        num_ruedas = 0;
        num_puertas = 0;
        ABS = true;
        GPS = true;
        aire_acondicionado= true;
    }
    
    /**
    * CONSTRUCTOR_2: Construye objetos de la clase Vehiculo e inicializa las variables con parametros
    *                   que le pasará el usuario.
    */
    public Vehiculo(String vehiculo_vl, String tipo_vehiculo_vl, String matricula_vl, 
                    String fecha_matriculacion_vl, String fecha_ITV_ultima_vl, String marca_vl, 
                    String modelo_vl, String combustible_vl, String color_vl, String tipo_cambio_vl,
                    int ID_cliente_pertenece_vl, int num_ruedas_vl, int num_puertas_vl, boolean ABS_vl,
                    boolean GPS_vl, boolean aire_acondicionado_vl)
    {
        vehiculo = vehiculo_vl;
        tipo_vehiculo = tipo_vehiculo_vl;
        matricula = matricula_vl;
        fecha_matriculacion = fecha_matriculacion_vl;
        fecha_ITV_ultima = fecha_ITV_ultima_vl;
        marca = marca_vl;
        modelo = modelo_vl;
        combustible = combustible_vl;
        color = color_vl;
        tipo_cambio = tipo_cambio_vl;
        ID_cliente_pertenece = ID_cliente_pertenece_vl;
        num_ruedas = num_ruedas_vl;
        num_puertas = num_puertas_vl;
        ABS = ABS_vl;
        GPS = GPS_vl;
        aire_acondicionado = aire_acondicionado_vl;
    }
    
    // MODIFICADORES
    
    /**
    * MODIFICADOR_1: Metodo para modificar el Vehiculo
    */
    public void modificar_vehiculo(String dato_nuevo)
    {
        vehiculo = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_2: Metodo para modificar el tipo del Vehiculo
    */
    public void modificar_tipo_vehiculo(String dato_nuevo)
    {
        tipo_vehiculo = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_3: Metodo para modificar la matricula del Vehiculo
    */
    public void modificar_matricula(String dato_nuevo)
    {
        matricula = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_4: Metodo para modificar la fecha de matriculacion del Vehiculo
    */
    public void modificar_fecha_matriculacion(String dato_nuevo)
    {
        fecha_matriculacion = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_5: Metodo para modificar la fecha de ultima ITV del Vehiculo
    */
    public void modificar_fecha_ITV_ultima(String dato_nuevo)
    {
        fecha_ITV_ultima = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_6: Metodo para modificar la marca del Vehiculo
    */
    public void modificar_marca(String dato_nuevo)
    {
        marca = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_7: Metodo para modificar el modelo del Vehiculo
    */
    public void modificar_modelo(String dato_nuevo)
    {
        modelo = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_8: Metodo para modificar el tipo de combustible del Vehiculo
    */
    public void modificar_combustible(String dato_nuevo)
    {
        combustible = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_9: Metodo para modificar el color del Vehiculo
    */
    public void modificar_color(String dato_nuevo)
    {
        color = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_10: Metodo para modificar el tipo de cambio del Vehiculo
    */
    public void modificar_tipo_cambio(String dato_nuevo)
    {
        tipo_cambio = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_11: Metodo para modificar el ID del cliente al que el Vehiculo
    */    
    public void modificar_ID_cliente_pertenece(int dato_nuevo)
    {
        ID_cliente_pertenece = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_12: Metodo para modificar el numero de ruedas del Vehiculo
    */
    public void modificar_num_ruedas(int dato_nuevo)
    {
        num_ruedas = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_13: Metodo para modificar el numero de puertas del Vehiculo
    */
    public void modificar_num_puertas(int dato_nuevo)
    {
        num_puertas = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_14: Metodo para modificar la existencia de ABS en el Vehiculo
    */    
    public void modificar_ABS(boolean dato_nuevo)
    {
        ABS = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_15: Metodo para modificar la existencia de GPS en el Vehiculo
    */
    public void modificar_GPS(boolean dato_nuevo)
    {
        GPS = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_16: Metodo para modificar la existencia de aire acondicionado en el Vehiculo
    */
    public void modificar_aire_acondicionado(boolean dato_nuevo)
    {
        aire_acondicionado = dato_nuevo;
    }
    
    /**
    * MODIFICADOR_17: Metodo para modificar la existencia de aire acondicionado en el Vehiculo
    */
    public void modificar_todo_vehiculo(String vehiculo_vl, String tipo_vehiculo_vl, String matricula_vl,
                                        String fecha_matriculacion_vl, String fecha_ITV_ultima_vl,
                                        String marca_vl, String modelo_vl, String combustible_vl, 
                                        String color_vl, String tipo_cambio_vl, int ID_cliente_pertenece_vl,
                                        int num_ruedas_vl, int num_puertas_vl, boolean ABS_vl,
                                        boolean GPS_vl, boolean aire_acondicionado_vl)
    {
        vehiculo = vehiculo_vl;
        tipo_vehiculo = tipo_vehiculo_vl;
        matricula = matricula_vl;
        fecha_matriculacion = fecha_matriculacion_vl;
        fecha_ITV_ultima = fecha_ITV_ultima_vl;
        marca = marca_vl;
        modelo = modelo_vl;
        combustible = combustible_vl;
        color = color_vl;
        tipo_cambio = tipo_cambio_vl;
        ID_cliente_pertenece = ID_cliente_pertenece_vl;
        num_ruedas = num_ruedas_vl;
        num_puertas = num_puertas_vl;
        ABS = ABS_vl;
        GPS = GPS_vl;
        aire_acondicionado = aire_acondicionado_vl;
    }
    
    // ACCESORES
    
    /**
    * ACCESOR_1: Metodo para acceder al Vehiculo
    */
    public String vehiculo()
    {
        return vehiculo;
    }
    
    /**
    * ACCESOR_2: Metodo para acceder al tipo del Vehiculo
    */
    public String tipo_vehiculo()
    {
        return tipo_vehiculo;
    }
    
    /**
    * ACCESOR_3: Metodo para acceder a la matricula del Vehiculo
    */
    public String matricula()
    {
        return matricula;
    }
    
    /**
    * ACCESOR_4: Metodo para acceder a la fecha de matriculacion del Vehiculo
    */
    public String fecha_matriculacion()
    {
        return fecha_matriculacion;
    }
    
    /**
    * ACCESOR_5: Metodo para acceder a la fecha de ultima ITV del Vehiculo
    */
    public String fecha_ITV_ultima()
    {
        return fecha_ITV_ultima;
    }
    
    /**
    * ACCESOR_6: Metodo para acceder a la marca del Vehiculo
    */
    public String marca()
    {
        return marca;
    }
    
    /**
    * ACCESOR_7: Metodo para acceder a la modelo del Vehiculo
    */
    public String modelo()
    {
        return modelo;
    }
    
    /**
    * ACCESOR_8: Metodo para acceder al tipo de combustible del Vehiculo
    */
    public String combustible()
    {
        return combustible;
    }
    
    /**
    * ACCESOR_9: Metodo para acceder al color del Vehiculo
    */
    public String color()
    {
        return color;
    }
    
    /**
    * ACCESOR_10: Metodo para acceder al tipo de cambio del Vehiculo
    */
    public String tipo_cambio()
    {
        return tipo_cambio;
    }
    
    /**
    * ACCESOR_11: Metodo para acceder al ID del cliente que pertenece el Vehiculo
    */
    public int ID_cliente_pertenece()
    {
        return ID_cliente_pertenece;
    }
    
    /**
    * ACCESOR_12: Metodo para acceder al numero de ruedas del Vehiculo
    */
    public int num_ruedas()
    {
        return num_ruedas;
    }
    
    /**
    * ACCESOR_13: Metodo para acceder al numero de puertas del Vehiculo
    */
    public int num_puertas()
    {
        return num_puertas;
    } 
    
    /**
    * ACCESOR_14: Metodo para acceder a la existencia de ABS del Vehiculo
    */
    public boolean ABS()
    {
        return ABS;
    }
    
    /**
    * ACCESOR_15: Metodo para acceder a la existencia de GPS del Vehiculo
    */
    public boolean GPS()
    {
        return GPS;
    }
    
    /**
    * ACCESOR_16: Metodo para acceder a la existencia de aire acondicionado del Vehiculo
    */
    public boolean aire_acondicionado()
    {
        return aire_acondicionado;
    }
    
    // RESUMENES
   
    /**
    * RESUMEN_1: Resumen de todas las variables dentro de Vehiculo()
    */
    public void resumen_vehiculo()
    {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("***** " + vehiculo.toUpperCase() +":" + tipo_vehiculo.toLowerCase() + " *****");
        System.out.println("Matricula: " + matricula);
        System.out.println("Fecha de matriculacion: " + fecha_matriculacion);
        System.out.println("Fecha de ultima ITV: " + fecha_ITV_ultima);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de combustible: " + combustible);
        System.out.println("Color: " + color);
        System.out.println("Tipo de cambio: " + tipo_cambio);
        System.out.println("Pertenece a cliente(ID): " + ID_cliente_pertenece);
        System.out.println("Numero de ruedas: " + num_ruedas);
        System.out.println("Numero de puertas: " + num_puertas);
        System.out.println("Tiene ABS: " + ABS);
        System.out.println("Tiene GPS: " + GPS);
        System.out.println("Tiene aire acondicionado: " + aire_acondicionado);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("");
    }
}