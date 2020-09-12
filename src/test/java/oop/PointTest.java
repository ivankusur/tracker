package oop;

import junit.framework.TestCase;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(50, 34, 25);
        Point b = new Point(55, 37, 39);
        double expected = 5.83;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testDistance3d() {
        Point a = new Point(50, 34, 25);
        Point b = new Point(55, 37, 39);
        double expected = 15.16;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}