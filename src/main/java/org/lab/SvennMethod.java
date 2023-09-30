package org.lab;

public class SvennMethod {

    public double[] doMethod(double x, double step){
        double x1 = x + step;
        double x2 = x - step;
        double f0 = function(x);
        double f1 = function(x1);
        double f2 = function(x2);

        if(f1 > f0 && f2 > f0){ //Function already have a min in interval [x1, x2]
            return new double[]{x1, x2};
        } else if (f1 < f0 && f2 < f0) { //Function have max in x0
            System.err.println("Function is not unimodal, try to change x0");
            return new double[]{0};
        }
        if (f2 < f0 && f0 < f1){
            step = -step;
        }
        int countIteration = 1;
        x1 = x;
        x2 = x1 + step;
        while (function(x2) < function(x1)){
            System.out.println("Iteration number: "+ countIteration++);
            step *= 2;
            x1 = x2;
            x2 = x1 + step;
            System.out.printf("    x1:%.2f;\n", x1);
            System.out.printf("    x2:%.2f;\n", x2);
            System.out.println("    h = 2 * h = 2 * ("+step/2+") = "+step);
        }
        if(x2 > x1){
            return new double[] {x1, x2};
        }
        return new double[] {x2, x1};
    }

    private double function(double x){
        return x*x-22;
    }

}
