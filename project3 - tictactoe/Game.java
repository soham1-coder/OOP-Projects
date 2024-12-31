package hello;

import java.util.Scanner;

public class Game
{
    public static void main (String[] args)
    {

        while(true)
        {
            //GAME SETUP
            Board board = new Board();
            Scanner scanner = new Scanner(System.in);

            Player player1 = new HumanPlayer('X');
            Player player2 = new ComputerPlayer('O');

            Player currentPlayer = player1; //start with player 1

            boolean end = false;
            boolean changePlayers = false;

            char winner = ' ';

            //GAME STARTS
            while(!end)
            {
                int placement = currentPlayer.getMove();

                changePlayers = board.placeMarker(placement, currentPlayer.getSymbol());

                System.out.println();
                board.printBoard();

                //ends if there is a winner or a draw
                end = board.checkWinner() || board.checkDraw();

                //gets winner's symbol
                if(board.checkWinner())
                {
                    winner = currentPlayer.getSymbol();
                }

                //switches between players if a valid move is made
                if(changePlayers)
                {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }

            }

            System.out.println("Game Over " + "The winner is: " + winner);
            System.out.println("Do you want to play again? (yes/no)");

            String replay = scanner.next();

            if (!replay.equalsIgnoreCase("yes") && !replay.equalsIgnoreCase("y")) 
            {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}


    

    

