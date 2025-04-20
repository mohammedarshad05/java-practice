// step1 = reverse the number 131 = 131
// step2 = compare the reverse value

public class Plindrome2 {
    public static void main(String[] args) {
        int n = 131;
        int reversedn = reverse(n);

        if (n == reversedn) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

    public static int reverse(int n) {
        int palindrome = 0;
        int remainder;
        while (n > 0) {
            remainder = n % 10;
            palindrome = palindrome * 10 + remainder;
            n = n / 10;
        }
        return palindrome;
    }
}