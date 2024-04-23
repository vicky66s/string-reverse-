public class ReverseString {
    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        String reversedStr = reverseString(inputStr);
        System.out.println("Reversed string: " + reversedStr);
    }
}
