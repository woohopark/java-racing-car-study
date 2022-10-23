package car_race;

import car_race.model.Cars;
import car_race.service.RaceGame;
import car_race.service.RandomMoveRule;
import car_race.view.InputView;
import car_race.view.OutputView;

public class RaceGameApplication {
    public static void main(String[] args) {
        String[] carNames = InputView.readCarNames();
        Cars cars = new Cars(carNames);
        int raceTryCount = InputView.readRoundCount();

        RaceGame raceGame = new RaceGame(new RandomMoveRule(), cars.getCars(), raceTryCount);

        OutputView.writeResultScreen();
        while (raceGame.hasNextRound()) {
            raceGame.racing();
            OutputView.writeCarPositionScreen(cars.getCars());
        }

        OutputView.writeWinnerScreen(raceGame.getWinners());
    }
}
