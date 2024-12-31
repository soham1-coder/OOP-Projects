package hello;

public class LuxurySedan extends LuxuryCar
{
        //Attributes for luxury car (similar to gas car)
        private int fuelCapacity;
        private int milesPerGallon;
    
        public LuxurySedan(String make, String model, int fuelCapacity, int milesPerGallon, boolean hasHeatedSeats, boolean hasSunroof)
        {
            super(make, model, hasHeatedSeats, hasSunroof);
            this.fuelCapacity = fuelCapacity;
            this.milesPerGallon = milesPerGallon;
        }
    
        @Override
        public int calculateFuelEfficiency() 
        {
            return milesPerGallon;
        }
    
        @Override
        public int calculateRange() 
        {
            return fuelCapacity * milesPerGallon;
        }
    
    }
    
   

    

