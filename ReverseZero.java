// Program to reverse numbers including those with trailing zeros
public class ReverseZero {
    // Method to reverse a number
    static int reverse (int n, int leadingzero) {
        for (int i = 0; i < leadingzero; i++) {
            System.out.println("0");
            
        }  
        int rev = 0;
        while (n != 0) {
            int i = n % 10;
            rev = rev * 10 + i;
            n = n / 10;
        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        // Test cases
        int n = 12309870;
        int leadingzero = 1;
        reverse(n, leadingzero);
    }
}