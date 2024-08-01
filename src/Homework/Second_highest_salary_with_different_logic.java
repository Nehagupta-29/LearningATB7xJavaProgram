package Homework;

import java.util.Scanner;

public class Second_highest_salary_with_different_logic {
    public static void main(String[] args) {
        int []salary = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salaries");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        int max;
        int second_max;

        if(salary[0]>salary[1]){
            max=salary[0];
            second_max=salary[1];
        }
        else {
            max=salary[1];
            second_max=salary[0];
        }

        for (int i = 2; i < salary.length; i++) {
            if(salary[i]> max){
                second_max = max;
                max = salary[i];
            }
            else if(salary[i]> second_max){
                second_max = salary[i];
            }

                   }
        System.out.println("Max salary is:\t"+ max);
        System.out.println("Second max salary is:\t"+ second_max);

    }
}
