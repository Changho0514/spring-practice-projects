package org.example.OrderService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeDishTest() {
        Cook cook = new Cook();
        MenuItem menuItem = new MenuItem("돈까스", 6000);

        Dish dish = cook.makeDish(menuItem);

        assertThat(dish).isEqualTo(new Dish("돈까스", 6000));
    }
}
