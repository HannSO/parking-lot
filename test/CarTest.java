import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    @Test
    public void carCanParkInALot() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        car.parkInLot(parkingLot);

        assertTrue(car.isParked());
    }

    @Test
    public void carShouldntBeParked() {
        Car car = new Car();

        assertFalse(car.isParked());
    }

    @Test
    public void carCanParkInALotWithFreeSpace() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();

        car.parkInLot(parkingLot);
        assertTrue(car.isParked());
    }

    @Test
    public void carCantParkInALotThatHasNoSpace(){
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot = new ParkingLot();

        car1.parkInLot(parkingLot);
        car2.parkInLot(parkingLot);

        assertFalse(car2.isParked());
    }
}
