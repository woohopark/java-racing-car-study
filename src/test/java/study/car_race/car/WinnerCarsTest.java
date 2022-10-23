package study.car_race.car;

import car_race.model.Car;
import car_race.model.WinnerCars;
import car_race.service.MoveStrategy;
import car_race.service.StopStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WinnerCarsTest {

    @Test
    @DisplayName("높은 움직임을 가진 차의 이름을 반환한다.")
    void When_MaxPositionCar_Then_CarName() {
        //given
        List<Car> cars = new ArrayList<>();
        WinnerCars winnerCars = new WinnerCars();
        Car car = new Car("test");
        car.setMovementStrategy(new MoveStrategy());
        car.move();
        Car car2 = new Car("test2");
        car2.setMovementStrategy(new StopStrategy());
        car2.move();
        cars.add(car);
        cars.add(car2);
        //when
        winnerCars.calculatorWinner(cars);
        //then
        assertThat(winnerCars.getWinnerCars().get(0).getName()).isEqualTo("test");
    }

}
