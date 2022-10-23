package study.car_race.car;

import car_race.model.Car;
import car_race.model.Cars;
import car_race.service.MoveStrategy;
import car_race.service.StopStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    @Test
    @DisplayName("자동차 이름 숫자들 만큼 리스트 사이즈가 동일하다.")
    void When_CarNameLength_Then_EqualCarListSize() {
        String [] elements = {"a","b","c"};
        Cars cars = new Cars(elements);
        List<Car> verification = cars.getCars();

        assertThat(verification.size()).isEqualTo(elements.length);
        //원하는 테스트는 List타입이 equals인지 하고 싶은데 구현할 수 있나요.
    }
}
