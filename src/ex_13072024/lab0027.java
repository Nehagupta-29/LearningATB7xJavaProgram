package ex_13072024;

public class lab0027 {
    public static void main(String[] args) {
        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int age_mamitha = 34;
        int age_pramod = 34;
//        boolean result = age_pramod > age_mamitha;
//        boolean result = age_pramod < age_mamitha;
        boolean result2 = age_pramod >= age_mamitha; // OR gate
        System.out.println(result2);

        int a = 10;
        int b = 10;
        boolean c = (10 >= 10); // 10 > 10 or 10 = 10
        // OR GATE
        System.out.println(c);

        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);
    }
}
