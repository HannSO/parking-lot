import java.util.Optional;

public class ParkingLot {

    private Optional<Object> spot = Optional.empty();

    public Optional retrieveCar() {
        Optional<Object> retrievedCar = this.spot;
        this.spot = Optional.empty();
        return retrievedCar;
    }

    public void assignToEmptySpot(Car car) {
        if (canPark()) {
            this.spot = Optional.ofNullable(car);
        }
    }

    public Boolean canPark() {
        return !spot.isPresent();
    }
}
