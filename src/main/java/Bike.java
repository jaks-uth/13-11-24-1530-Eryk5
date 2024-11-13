package pl.example.vehicles;

public class Bike extends pl.example.vehicles.Vehicle {


    public Bike(String name) {super(name);}


    @Override
    public int getMaxSpeed(){return 50;}
}