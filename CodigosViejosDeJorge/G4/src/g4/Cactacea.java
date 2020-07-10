
package g4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cactacea extends JPanel {
    
    public void DrawColor (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE); //Hay que cambiarlo para que sea el procesado
        
        g.setColor(Color.BLUE);
        g.fillRect(80,50,200,300);
        
        //Draw text
        g.setColor(Color.BLACK);
        g.drawString("Esta sería tu cactácea", 25, 50);
        
        //Draw rectangle, check xy axes
        g.setColor(Color.YELLOW);
        g.fillRect(80,50,200,300);
        
        //g.setColor(new Color(R,G,B));
        g.setColor(Color.CYAN);
        g.drawLine(10,10,20,20);
        
    }
    
}
