// Neon numbers in a range
import java.util.*;
class NeonRange{
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end of the range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            if(isNeon(i)){
                System.out.println( isNeon(i) + " is a neon number");
            }
        }
    }
}