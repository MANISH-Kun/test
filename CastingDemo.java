

public class CastingDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.startEngine();
        // v.runCar();  //The method runCar() is undefined for the type Vehicle

        Vehicle v1 = new Bike();
        v1.startEngine();
        // v1.runBike();

        Car c =  (Car)v;
        c.runCar();

        // c.runBike();
        Car v3 = new Wheels();
        Wheels w = new Wheels();
        w.startEngine();

        // Wheels w1 = new Vehicle();

        v3.startEngine();
        // v3.noOfWheels();

        




    }
}
