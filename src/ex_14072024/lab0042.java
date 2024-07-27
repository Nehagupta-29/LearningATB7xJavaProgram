package ex_14072024;

public class lab0042 {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; //65
        int ss = s+c;
        System.out.println(ss);

        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s2 = (short) phone_no;
        System.out.println(s2);
        // JVM - GC -

        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);


    }
}
