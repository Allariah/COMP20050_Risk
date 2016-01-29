/**
 * Created by ngraydon on 29/01/2016.
 */
import javax.swing.*;
import java.awt.*;

import Reference.*;

public class Core extends JFrame
{
    // Layout
    FlowLayout myLayout = new FlowLayout();

    // Loader
    ClassLoader loader = this.getClass().getClassLoader();

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
        //panel.setLayout(myLayout);
    }

    public static void main(String[] args)
    {
        Core gui = new Core();
        gui.setBackground(Color.black);
        gui.repaint();
    }

    public void paint(Graphics g)
    {
        int x,y,x2,y2;

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
                g.setColor(Colours.brown);
            }
            else
            {
                g.setColor(Color.pink);
            }
            x = Constants.COUNTRY_COORD[counter][0];
            y = Constants.COUNTRY_COORD[counter][1];

            g.drawOval(x,y,30,30);
        }

        //Paint Adjacent
        for(int counter = 0; counter < Constants.NUM_COUNTRIES; counter++)
        {
            g.setColor(Color.white);

            //g.drawLine(x,y,x2,y2);
        }

    }

}

