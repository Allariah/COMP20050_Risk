package Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


/**
 * Territory creation and management
 * Created by ngraydon on 12/02/2016.
 */
public class Territories
{
    public static void allocate(ArrayList list, ArrayList pool, int numberToAllocate)
    {
        int result;
        Random item = new Random();

        for(int counter = 0; counter < numberToAllocate; counter++)
        {
            result = item.nextInt(pool.size());
            list.add(pool.get(result));
            pool.remove(result);
        }
    }

    public static void populateAll(ArrayList allTerritories)
    {
        allTerritories.addAll(Arrays.asList(Constants.COUNTRY_NAMES));
    }

    public static void print(Game game)
    {
        System.out.println("Remaining Territories in pool: " + game.allTerritories + "\n");

        System.out.println("Player 1 controls: " + game.player1Territories);
        System.out.println("Player 2 controls: " + game.player2Territories);

        System.out.println("Neutral 1 controls: " + game.neutral1Territories);
        System.out.println("Neutral 2 controls: " + game.neutral2Territories);
        System.out.println("Neutral 3 controls: " + game.neutral3Territories);
        System.out.println("Neutral 4 controls: " + game.neutral4Territories);
    }


    public static void setup(Game game)
    {
        // Player 1
        allocate(game.player1Territories, game.allTerritories, Constants.INIT_COUNTRIES_PLAYER);
        setupNodes(game.player1Territories,game.player1Nodes);
        // Player 2
        allocate(game.player2Territories, game.allTerritories, Constants.INIT_COUNTRIES_PLAYER);
        setupNodes(game.player2Territories,game.player2Nodes);
        //Neutrals
        allocate(game.neutral1Territories, game.allTerritories, Constants.INIT_COUNTRIES_NEUTRAL); // Neutral 1
        allocate(game.neutral2Territories, game.allTerritories, Constants.INIT_COUNTRIES_NEUTRAL); // Neutral 2
        allocate(game.neutral3Territories, game.allTerritories, Constants.INIT_COUNTRIES_NEUTRAL); // Neutral 3
        allocate(game.neutral4Territories, game.allTerritories, Constants.INIT_COUNTRIES_NEUTRAL); // Neutral 4
    }

    public static void setupNodes(ArrayList playerTerritories, int[] playerNodes)
    {
        int nodes = playerTerritories.size();
        for(int counter = 0; counter < nodes; counter++)
        {
            for(int counter2 = 0; counter2 < Constants.NUM_COUNTRIES; counter2++)
            {
                if(playerTerritories.get(counter).equals(Constants.COUNTRY_NAMES[counter2]))
                {
                    playerNodes[counter] = counter2;
                    break;
                }
            }
        }
    }

}