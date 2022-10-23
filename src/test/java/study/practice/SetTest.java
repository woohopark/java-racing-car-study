package study.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void step1() {
        int numberSize = numbers.size();
        System.out.println("Set 크기: " + numberSize);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void step2(int element) {
        assertThat(numbers.contains(element)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"4,false", "5,false"})
    void step3() {
        String input = "4";
        assertThat(numbers.contains(input)).isFalse();
    }
}