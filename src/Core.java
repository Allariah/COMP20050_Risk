/**
 * Personal version of the Risk assignment for COMP20050.
 * Created by ngraydon on 29/01/2016.
 */
import javax.swing.*;
import java.awt.*;

import Reference.*;

public class Core extends JFrame
{
    // Panel Creation
    JPanel panel = new JPanel();

    public Core()
    {
        super("Risk - By Enigmi");
        setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.black);
        panel.setBackground(Color.black);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        Core gui = new Core();
        gui.setBackground(Color.black);
        gui.repaint();

    }

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int x,y, radius = 35;
        super.paint(g2);

        // Paint Countries
        for(int counter = 0; counter < Constants.NUM_COUNTRIES; counter++)
        {
            if(Constants.CONTINENT_IDS[counter] == 0)
            {
                g2.setColor(Color.yellow);
            }
            else if (Constants.CONTINENT_IDS[counter] == 1)
            {
                g2.setColor(Color.blue);
            }
            else if (Constants.CONTINENT_IDS[counter] == 2)
            {
                g2.setColor(Color.green);
            }
            else if (Constants.CONTINENT_IDS[counter] == 3)
            {
                g2.setColor(Color.cyan);
            }
            else if (Constants.CONTINENT_IDS[counter] == 4)
            {
                g2.setColor(Color.orange);
            }
            else if (Constants.CONTINENT_IDS[counter] == 5)
            {
                g2.setColor(Colors.brown);
            }
            else
            {
                g2.setColor(Color.pink);
            }
            x = Constants.COUNTRY_COORD[counter][0];
            y = Constants.COUNTRY_COORD[counter][1];

            g2.fillOval(x-(radius/2),y-(radius/2),radius,radius);
            // The reason it's x or y -(radius/2) is that if you just do filloval(x,y,radius,radius) the adjacent lines
            // Drawn later will not line up with the circles center, as the way draw/fillOval works is by drawing
            // An oval/circle inside a rectangle, so the center is displaced from the original co-ordinate given.
        }

        g2.setColor(Color.white);

        //Paint Adjacent
        for(int counter = 0; counter < Constants.NUM_COUNTRIES; counter++)
        {
            for(int innerCounter = 0; innerCounter < Constants.ADJACENT[counter].length; innerCounter++)
            {
                g2.drawLine(Constants.COUNTRY_COORD[counter][0],Constants.COUNTRY_COORD[counter][1],Constants.COUNTRY_COORD[Constants.ADJACENT[counter][innerCounter]][0],Constants.COUNTRY_COORD[Constants.ADJACENT[counter][innerCounter]][1]);
            }
        }

    }

}

