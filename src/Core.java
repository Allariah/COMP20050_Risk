/**
 * Personal version of the Risk assignment for COMP20050.
 * Created by ngraydon on 29/01/2016.
 */
import Reference.*;

import java.util.ArrayList;

public class Core
{
    public static void main(String[] args)
    {
        boolean debug = true;
        boolean inProgress = false;

        //Map map = new Map();

        Game game = new Game();

        // Set player names
        Game.setNames(game, debug);

        // Grab Territories
        Territories.populateAll(game.allTerritories);

        // Allocate Territories
        Territories.setup(game);

        // Game Status
        Game.status(game);

        // Test capturing a Territory
        testCapture(game);

    }

    public static void testCapture(Game game)
    {
        System.out.println("\n");
        int test = (Integer)game.player2Nodes.get(4);
        System.out.println("Test contains: " + test);
        System.out.println("Player 1 will capture: " + Constants.COUNTRY_NAMES[test] + " from Player 2.");
        Game.capture(game.player1Nodes, game.player2Nodes, game.player1Territories, game.player2Territories, test);
        Game.status(game);
    }
}
