package com.bootcampexercise.module5.activity.abstraction;

    public class Circle extends Shape{
        // TODO: Implement calculateArea and calculatePerimeter in this class
        public double r;
        double m=3.14;

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        public Circle(double r) {
            this.r = r;
        }

        public double calculateArea(){
            double a;
            a = (this.r*m);
            return a;
        }

        public double calculatePerimeter()   {
            double p;
             p= (2*this.r*m);
            return p;

    }
        public String getColor() {
            return color;
        }

        public void setColor(String c) {
            this.color = "Circle colour is " + c;
        }
}
