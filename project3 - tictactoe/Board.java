package hello;

public class Board
{

    //declares board
    private char[][] board;

    public Board()
    {
        board = new char[][] {{' ', '|', ' ', '|', ' '},
                      {'-', '+', '-', '+', '-'},
                      {' ', '|', ' ', '|', ' '},
                      {'-', '+', '-', '+', '-'},
                      {' ', '|', ' ', '|', ' '}};

    }

    //places symbol on board based on the position given by the user
    public boolean placeMarker(int pos, char symbol)
    {
        
        switch(pos)
        {
            case 1:
                if (board[0][0] == ' ') {
                board[0][0] = symbol;
                return true;
                }
                break;

            case 2:
                if (board[0][2] == ' ') {
                board[0][2] = symbol;
                return true;
                }
                break;

            case 3:
                if (board[0][4] == ' ') {
                board[0][4] = symbol;
                return true;
                }
                break;

            case 4:
                if (board[2][0] == ' ') {
                board[2][0] = symbol;
                return true;
                }
                break;

            case 5:
                if (board[2][2] == ' ') {
                board[2][2] = symbol;
                return true;
                }
                break;

            case 6:
                if (board[2][4] == ' ') {
                board[2][4] = symbol;
                return true;
                }
                break;

            case 7:
                if (board[4][0] == ' ') {
                board[4][0] = symbol;
                return true;
                }
                break; 

            case 8:
                if (board[4][2] == ' ') {
                board[4][2] = symbol;
                return true;
                }
                break;

            case 9:
                if (board[4][4] == ' ') {
                board[4][4] = symbol;
                return true;
                }
                break;
                
            default:
                System.out.println("Invalid position! Choose a number between 1 and 9.");
                return false;
            }

        System.out.println("already there, please place a valid move");

        return false;
    }

    public void printBoard()
    {
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean checkWinner()
    {

        for (int i = 0; i < 5; i += 2) 
        {

            //checks if any rows are completed
            if (board[i][0] == board[i][2] && board[i][0] == board[i][4] && (board[i][0] == 'X' || board[i][0] == 'O'))
            {
                return true;
            }

            //check if any columns are completed
            if(board[0][i] == board[2][i] && board[0][i] == board[4][i] && (board[0][i] == 'X' || board[0][i] == 'O'))
            {
                return true;
            }
        }

        //checks if any diagonals are completed
        if(board[0][0] == board[2][2] && board[0][0] == board[4][4] && (board[0][0] == 'X' || board[0][0] == 'O'))
        {
            return true;
        }
        
        if(board[0][4] == board[2][2] && board[0][4] == board[4][0] && (board[0][4] == 'X' || board[0][4] == 'O'))
        {
            return true;
        }

        return false;
    }
    
    //checks for a draw by seeing if there are any empty cells remaining 
    public boolean checkDraw()
    {   
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                //if an empty cell is found its not a draw
                if (board[i][j] == ' ') 
                {
                    return false;
                }
            }
        }
        return true; //no empty cells found
    }
}

    

