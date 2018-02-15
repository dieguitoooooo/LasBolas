import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agenda;
    /**
     * Constructor de objetos de la clase AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Meter el numero del contacto
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }
    
    /**
     * Conseguir el numero del contacto
     */
    public void lookupNumber(String name)
    {
        System.out.println(agenda.get(name));
    }
}
