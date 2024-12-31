package hello;

import java.util.Random;

public class ComputerPlayer extends Player
{

    public ComputerPlayer(char symbol)
    {
        super(symbol);
    }

    //computer gets move by randomly generating a number between 1 and 9
    @Override
    public int getMove()
    {
            Random random = new Random();
            int placement = random.nextInt(9) + 1;

            return placement;
    }
}


    

    

