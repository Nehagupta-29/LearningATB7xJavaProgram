package ex_14072024;

public class lab0041 {
    public static void main(String[] args) {
        byte a = 10;
        // Byte , bits - memory -> 1 Byte, 8 bits are used.
        long l = 10l;
        // memory - 8 Byte, 64 bits

        String s = "name"; // 8 Byte, 64 bits

        byte a1 = 10;
        byte b = 23;
        int c = a1+b;
        System.out.println(c);

        char aa2 = 'A';
        char b1 = 'B';
        int c1 = aa2+b1; // AB ->char
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);

    }
}
