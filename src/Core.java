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
        add(panel);
        setVisible(true);

        panel.setLayout(myLayout);
    }

    public static void main(String[] args)
    {
        Core gui = new Core();
    }

}

