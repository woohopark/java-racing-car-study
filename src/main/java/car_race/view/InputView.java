package car_race.view;

import java.util.Scanner;

public class InputView {

    public static final String QUESTION_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String QUESTION_ROUND_COUNT = "시도할 회수는 몇 회 인가요?";
    public static final String COMMA = ",";

    public static String[] readCarNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println(QUESTION_CAR_NAME);
        return sc.next().split(COMMA);
    }

    public static int readRoundCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println(QUESTION_ROUND_COUNT);
        return sc.nextInt();
    }
}
