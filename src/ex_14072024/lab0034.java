package ex_14072024;

public class lab0034 {
    public static void main(String[] args) {
        String s1 = "The Testing academy";  // stored in SCP // String constant pool
        String s2 = "The Testing academy";

       String s3 = new String("The testing academy"); // stored in heap
       String s4 = new String("The testing academy");
        System.out.println(s1 == s2);  // check for reference // SCP
        System.out.println(s1.equals(s2)); // check for string content
        System.out.println(s3 == s4);  // check for string reference in heap
        System.out.println(s3.equals(s4)); // check for string content


    }
}
