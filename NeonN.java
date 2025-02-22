// Nth neon number
import java.util.*;
class NeonN{
    static boolean isNeon(int n){
        int sum = 0;
        int temp = n*n;
        while(temp > 0){
            int rem = temp %10;
            sum = sum + rem;
            temp = temp /10;
        }
        return sum == n;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(isNeon(i)){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }

}