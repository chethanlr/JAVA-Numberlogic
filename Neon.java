// Neon number;
import java.util.*;
class Neon{
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
        System.out.println("Enter the number");
            int n = sc.nextInt();
            if(isNeon(n))
                System.out.println("Neon number");
            else
                System.out.println("Not a Neon number");
    }
}

        