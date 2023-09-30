package org.lab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SvennMethod svennMethod = new SvennMethod();
        double[] interval = svennMethod.doMethod(1.5, 0.01);
        System.out.printf("Interval (%f, %f)", interval[0], interval[1]);
    }
}