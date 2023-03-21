package org.example.SimpleCalculator;

import org.assertj.core.api.Assertions;
import org.example.calculator.PositiveNumber;
import org.junit.jupiter.api.Test;

public class PositiveNumberTest {

    @Test
    void createTest() {
        Assertions.assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다.");
    }
}
