package pl.example.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiclesTest {

    @Test
    public void testCarMaxSpeed() {
        Car Car = new Car("Sedan", 4);
        assertEquals(200, Car.getMaxSpeed());
    }

    @Test
    public void testBikeMaxSpeed() {
        Bike Bike = new Bike("Mountain Bike");
        assertEquals(50, Bike.getMaxSpeed());
    }

    @Test
    public void testCarDoors() {
        Car Car = new Car("Hatchback", 5);
        assertEquals(5, Car.getDoors());
    }

    @Test
    public void testVehicleName() {
        Vehicle Vehicle = new Car("Convertible", 2);
        assertEquals("Convertible", Vehicle.getName());
    }
}