import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class AttendantTest {

    @Test
    public void attendantCanDirectACarToLotWithAvailableSpot() {
        ParkingLot parkingLot =  new ParkingLot();
        Attendant attendant = new Attendant(parkingLot, parkingLot);

        assertThat(attendant.findParkingLotWithAvailableSpot(),equalTo(parkingLot));
    }
    @Test
    public void attendantCanDirectTwoCarsToLotsWithAvailableSpots() {
        ParkingLot parkingLot1 =  new ParkingLot();
        ParkingLot parkingLot2 =  new ParkingLot();
        Attendant attendant = new Attendant(parkingLot1, parkingLot2);


        assertThat(attendant.findParkingLotWithAvailableSpot(),equalTo(parkingLot1));
    }

}
