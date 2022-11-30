import java.awt.*;
import javax.swing.*;


public class background extends JPanel {


    public void paintComponent( Graphics window )
    {

        //this allows us to put a png,jpg, or gif
        Graphics2D g2 = (Graphics2D) window;
        Image img1 = Toolkit.getDefaultToolkit().getImage("img/moo.jpg"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 650 , 0 , 1370 , 1370 , this);

        //Image img2 = Toolkit.getDefaultToolkit().getImage("img/bob.png"); /*the image cannot be in the SRC folder*/
        //g2.drawImage(img2, 350, 50, 100 , 100 , this);

        //Image img3 = Toolkit.getDefaultToolkit().getImage("img/fish.gif"); /*the image cannot be in the SRC folder*/
        //g2.drawImage(img3, 400, 300, 100 , 100 , this);


    }
}
