package ex_14072024;

public class lab0035 {
    public static void main(String[] args) {
        String s1 = new String("Neha");

        String s2 = new String("Neha");
        String s3 = new String("Neha");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
    }
}
