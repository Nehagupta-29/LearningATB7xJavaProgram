package ex_28072024;

import java.util.Scanner;

public class lab110 {
    public static void main(String[] args) {
        int salary[]= new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }

        int max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max)
            {
                max = salary[i];
            }

        }
        System.out.println("Maximum salary is:" + max);

    }
}
