package oop;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest extends TestCase {

    public void whenTwoInt() {
        int rsl = Max.maximum(20, 50);
        assertThat(rsl, is(50));
    }

    public void testWhenTwoDouble() {
        double rsl = Max.maximum(1.1, 1.2);
        assertThat(rsl, is(1.2));
    }

    public void testWhenThree() {
        int rsl = Max.maximum(6, 8, 7);
        assertThat(rsl, is(8));
    }

    public void testWhenFour() {
        int rsl = Max.maximum(1, 10, 6, 1);
        assertThat(rsl, is(10));
    }
}