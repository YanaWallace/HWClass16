package HWClass16;

public class Task001 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    }

