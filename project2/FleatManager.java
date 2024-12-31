package hello;

public class FleatManager
{
    public static void main (String[] args)
    {

        Car[] cars = new Car[3];

        Car gasolineCar = new GasolineCar(5,5,"Honda", "Civic");
        Car electricCar = new ElectricCar(1,2,"Tesla", "Model 3");
        Car luxurySedan = new LuxurySedan("Audi", "A3", 5, 7, true, true);

        cars[0] = gasolineCar;
        cars[1] = electricCar;
        cars[2] = luxurySedan;

        printCarDetails(cars);

        System.out.println("Total Range: " + calculateTotalRange(cars));

    }

        public static void printCarDetails(Car cars[])
        {
            for(int i = 0; i < cars.length; i++)
            {
                System.out.println("Fuel Efficiency: " + cars[i].calculateFuelEfficiency());
                System.out.println("Range: " + cars[i].calculateRange());
    
            }

        }

        public static int calculateTotalRange(Car cars[])
        {
            int totalRange = 0;

            for(int i = 0; i < cars.length; i++)
            {
                totalRange += cars[i].calculateRange();
            }
    
            return totalRange;
        }
    }
    

