package com.bootcampexercise.module5.activity.abstraction;

public class Rectangle  extends Shape{
    int h;
    int w;

    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public double calculateArea(){
            double a;
            a = (this.h*this.w);
            return a;
        }

        public double calculatePerimeter()   {
            double p;
             p= (2*(h+w));
            return p;

    }
    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = "Rectangle colour is " + c;
    }
}
