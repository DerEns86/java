package de.v_ens.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void whenNisOne_ResultIs1() {
        //Given
        int n = 1;

        //When
        int actual = Main.calculateFibonacci(n);

        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void whenNisZero_ResultIsZero() {
        //Given
        int n = 0;

        //When
        int actual = Main.calculateFibonacci(n);

        //Then
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void whenNisSeven_ResultIs13() {
        //Given
        int n = 7;

        //When
        int actual = Main.calculateFibonacci(n);

        //Then
        int expected = 13;
        assertEquals(expected, actual);
    }
}
