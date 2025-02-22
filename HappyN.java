// Nth Happy Number;
import java.util.*;
class HappyN{
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
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(isHappy(i)){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }
}