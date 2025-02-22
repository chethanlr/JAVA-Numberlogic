// Armstrong Numbers
import java.util.*;
class ArmStrong{
    static int countDigits(int n){
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    static int isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while (temp != 0){
            int r = temp % 10;
            sum = sum + (int) Math.pow(r , countDigits(n));
            temp = temp / 10;

        }
        return sum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int sum = isArmstrong(n);
            if (sum == n){
                System.out.println("Armstrong Number");
            }
            else{
                System.out.println("Not Armstrong Number");
            }
            
        }
}