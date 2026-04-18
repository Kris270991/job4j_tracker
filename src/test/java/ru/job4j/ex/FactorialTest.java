package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void whenException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    factorial.calc(-1);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    public void whenNotException() {
        Factorial factorial = new Factorial();
        int number = 4;
        int expected = 24;
        int result = factorial.calc(number);
        assertThat(result).isEqualTo(expected);
    }
}