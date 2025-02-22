// Happy Numbers
import java.util.*;

class Happy {
    static boolean isHappy(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if (isHappy(num)) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
        
        sc.close();
    }
}
