package hello;

import java.util.Scanner;

public class HumanPlayer extends Player
{

    public HumanPlayer(char symbol)
    {
        super(symbol); 
    }

    //human player gets move from input
    @Override
    public int getMove()
    {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");

            int placement = scanner.nextInt();

            return placement;
    }
}


    

    

