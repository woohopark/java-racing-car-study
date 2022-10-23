package calculator;

import java.util.Optional;
import java.util.Scanner;

public class StrCalc {

    /*
    Step 2. 문자열계산기
     */

    static int calculatedValue = 0;       //결과값;
    static String userInputValue = "";      //사용자 입력값
    static String[] userInputValueByArray = {};      //사용자 입력배열값

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산을 입력해주세요. (ex: 2 + 3 * 4 / 2 + 2 )");
        userInputValue = sc.next();
        Optional.ofNullable(userInputValue).orElseThrow(IllegalArgumentException::new); // 1차 피드백
        userInputValueByArray = userInputValue.split(" ");

        calculatedValue = toInt(userInputValueByArray[0]);
        for (int i = 1; i <= userInputValueByArray.length - 1; i += 2) {
            calculatedValue = calculation(calculatedValue, userInputValueByArray[i], toInt(userInputValueByArray[i + 1]));
        }

        System.out.println("calculatedValue : " + calculatedValue);
    }

    private static int calculation(int prev, String oper, int next) {

        if (OperEnum.OPER_PLUS.valueCheck(oper)) { //1차 피드백
            return calculatedValue = plus(prev, next);
        }

        if (OperEnum.OPER_MINUS.valueCheck(oper)) { //1차 피드백
            return calculatedValue = minus(prev, next);
        }

        if (OperEnum.OPER_DIVIDE.valueCheck(oper)) { //1차 피드백
            return calculatedValue = divide(prev, next);
        }

        if (OperEnum.OPER_MULTIPLY.valueCheck(oper)) { //1차 피드백
            return calculatedValue = multiply(prev, next);
        }

        throw new IllegalArgumentException("사칙연산 값을 입력해야됩니다."); //1차 피드백
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int toInt(String a) {
        return Integer.parseInt(a);
    }

}

