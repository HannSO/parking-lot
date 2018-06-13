import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {

    private List<Car> cars = new ArrayList<Car>();
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    @Deprecated
    public ParkingLot() {
        this.capacity = 1;
    }

    public Optional retrieveCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(car);
            return Optional.of(car);
        }
        return Optional.empty();
    }

    public void park(Car car) {
        if (canPark()) {
            cars.add(car);
        }
    }

    public Boolean canPark() {
        return (cars.size() < capacity);
    }
}
