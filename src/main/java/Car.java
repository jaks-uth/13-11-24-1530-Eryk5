package pl.example.vehicles;

public class Car extends pl.example.vehicles.Vehicle {

    private int doors;


    public Car(String name, int doors) {
        super(name);
        this.doors = doors;
    }


    @Override
    public int getMaxSpeed(){return 200;}


    public int getDoors(){return doors;}
}