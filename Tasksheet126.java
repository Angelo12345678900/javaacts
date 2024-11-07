// Base class: Vehicle
class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Vehicle attributes
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods for the attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Derived class: Car that extends Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor to initialize the Car attributes
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the constructor of Vehicle class
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Tasksheet126 {
    public static void main(String[] args) {
        // Creating an instance of Car and setting its attributes
        Car car = new Car("Toyota", "Camry", 2022, 4);

        // Displaying the car details
        car.displayDetails();
    }
}
