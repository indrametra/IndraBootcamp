package com.bootcampexercise.Module10.Activity3;

import com.bootcampexercise.module7.activity.TryCatchFinallyActivity;

public class Calculator {

    public int sum(int a, int b) {
        int o=(a+b);
            return o;
    }
    public double sum(double c, double d) {
        double m=0;
        m=(c+d);
        return m;
    }
    public int subTract(int a, int b)
    {
            return a - b;
    }
    public double divide(double a, double b) {
        try { if (b == 0)  {
            throw new IllegalArgumentException();  }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Divider can't be zero. Please choose another number!");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        try { if (a == -10)  {
            throw new InvalidMultiplyArgumentException("WRONG NUMBER!");  }
        }
        catch (InvalidMultiplyArgumentException e) {
            System.out.println("Multiplaying with -10 is forbidden in our country. Please choose another number!");
        }
        return a * b;
    }





}
