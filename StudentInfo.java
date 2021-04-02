package com.company;

public class StudentInfo {

    private String name;
    private int yrOfGrad;
    private double finalAvg;

    public StudentInfo(String studentName, int yearOfGraduation, double finalAverage) {
        name = studentName;
        yrOfGrad = yearOfGraduation;
        finalAvg = Math.round(finalAverage);
    }

    public String toString() {
        return name + ": " + finalAvg + ", " + yrOfGrad;
    }

    public String getName() {
        return name;
    }

    public double getFinalAvg() {
        return finalAvg;
    }
}
