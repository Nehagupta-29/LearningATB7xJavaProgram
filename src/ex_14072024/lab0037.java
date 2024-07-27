package ex_14072024;

import java.util.Locale;

public class lab0037 {
    public static void main(String[] args) {
        String pass = "NehaGupta@123";
        String pass2 = pass.toLowerCase();

        System.out.println(pass2);

        System.out.println(pass == pass2);
        System.out.println(pass.equals(pass2));
        System.out.println(pass.equalsIgnoreCase(pass2));
        System.out.println(pass.substring(0,3));
        System.out.println(pass.indexOf('p'));
        System.out.println(pass.length());
    }
}
