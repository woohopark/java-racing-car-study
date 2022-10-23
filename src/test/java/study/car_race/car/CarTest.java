package study.car_race.car;

import car_race.model.Car;
import car_race.service.MoveStrategy;
import car_race.service.StopStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차의 초기 움직임 횟수는 0이다.")
    void When_InitCarGetPosition_Then_Zero() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차가 움직임 정책을 가지고 움직이면 1이다.")
    void When_CarSetMoveStrategy_Then_One() {
        Car car = new Car("test");
        car.setMovementStrategy(new MoveStrategy());
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차가 멈춤 정책을 가지고 움직이면 0이다.")
    void When_CarSetStopStrategy_Then_One() {
        Car car = new Car("test");
        car.setMovementStrategy(new StopStrategy());
        car.move();
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 이름이 5글자 이상이 될 경우 예외처리를 한다.")
    void When_CarNameSizeFiveBigger_Then_Exception() {
        assertThatThrownBy(() -> {
            Car car = new Car("abcabasdfasdf");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름이 5글자 이상이 될 수 없습니다.");
    }
}
