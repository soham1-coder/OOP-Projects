package hello;

public class ElectricCar extends Car implements ProvideEnergy{

    private int batteryCapacity;
    private int milesPerKWh;
    private int batteryPercentage;

    //Constructor for electric car
    public ElectricCar(int batteryCapacity, int milesPerKWh, String make, String model)
    {
        super(make, model);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWh = milesPerKWh;
        this.batteryPercentage = 0;
    }

    @Override
    int calculateFuelEfficiency()
    {
        return milesPerKWh;
    }

    @Override
    int calculateRange()
    {
        return milesPerKWh*batteryCapacity;
    }

    @Override
    public void chargeCar(int amount)
    {
        batteryPercentage += amount;
    }

    @Override
    public void fuelCar(int amount)
    {
        System.out.println("Electric cars cannot be fueled!");
    }

}


    

