public class Palindrome {
    public static void main(String[] args) {
        palindrome(498);

    }

    public static void palindrome(int n) {
        int remainder = n % 2;
        int palindrome = 0;
        for (int i = 1; i < n; i++) {
            palindrome = palindrome * 10 + remainder;
            if (remainder != 0) {
                n = n / 10;
            }

        }

    }

}
