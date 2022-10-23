package car_race.model;

public class Position {
    private int movePosition = 0;

    public int getMovePosition() {
        return this.movePosition;
    }

    public int increamentMovePosition(int increament) {
        return movePosition = this.movePosition + increament;
    }
}
