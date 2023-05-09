package HWClass16;

public class Task002 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println(getVowels(str));
    }

    private static String getVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    }

