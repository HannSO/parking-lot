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
        Car car = new Car();
        assertThat(parkinglot.retrieveCar(car), equalTo(Optional.empty()));
    }

    @Test
    public void canRetrieveCarAfterParked() {
        ParkingLot parkinglot = new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);

        assertThat(parkinglot.retrieveCar(car), equalTo(Optional.of(car)));
    }

    @Test
    public void canParkCar() {
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.canPark());
    }

    @Test
    public void cantParkCarBecauseCapacityIsFull() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.canPark());
    }

    @Test
    public void cantParkCar2WhenCar1IsParkedWhenCapacityIsOne() {
        ParkingLot parkingLot = new ParkingLot();
        Car car1 = new Car();
        Car car2 = new Car();
        parkingLot.park(car1);
        parkingLot.park(car2);
        assertThat(parkingLot.retrieveCar(car1), equalTo(Optional.of(car1)));
        assertThat(parkingLot.retrieveCar(car2), equalTo(Optional.empty()));
    }

    @Test
    public void carIsNotThereOnceRetrieved() {
        ParkingLot parkinglot = new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);
        parkinglot.retrieveCar(car);

        assertThat(parkinglot.retrieveCar(car), equalTo(Optional.empty()));
    }

    @Test
    public void canParkSecondCarIfCapacityIs2() {
        ParkingLot parkingLot = new ParkingLot(2);
        Car car1 = new Car();
        Car car2 = new Car();

        parkingLot.park(car1);
        parkingLot.park(car2);


        assertThat(parkingLot.retrieveCar(car1), equalTo(Optional.of(car1)));
        assertThat(parkingLot.retrieveCar(car2), equalTo(Optional.of(car2)));
    }
}
