package ex_28072024;

import java.util.Scanner;

public class lab111 {
    public static void main(String[] args) {
        float  salary[] = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");

        for (int i = 0; i < salary.length; i++) {

            salary[i] = sc.nextFloat();
        }

        float min = salary[0];

        for (int i = 0; i < salary.length; i++) {

            if(min > salary[i]){
                min = salary[i];
            }

        }
        System.out.println("Minimum salary is:" + min);
    }
}
