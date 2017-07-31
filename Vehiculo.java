
/** Write a description of class Vehículo here.
 * Esta clase se ha creado para poder almacenar la información referente a vehículos, adicionalmente 
 * se han desarrollado métodos para poder acceder y/o modificar los atributos del objeto.
 * @author Miriam Monje Morales 
 * @version (v.0)
 */

public class Vehiculo
{
    // instance variables - replace the example below with your own
    private String tipo_de_vehiculo;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private int numero_de_puertas;
    private int numero_de_ruedas;
    private String tipo_de_cambio;
    private int matriculacion_year;
    private int capacidad_de_almacenamiento;
    private int numero_de_pasajeros;
    private boolean ABS;
    private boolean GPS;
    private boolean aire_acondicionado;
    private boolean descapotable;
    
    
    
    
    
    
    


    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo()
    {
        // initialise instance variables
        tipo_de_vehiculo = "N/A";
        marca = "N/A";
        modelo = "N/A";
        color= "N/A";
        combustible = "N/A";
        tipo_de_cambio = "N/A";
        ABS= true;
        aire_acondicionado= true;

        
        
    }   
    
    /**
     *Definición de modificadores de variables
     */
    
    public void Modificar_tipo_de_vehiculo(String dato_nuevo)
    {
        tipo_de_vehiculo = dato_nuevo;
    }
    
    public void Modificar_marca(String dato_nuevo)
    {
        marca = dato_nuevo;
    }
    
     public void Modificar_modelo(String dato_nuevo)
    {
        modelo = dato_nuevo;
    }
    
     public void Modificar_color(String dato_nuevo)
    {
        color = dato_nuevo;
    }
    
     public void Modificar_combustible(String dato_nuevo)
    {
        combustible = dato_nuevo;
    }
    
     public void Modificar_tipo_de_cambio(String dato_nuevo)
    {
        tipo_de_cambio = dato_nuevo;
    }
    
     public void Modificar_numero_de_puertas(int dato_nuevo)
    {
            numero_de_puertas = dato_nuevo;
    }
    
     public void Modificar_numero_de_ruedas(int dato_nuevo)
    {
        numero_de_ruedas = dato_nuevo;
    }
    
    public void Modificar_matriculacion_year(int dato_nuevo)
    {
        matriculacion_year = dato_nuevo;
    }
    public void Modificar_capacidad_de_almacenamiento(int dato_nuevo)
    {
        capacidad_de_almacenamiento = dato_nuevo;
    } 
    public void Modificar_numero_de_pasajeros(int dato_nuevo)
    {
        numero_de_pasajeros = dato_nuevo;
    }
    public void Modificar_ABS(boolean dato_nuevo)
    {
        ABS = dato_nuevo;
    }
    public void Modificar_GPS(boolean dato_nuevo)
    {
        GPS = dato_nuevo;
    }
    public void Modificar_aire_acondicionado(boolean dato_nuevo)
    {
        aire_acondicionado = dato_nuevo;
    }
    public void Modificar_descapotable(boolean dato_nuevo)
    {
        descapotable = dato_nuevo;
    }
    /**
     *Devuelve la marca del objeto vehículo
     */
    public String marca_vehiculo()
    {
        // put your code here
        return marca;
    }
    public String modelo_vehiculo()
    {
        // put your code here
        return modelo;
    }
     public String color_vehiculo()
    {
        // put your code here
        return color;
    }
     public String combustible_vehiculo()
    {
        // put your code here
        return combustible;
    }
    
     public String tipo_de_cambio_vehiculo()
    {
        // put your code here
        return tipo_de_cambio;
    }
     public int numero_de_puertas()
    {
        // put your code here
        return numero_de_puertas;
    }
     public int numero_de_ruedas()
    {
        // put your code here
        return numero_de_ruedas;
    } 
    
     public int matriculacion_year()
    {
        // put your code here
        return matriculacion_year;
    }
     public int capacidad_de_almacenamiento()
    {
        // put your code here
        return capacidad_de_almacenamiento;
    }
     public int numero_de_pasajeros()
    {
        // put your code here
        return numero_de_pasajeros;
    }
     public boolean ABS()
    {
        // put your code here
        return ABS;
    }
     public boolean GPS()
    {
        // put your code here
        return GPS;
    }
     public boolean aire_acondicionado()
    {
        // put your code here
        return aire_acondicionado;
    }
}   
