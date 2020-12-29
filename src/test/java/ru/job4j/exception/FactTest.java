package ru.job4j.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThanZero() {
        Fact fact = new Fact();
        fact.calc(-1);
    }
}