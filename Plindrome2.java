// step1 = reverse the number 131 = 131
// step2 = compare the reverse value

public class Plindrome2 {
    public static void main(String[] args) {
        int number = 131;
        int reversedNumber = reverse(number);

        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
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