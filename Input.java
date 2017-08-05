
/**
 * Clase para introducir datos mediante el interfaz de Taller Formulario
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class Input
{
    private String k;
    
    public Input()
    {
    }
    
    public String invocar()
    {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try{
            k = inp.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        return k;
    }
    
    public String invocar_q(String Frase)
    {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Frase);
        try{
            k = inp.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
       return k;
    }
}
