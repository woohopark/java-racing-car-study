package car_race.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {
    private List<Car> cars;

    public Cars(String[] carNames) {
        this.cars = Stream.of(carNames)
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
