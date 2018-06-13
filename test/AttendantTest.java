import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AttendantTest {

    @Test
    public void attendantCanFindALotWithEmptySpot() {
        ParkingLot parkingLot =  new ParkingLot();
        Attendant attendant = new Attendant(parkingLot, parkingLot);

        assertThat(attendant.parkInCorrectParkingLot(car),equalTo(parkingLot));
    }
    @Test
    public void attendantCanFindEmptySpotAfterOneSpotIsFilled() {
        ParkingLot parkingLot1 =  new ParkingLot();
        ParkingLot parkingLot2 =  new ParkingLot();
        Car existingCar = new Car();
        parkingLot1.park(existingCar);

        Attendant attendant = new Attendant(parkingLot1, parkingLot2);

        Car car = new Car();


        attendant.parkInCorrectParkingLot(car);

        assertThat(parkingLot2.retrieveCar(car), is(car) );
    }



//        @Test
//    public void attendantShouldDistributeEvenlyForSameTypeOfCar() {
//        Car car = new Car();
//        ParkingLot parkingLot1 =  new ParkingLot(10);
//        parkingLot1.park(car);
//        ParkingLot parkingLot2 =  new ParkingLot(7);
//        Car car2 = new Car();
//        Car car3 = new Car();
//        parkingLot2.park(car2);
//        parkingLot2.park(car3);
//
//        Attendant attendant = new Attendant(parkingLot1, parkingLot2);
//        Car car4 = new Car();
//        car.parkInLot(parkingLot1);
//
//
//        assertThat(attendant.parkInCorrectParkingLot(),equalTo(parkingLot2));
//    }

}
