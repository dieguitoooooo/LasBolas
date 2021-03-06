import java.awt.Color;
import java.util.Random;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private BouncingBall[] bolas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce(int nBolas)
    {
        int ground = 400;   // position of the ground line
        
        bolas = new BouncingBall[nBolas];
        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        //Creamos numero de bolas indicadas por parametro
        Random aleatorio = new Random();
        for(int i=0; i<nBolas; i++){
            int tamannoBolas = aleatorio.nextInt(20) + 5;
            int blue = aleatorio.nextInt(256);
            int red = aleatorio.nextInt(256);
            int green = aleatorio.nextInt(256);
            
            Color color = new Color(red, blue, green);
            int posicionX = aleatorio.nextInt(300);
            
            BouncingBall bola = new BouncingBall(posicionX, 30, tamannoBolas, color, ground, myCanvas);
            bola.draw();
            bolas[i] = bola;
        }

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(20);           // small delay
            for(int i=0; i<nBolas; i++){
                bolas[i].move();
                // stop once ball has travelled a certain distance on x axis
                if(bolas[i].getXPosition() >= 550){
                    finished = true;
                }
            }

        }
    }
}
