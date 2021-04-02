package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String name;
        int yrOfGrad;
        double finalAvg;

        int count = 0;
        StudentInfo[] info = new StudentInfo[15];
        String addAnother = "y";

        System.out.println("\n~ Enter Student Info ~");
        Scanner sc = new Scanner(System.in);

        while (addAnother.equals("y")) {
            System.out.print("\nAdd Student " + (count+1) + " y/n: ");
            addAnother = sc.nextLine();

            if (!addAnother.equals("n")) {
                System.out.print("Enter Name: ");
                name = sc.nextLine();

                System.out.print("Enter Year of Graduation: ");
                yrOfGrad = sc.nextInt();

                System.out.print("Enter Final Average: ");
                finalAvg = sc.nextDouble();
                sc.nextLine();

                StudentInfo s = new StudentInfo(name, yrOfGrad, finalAvg);
                info[count] = s;

                count += 1;
            }
        }

        AllStudents completeInfo = new AllStudents(info, count);

        System.out.println("\n~ Alphabetical Order ~");
        completeInfo.printNames();

        System.out.println("\n~ Final Averages ~");
        completeInfo.printFinalAverages();
    }
}
