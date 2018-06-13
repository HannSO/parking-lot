import java.util.ArrayList;

public class Attendant {
    private ArrayList<ParkingLot> managedParkingLots = new ArrayList();

    public Attendant(ParkingLot parkingLot, ParkingLot parkingLot2){
        managedParkingLots.add(parkingLot);
        managedParkingLots.add(parkingLot2);
    }
    public ParkingLot parkInCorrectParkingLot(Car car) {
        //park car
        return managedParkingLots.stream().filter(lot -> lot.canPark()).findFirst().get();
    }
}
