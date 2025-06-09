package javaSpecific.inheritanceProof;

public class Inheritance {

    private static class Vehicle {
        double price;

        public Vehicle(double p) {
            this.price = p;
        }
    }

    private static class Car extends Vehicle {
        int amountOfDoors;

        public Car(double price, int doors) {
            super(price);
            this.amountOfDoors = doors;
        }

        public void printInfo() {
            System.out.println("Car: {price=$" + this.price + ", doors: " + this.amountOfDoors + "}");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1000.0);
        Car c1 = new Car(1500.0, 5);

        System.out.println("Vehicle: {price=$" + v1.price + "}");
        c1.printInfo();
    }
}
