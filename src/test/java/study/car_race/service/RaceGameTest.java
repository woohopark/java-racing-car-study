package study.car_race.service;

import car_race.model.Car;
import car_race.service.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RaceGameTest {
    public class TestGameRule implements RaceGameRule {
        @Override
        public MovementStrategy getMoveStrategy() {
            return new MoveStrategy();
        }
    }

    @Test
    @DisplayName("레이싱 게임 임의의 정책으로 움직이면 1을 반환한다.")
    void When_TestGameRule_Then_One() {
        RaceGameRule testGameRule = new TestGameRule();
        Car car = new Car("test");
        car.setMovementStrategy(testGameRule.getMoveStrategy());
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("레이싱 게임 다음 라운드를 가지고 있지 않으면 거짓을 반환한다.")
    void When_HadNoRound_Then_False() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        RaceGame raceGame = new RaceGame(new RandomMoveRule(), cars, 0);
        assertThat(raceGame.hasNextRound()).isFalse();
    }

}
