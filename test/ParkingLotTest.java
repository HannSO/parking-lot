import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void cantRetrieveCarWhenEmpty() {
        ParkingLot parkinglot = new ParkingLot();
        assertThat(parkinglot.retrieveCar(), equalTo(Optional.empty()));
    }

    @Test
    public void canRetrieveCarAfterParked() {
        ParkingLot parkinglot = new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);

        assertThat(parkinglot.retrieveCar(), equalTo(Optional.of(car)));
    }

    @Test
    public void canParkCar() {
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.canPark());
    }

    @Test
    public void cantParkCar() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.canPark());
    }

    @Test
    public void cantParkCar2WhenCar1IsParked() {
        ParkingLot parkingLot = new ParkingLot();
        Car car1 = new Car();
        Car car2 = new Car();
        parkingLot.park(car1);
        parkingLot.park(car2);
        assertThat(parkingLot.retrieveCar(), equalTo(Optional.of(car1)));
    }

    @Test
    public void carIsNotThereOnceRetrieved() {
        ParkingLot parkinglot = new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);
        parkinglot.retrieveCar();

        assertThat(parkinglot.retrieveCar(), equalTo(Optional.empty()));
    }


}
