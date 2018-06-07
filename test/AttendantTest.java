import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class AttendantTest {

    @Test
    public void attendantCanFindALotWithEmptySpot() {
        ParkingLot parkingLot =  new ParkingLot();
        Attendant attendant = new Attendant(parkingLot, parkingLot);

        assertThat(attendant.findParkingLotWithAvailableSpot(),equalTo(parkingLot));
    }
    @Test
    public void attendantCanFindEmptySpotAfterOneSpotIsFilled() {
        ParkingLot parkingLot1 =  new ParkingLot();
        ParkingLot parkingLot2 =  new ParkingLot();
        Attendant attendant = new Attendant(parkingLot1, parkingLot2);
        Car car = new Car();
        car.parkInLot(parkingLot1);


        assertThat(attendant.findParkingLotWithAvailableSpot(),equalTo(parkingLot2));
    }

}
