package oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import oop.Point;
import oop.Trianglee;
import org.junit.Test;

public class TriangleeTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Trianglee triangle = new Trianglee(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}