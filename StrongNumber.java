// Strong number implementation
import java.util.Scanner;

class StrongNumber {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }


    static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;       
        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }
        
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Strong number:");
        int num = sc.nextInt();
        
        if (isStrong(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }
}
