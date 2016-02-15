/**
 * Personal version of the Risk assignment for COMP20050.
 * Created by ngraydon on 29/01/2016.
 */
import Reference.*;

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
    }
}
