// Nth Armstrong number
import java.util.*;
class ArmstrongN{
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
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while (n != 0){
            if (isArmstrong(i) == i){
                n--;
            }
            i++;
        }
        System.out.println(i-1);
    }
}