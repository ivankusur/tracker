package oop;

import java.awt.*;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = bc;
        this.third = ac;
    }

    public double perimeter(double a, double b, double c) {
        return first.distance(first) + second.distance(second) + third.distance(third);
    }

    public boolean exist(double first, double second, double third) {
        if (first + second > third && second + third > first && third + first > second) {
            return true;
        }


        public double area() {
            double rsl = -1;
            double ab = first.distance(second);
            double ac = first.distance(third);
            double bc = second.distance(third);
            double p = period(ab, ac, bc);
            if (this.exist(ab, ac, bc)) {
                /* написать формулу для расчета площади треугольника. */
                rsl = -1;
            }
        }
    }
}