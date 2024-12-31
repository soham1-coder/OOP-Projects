package hello;

public abstract class Car{

    //Declares attributes
    private String make;
    private String model;

    //Initializes attributes
    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    String getMake()
    {
        return make;
    }

    String getModel()
    {
        return model;
    }
            
    abstract int calculateFuelEfficiency();

    abstract int calculateRange();

}

    

