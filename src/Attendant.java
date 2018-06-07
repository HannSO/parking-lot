import java.util.ArrayList;

public class Attendant {
    private ArrayList<ParkingLot> managedParkingLots = new ArrayList();

    public Attendant(ParkingLot parkingLot, ParkingLot parkingLot2){
        managedParkingLots.add(parkingLot);
    }
    public ParkingLot findParkingLotWithAvailableSpot() {
        return managedParkingLots.stream().filter(lot -> lot.canPark()).findFirst().get();
    }
}