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
    
    /**
     * Esto es un método donde podemos meter a mano la fecha de nuesto calendario.
     * Tal fecha debe ir comprendida entre los años 2000 al 2099.
     */    
    public void fijarFecha(int dd, int mm, int aaaa)
    {   if(aaaa <= 2000)
        {
            System.out.println("Inserte un año entre 2000-2099");
        }
        if (aaaa > 2099)
        {
            System.out.println("Inserte un año entre 2000-2099");
        }
        dia = dd;
        mes= mm;
        anno= aaaa;
    }
    
    /**
     * Esto es un método que nos va a permitir avanzar dia a dia.
     * Después del 30 pasará al siguiente mes y en el mes 12, 
     * que es el último mes año pasará al siguiente año.
     */     
    public void anvanzarFecha()
    {
     if(dia < 31)
     {
        dia = dia +1;
     }
     if(dia == 31)
     {
         dia =1;
         mes = mes +1;
     }
     if(mes == 13)
     {
        mes = 1;
        anno = anno +1;
     }
    }    
}
