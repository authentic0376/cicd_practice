package com.sprain6628.cicd_practice.controller;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {
    @Test
    void helloTest() {
        HelloController controller = new HelloController();
        String result = controller.sayHello();
        assertThat(result).isEqualTo("Hello, World!");
    }
}
