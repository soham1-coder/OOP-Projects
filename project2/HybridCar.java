package hello;

public class HybridCar extends Car{

    private int fuelCapacity;
    private int batteryCapacity;
    private int milesPerGallon;
    private int milesPerKWh;

    //Constructor for hybrid car with both fuel and battery
    public HybridCar(int fuelCapacity, int batteryCapacity, int milesPerGallon, int milesPerKWh, String make, String model)
    {
        super(make, model); //extracts make and model from superclass
        this.fuelCapacity = fuelCapacity;
        this.batteryCapacity = batteryCapacity;
        this.milesPerGallon = milesPerGallon;
        this.milesPerKWh = milesPerKWh;

    }

    //Constructor for hybrid car with only fuel
    public HybridCar(String make, String model, int fuelCapacity, int milesPerGallon) 
    {
        super(make, model);
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
        this.batteryCapacity = 0; //no battery
        this.milesPerKWh = 0;
    }

    //Constructor for hybird car with only battery
    public HybridCar(int batteryCapacity, int milesPerKWh,String make, String model)
    {   
        super(make, model);
        this.fuelCapacity = 0; //no fuel tank
        this.milesPerGallon = 0;
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWh = milesPerKWh;
    }


    @Override
    public int calculateFuelEfficiency()
    {
        int fuelEfficiency = 0;

        if (milesPerGallon > 0) 
        {
            fuelEfficiency += milesPerGallon;
        }

        if (milesPerKWh > 0)
         {
            fuelEfficiency += milesPerKWh;
        }

        return fuelEfficiency;
    }

    @Override
    public int calculateRange() 
    {
        int range = 0;

        if (fuelCapacity > 0 && milesPerGallon > 0) 
        {
            range += fuelCapacity * milesPerGallon;
        }

        if (batteryCapacity > 0 && milesPerKWh > 0)
        {
            range += batteryCapacity * milesPerKWh;
        }

        return range;
    }

}


    

