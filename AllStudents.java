package com.company;

import java.util.Arrays;

public class AllStudents {

    private StudentInfo[] concatInfo;
    private int count;

    public AllStudents(StudentInfo[] info, int count) {
        concatInfo = new StudentInfo[count];
        this.count = count;

        for (int i = 0; i < count; i++) {
            concatInfo[i] = info[i];
        }
    }

    public void printNames() {

        int min;
        for (int i = 0; i < count-1; i++) {
            min = i;
            String minStr = concatInfo[i].getName();

            for (int j = i+1; j < count; j++) {
                if(concatInfo[j].getName().compareTo(minStr) < 0) {
                    minStr = concatInfo[j].getName();
                    min = j;
                }
            }
            if (min != i) {
                StudentInfo s = concatInfo[min];
                concatInfo[min] = concatInfo[i];
                concatInfo[i] = s;
            }
        }
        for (StudentInfo sInfo : concatInfo) {
            System.out.println(sInfo.toString());
        }
    }

    public void printFinalAverages() {

        int max;
        for (int i = 0; i < count; i++) {
            max = i;

            for (int j = i+1; j < count; j++) {
                if (concatInfo[j].getFinalAvg() > concatInfo[max].getFinalAvg()) {
                    max = j;
                }
            }
            if (max != i) {
                StudentInfo s = concatInfo[i];
                concatInfo[i] = concatInfo[max];
                concatInfo[max] = s;
            }
        }
        for (StudentInfo sInfo : concatInfo) {
            System.out.println(sInfo.toString());
        }
    }
}
