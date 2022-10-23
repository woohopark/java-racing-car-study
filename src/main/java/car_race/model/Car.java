package car_race.model;

import car_race.service.MovementStrategy;

public class Car {
    private static final int LIMIT_NAME_LENGTH = 5;
    private Position position = new Position();
    private MovementStrategy movementStrategy;
    private String name = "";

    public Car(String name) {
        validationNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position.getMovePosition();
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        position.increamentMovePosition(movementStrategy.getMovePosition());
    }

    private void validationNameLength(String carName) {
        if (carName.length() > LIMIT_NAME_LENGTH) {
            throw new IllegalArgumentException("5글자 이상 입력할 수 없습니다.");
        }
    }

}
