package com.bridgebabz.geometry;

import static java.lang.Math.sqrt;

public class GeometryProblems {
    public static void main(String[] args) {
        double x1=3;
        double x2=4;
        double y1=3;
        double y2=4;
        double length = 0;
        length = sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        System.out.println("Length of Line is :" + length);
    }
}
