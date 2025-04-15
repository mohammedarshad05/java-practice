public class Palindrome {
    public static void main(String[] args) {
        palindrome(498);

    }

    public static void palindrome(int n) {
        int palindrome = 0;
        int remainder;
        while (n > 0) {
            remainder = n % 10;
            palindrome = palindrome * 10 + remainder;
            n = n / 10;
        }
        System.out.println("plaindrome = " + palindrome);
    }
}
