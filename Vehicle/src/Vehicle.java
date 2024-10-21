public class Vehicle {
    private int passengers=5;
    private String make="A Make";
    private String model="ACME Model";
    private float price=10000;
    private int numWheels=4;


    public Vehicle(int passengers, String make, String model, float price, int numWheels) {
        this.passengers = passengers;
        this.make = make;
        this.model = model;
        this.price = price;
        this.numWheels = numWheels;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}


