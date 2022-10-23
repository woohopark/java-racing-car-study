package study.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringTest {

    /*
    Step 1. 학습 테스트 실습
     */

    @Test
    void step1() {
        //요구사항1
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    void step2() {
        //요구사항2
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("Error Display")
    void step3() {
        //요구사항3
        String input = "4";
        String result = "abc";

        int index = Integer.parseInt(input);

        assertThatThrownBy(() -> {
            result.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("StringIndexOutOfBoundsException");
    }

}
