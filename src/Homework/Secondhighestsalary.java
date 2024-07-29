package Homework;

import java.util.Scanner;

public class Secondhighestsalary {
    public static void main(String[] args) {
        int salary[] = new int[5];
        int secondmax = salary[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salaries");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        int max = salary[0];


        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max)
            {
                secondmax = max;
                max = salary[i];
            }

        }
        System.out.println("Maximum salary is:" + max);
        System.out.println("Second highest salary is:" + secondmax);
    }
}
