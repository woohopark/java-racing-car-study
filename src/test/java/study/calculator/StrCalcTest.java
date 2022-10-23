package study.calculator;

import calculator.OperEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StrCalcTest {

    int a;
    int b;

    @BeforeEach
    void setUp() {
        a = 6;
        b = 3;
    }

    @Test
    @DisplayName("덧셈 테스트")
    void plus() {
        int c = a + b;
        assertThat(c).isEqualTo(9);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void minus() {
        int c = a - b;
        assertThat(c).isEqualTo(3);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void multiply() {
        int c = a * b;
        assertThat(c).isEqualTo(18);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void divide() {
        int c = a / b;
        assertThat(c).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"+", "/", "-"})
    void calcTest(String oper) {
        if (OperEnum.OPER_PLUS.valueCheck(oper)) { //1차 피드백
            return;
        }
        if (OperEnum.OPER_MINUS.valueCheck(oper)) { //1차 피드백
            return;
        }
        if (OperEnum.OPER_DIVIDE.valueCheck(oper)) { //1차 피드백
            return;
        }
        if (OperEnum.OPER_MULTIPLY.valueCheck(oper)) { //1차 피드백
            return;
        }
        throw new IllegalArgumentException("사칙연산 값을 입력해야됩니다."); //1차 피드백
    }

}
