public class Car {
    private boolean parked = false;

    public void parkInLot(ParkingLot parkingLot) {
        if (parkingLot.canPark()) {
            parkingLot.assignToEmptySpot(this);
            this.parked = true;
        }
    }

    public boolean isParked() {
        return this.parked;
    }
}
