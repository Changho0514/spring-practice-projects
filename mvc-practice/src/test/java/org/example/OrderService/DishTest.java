package org.example.OrderService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class DishTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Dish("만두", 5000))
                .doesNotThrowAnyException();
    }
}
