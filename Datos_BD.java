
/**
 * Clase para crear los ArrayList donde se almacenarán todos los datos.
 *
 * @author (Froylán Málaga)
 * @version (V.00)
 */

import java.util.ArrayList;

public class Datos_BD
{
    // Creando los ArrayList donde se almacenarán: encargados, comerciales, mecánicos, personas y vehículos
    private ArrayList<Encargado> lista_encargados;
    private ArrayList<Comercial> lista_comerciales;
    private ArrayList<Mecanico> lista_mecanicos;
    private ArrayList<Cliente> lista_clientes;
    private ArrayList<Vehiculo> lista_vehiculos;

    /**
     * Constructor para todos los objetos en la clase
     */
    public Datos_BD()
    {
        lista_encargados = new ArrayList<Encargado>();
        lista_comerciales = new ArrayList<Comercial>();
        lista_mecanicos = new ArrayList<Mecanico>();
        lista_clientes = new ArrayList<Cliente>();
        lista_vehiculos = new ArrayList<Vehiculo>() ;
    }
    
    /**
     * GETTERS AND SETTERS de "lista_encargados"
     */
    public void nuevo_encargado(Encargado encargado)
    {
        lista_encargados.add(encargado);
    }
    
    /**
     * GETTERS AND SETTERS de "lista_comerciales"
     */
    public void nuevo_comercial(Comercial comercial)
    {
        lista_comerciales.add(comercial);
    }
    
    /**
     * GETTERS AND SETTERS de "lista_mecanicos"
     */
    public void nuevo_mecanico(Mecanico mecanico)
    {
        lista_mecanicos.add(mecanico);
    }
    
    /**
     * GETTERS AND SETTERS de "lista_clientes"
     */
    public void nuevo_cliente(Cliente cliente)
    {
        lista_clientes.add(cliente);
    }
    
    /**
     * GETTERS AND SETTERS de "lista_vehiculos"
     */
    public void nuevo_vehiculo(Vehiculo vehiculo)
    {
        lista_vehiculos.add(vehiculo);
    }
}
