package car_race.view;

import car_race.model.Car;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class OutputView {
    private static final String RESULT_SCREEN = "실행결과";
    private static final String HYPHEN = "-";
    private static final String WINNER_RESULT_SCREEN = "가 최종 우승 하였습니다.";

    public static void writeResultScreen() {
        System.out.println(RESULT_SCREEN);
    }

    public static void writeCarPositionScreen(List<Car> cars) {
        cars.forEach(car ->
                System.out.println(car.getName() + ":" + HYPHEN.repeat(car.getPosition()))
        );
    }

    public static void writeWinnerScreen(List<Car> winnerCars) {
        AtomicReference<String> outputWinners = new AtomicReference<>();
        winnerCars.forEach(car ->
                outputWinners.getAndUpdate(current -> current + "," + car.getName())
        );
        System.out.println(outputWinners.get().substring(5, outputWinners.get().length()) + WINNER_RESULT_SCREEN);
    }
}
