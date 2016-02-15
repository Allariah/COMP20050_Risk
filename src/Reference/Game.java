package Reference;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Game loop
 * Created by ngraydon on 12/02/2016.
 */
public class Game
{
    // Game Loop
    boolean play = true;
    // Quit Game Variable
    boolean inProgress = false;

    // Player names
    public String player1 = null;
    public String player2 = null;

    // All Territories
    public ArrayList allTerritories = new ArrayList();

    // Player Territories
    public ArrayList player1Territories = new ArrayList();
    public ArrayList player2Territories = new ArrayList();
    public int[] player1Nodes = new int[Constants.NUM_COUNTRIES];
    public int[] player2Nodes = new int[Constants.NUM_COUNTRIES];

    // Neutral Territories
    public ArrayList neutral1Territories = new ArrayList();
    public ArrayList neutral2Territories = new ArrayList();
    public ArrayList neutral3Territories = new ArrayList();
    public ArrayList neutral4Territories = new ArrayList();


    public static String getPlayerName(int playerID, boolean debug)
    {
        if(!debug)
        {
            String name = null;

            while(name == null || name.equals(""))
            {
                name = JOptionPane.showInputDialog("Please enter Player " + playerID + "'s name:");
            }

            return name;
        }
        else
        {
            return Integer.toString(playerID);
        }
    }

    public static void printNames(Game game)
    {
        System.out.println("Player 1 Name: " + game.player1);
        System.out.println("Player 2 Name: " + game.player2);
    }

    public static void setNames(Game game, boolean debug)
    {
        game.player1 = getPlayerName(1,debug);
        game.player2 = getPlayerName(2, debug);
    }

    public static void status(Game game)
    {
        printNames(game);
        Territories.print(game);
    }
}
