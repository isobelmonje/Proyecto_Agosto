

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_DB.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test_DB
{
    /**
     * Default constructor for test class Test_DB
     */
    public Test_DB()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test_BD()
    {
        Datos_BD datos_BD1 = new Datos_BD();
        datos_BD1.nuevo_trabajador("50548860N", 661862094, "Calypo Fado", "Jose Froylan", "Malaga", 
                                    "Cardoza", "18/01/1987", "10/10/2010", 6, 662872195, "mecanico",
                                    "tarde", "6666");
        datos_BD1.nuevo_trabajador("47879050X", 666361248, "Navalcarnero", "Miriam", "Monje", 
                                    "Morales", "06/03/1989", "11/11/2011", 7, 667851681, "mecanico",
                                    "fin de semana", "7777" );
                                    
        datos_BD1.resumen_todos_trabajadores();
    }

    @Test
    public void Test_Persona()
    {
        Persona persona1 = new Persona();
        persona1.modificar_todo_persona("50548860N", "Calypo Fado", "Jose Froylan", "Malaga", 
                                        "Cardoza", "18/01/1987", "10/10/2010", 661862094);
        persona1.resumen_persona();
    }
    
    @Test
    public void Test_Trabajador()
    {
        System.out.println("CREACIÓN DE OBJETO:");
        System.out.println("");
        Trabajador trabaj1 = new Trabajador("50548860N", 661862094, "Calypo Fado", "Jose Froylan",
                                            "Malaga", "Cardoza", "18/01/1987", "10/10/2010", 6,
                                            662872195, "mecanico", "tarde", "6666");
        trabaj1.resumen_trabajador();
        trabaj1.resumen_trabajador_completo_s_passwd();
        
        System.out.println("MODIFICACIÓN DE OBJETO:");
        System.out.println("");                                    
        trabaj1.modificar_todo_trabajador("50548860N", 661862094, "Calypo Fado", "Jose Fernando",
                                            "Malaga", "Cardoza", "18/01/1987", "10/10/2010", 6,
                                            662872195, "mecanico", "tarde");
        trabaj1.resumen_trabajador();
        trabaj1.resumen_trabajador_completo_c_passwd();
    }
}