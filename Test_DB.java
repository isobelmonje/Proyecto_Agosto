

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
    public void Test_1()
    {
        Datos_BD datos_BD1 = new Datos_BD();
        datos_BD1.resumen_todos_encargados();
    }
}



