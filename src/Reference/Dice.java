package Reference;

import java.util.Random;

/**
 * Created by ngraydon on 29/01/2016.
 */
public class Dice
{
    public static int roll()
    {
        // Roll a D6
        int result;

        Random Dice = new Random();
        result = Dice.nextInt(6) + 1;

        return result;
    }
}
