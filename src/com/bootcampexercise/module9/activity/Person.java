package com.bootcampexercise.module9.activity;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String bodyMassIndex(int weight, int height) {
        int imb = weight / (height * height);
        String BMI;

        if (weight <= 0) {
            BMI = "Please check your weight!"+imb; }
        else if (height <= 0) {
            BMI = "Please check your height!"+imb; }
        else {
            BMI="Your BMI"+imb+" is practically ideal for every way"; }
        return BMI;
    }

}


    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)

    // TODO: Please add some checks for max weight and height (kg and meter are their units)
    //TODO: Also add some checks that value shouldn't be negative and 0
//    Note: All TODOs should be implemented in single method
