/**
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
        int x,y;
        super.paint(g);

        // Paint Countries
        for(int counter = 0; counter < Constants.NUM_COUNTRIES; counter++)
        {
            if(Constants.CONTINENT_IDS[counter] == 0)
            {
                g.setColor(Color.yellow);
            }
            else if (Constants.CONTINENT_IDS[counter] == 1)
            {
                g.setColor(Color.blue);
            }
            else if (Constants.CONTINENT_IDS[counter] == 2)
            {
                g.setColor(Color.green);
            }
            else if (Constants.CONTINENT_IDS[counter] == 3)
            {
                g.setColor(Color.cyan);
            }
            else if (Constants.CONTINENT_IDS[counter] == 4)
            {
                g.setColor(Color.orange);
            }
            else if (Constants.CONTINENT_IDS[counter] == 5)
            {
                g.setColor(Colors.brown);
            }
            else
            {
                g.setColor(Color.pink);
            }
            x = Constants.COUNTRY_COORD[counter][0];
            y = Constants.COUNTRY_COORD[counter][1];

            g.fillOval(x,y,35,35);
        }

        g.setColor(Color.white);

        //Paint Adjacent
        for(int counter = 0; counter < Constants.NUM_COUNTRIES; counter++)
        {
            for(int innerCounter = 0; innerCounter < Constants.ADJACENT[counter].length; innerCounter++)
            {
                g.drawLine(Constants.COUNTRY_COORD[counter][0],Constants.COUNTRY_COORD[counter][1],Constants.COUNTRY_COORD[Constants.ADJACENT[counter][innerCounter]][0],Constants.COUNTRY_COORD[Constants.ADJACENT[counter][innerCounter]][1]);
            }
        }

    }

}

