/**
 * Esta es la clase de CalendarioBasico.
 */
public class calendarioBasico
{
    // Campos o atributos de la clase.
    private int dia;
    private int mes;
    private int anno;
        
    /**
     * Constructor de la clase calendario
     */
    public calendarioBasico()
    {
        // Aqui le damos un valor inicial a los campos.
        dia = 0;
        mes = 0;
        anno = 0;
    }
    
    /**
     * Esto es un método donde nos da una fecha predeterminada al invocarlo.
     */
    public String obtenerFecha()
    {
        dia = 01;
        mes = 01;
        anno = 01;
        return dia + "-" + mes + "-" + anno;
    }    
}
