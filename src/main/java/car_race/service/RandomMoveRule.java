package car_race.service;

import java.util.Random;

public class RandomMoveRule implements RaceGameRule {
    private final static int MAX_RANDOM_VALUE = 10;
    private final static int MOVE_STAND_VALUE = 4;
    private static final MovementStrategy moveStrategy = new MoveStrategy();
    private static final MovementStrategy stopStrategy = new StopStrategy();
    private static final Random randomNumber = new Random();

    @Override
    public MovementStrategy getMoveStrategy() {
        Random random = randomNumber;
        return random.nextInt(MAX_RANDOM_VALUE) <= MOVE_STAND_VALUE ? moveStrategy : stopStrategy;
    }
}
