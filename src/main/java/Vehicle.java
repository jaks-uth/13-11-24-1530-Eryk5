package pl.example.vehicles;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {this.name = name;}

    public abstract int getMaxSpeed();

    public String getName() {return name;}
}
