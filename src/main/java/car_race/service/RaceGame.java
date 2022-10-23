package car_race.service;

import car_race.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RaceGame {
    private final RaceGameRule raceGameRule;
    private final List<Car> raceCars;
    private int round = 0;
    private int endRound;

    public RaceGame(RaceGameRule raceGameRule, List<Car> cars, int endRound) {
        this.raceGameRule = raceGameRule;
        this.raceCars = cars;
        this.endRound = endRound;
    }

    public boolean hasNextRound() {
        if (round == endRound) {
            return false;
        }
        round++;
        return true;
    }

    public void racing() {
        raceCars.forEach(car -> {
            car.setMovementStrategy(raceGameRule.getMoveStrategy());
            car.move();
        });
    }

    public List<Car> getWinners() {
        int maxPosition = this.raceCars.stream()
                .map(Car::getPosition)
                .max(Integer::compareTo)
                .orElse(0);

        return Collections.unmodifiableList(raceCars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList()));
    }
}
