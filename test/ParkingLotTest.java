import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ParkingLotTest {
    @Test
    public void cantRetrieveCarWhenEmpty(){
        ParkingLot parkinglot =  new ParkingLot();
        assertThat(parkinglot.retrieveCar(), equalTo(Optional.empty()));
    }

    @Test
    public void canRetrieveCarAfterParked() {
        ParkingLot parkinglot =  new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);

        assertThat(parkinglot.retrieveCar(), equalTo(Optional.of(car)));
    }

    @Test
    public void carIsNotThereOnceRetrieved() {
        ParkingLot parkinglot =  new ParkingLot();
        Car car = new Car();
        parkinglot.park(car);
        parkinglot.retrieveCar();

        assertThat(parkinglot.retrieveCar(), equalTo(Optional.empty()));


    }
}
