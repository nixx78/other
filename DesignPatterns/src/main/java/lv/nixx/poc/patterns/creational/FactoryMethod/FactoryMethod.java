package lv.nixx.poc.patterns.creational.FactoryMethod;


interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle...");
    }
}

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void testDrive() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

public class FactoryMethod {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.testDrive();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.testDrive();
    }

}
