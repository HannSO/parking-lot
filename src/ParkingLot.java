import java.util.Optional;

public class ParkingLot {

    private Car car;

    public Optional retrieveCar() {
        return Optional.ofNullable(car);
    }

    public void park(Car car) {
        this.car = car;
    }
}
