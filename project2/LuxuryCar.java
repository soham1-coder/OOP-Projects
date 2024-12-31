package hello;

public abstract class LuxuryCar extends Car{

    //Declares attributes of luxury cars
    private boolean hasHeatedSeats;
    private boolean hasSunroof;

    //Initializes attributes
    public LuxuryCar(String make, String model, boolean hasHeatedSeats, boolean hasSunroof)
    {
        super(make, model);
        this.hasHeatedSeats = hasHeatedSeats;
        this.hasSunroof = hasSunroof;
    }


    public boolean hasHeatedSeats() 
    {
        return hasHeatedSeats;
    }

    public boolean hasSunroof() 
    {
        return hasSunroof;
    }

    



}

    

