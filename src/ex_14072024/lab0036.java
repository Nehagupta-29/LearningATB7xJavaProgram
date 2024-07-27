package ex_14072024;

public class lab0036 {
    public static void main(String[] args) {
        String s1 = "Neha";
        String s2 = "Gupta";

        char c = s1.charAt(3);
        System.out.println(c);

        s1.concat(s2); //not storing the concatenated string
        s1 = s1.concat( s2);
        System.out.println(s1);
    }

}
