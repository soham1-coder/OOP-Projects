package hello;

public abstract class Player
{
    //declares the players symbol
    private char symbol;

    public Player(char symbol)
    {
        this.symbol = symbol;
    }

    public char getSymbol()
    {
        return symbol;
    }

    //abstract method for obtaining player move
    public abstract int getMove();

}

