package oop;

import java.awt.*;

public class Trianglee {
    private Point first;
    private Point second;
    private Point third;

    public Trianglee(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = bc;
        this.third = ac;
    }

    public double halfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double first, double second, double third) {
        return first + second > third && second + third > first && third + first > second;
    }


    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = halfPerimeter(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}
