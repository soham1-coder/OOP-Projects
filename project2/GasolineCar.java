package hello;

public class GasolineCar extends Car implements ProvideEnergy{

    private int fuelCapacity;
    private int milesPerGallon;
    private int fuelLevel;

    //Constructor for gas car
    public GasolineCar(int fuelCapacity, int milesPerGallon, String make, String model)
    {
        super(make, model); //extracts make and model from superclass
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
        this.fuelLevel = 0;

    }
    
    @Override
    int calculateFuelEfficiency()
    {
       return milesPerGallon;
    }

    @Override
    int calculateRange()
    {
       return milesPerGallon*fuelCapacity;
    }

    @Override
    public void chargeCar(int amount) 
    {
        System.out.println("Gasoline cars cannot be charged!");
    }

    @Override
    public void fuelCar(int amount) 
    {
        fuelLevel += amount;
    }

}


    

