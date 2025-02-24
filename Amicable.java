// Amicable number
import java.util.*;
class Amicable{
    static int sumofDivisors(int n){
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = sumofDivisors(n);
        if(sum==n){
            System.out.println("The number is perfect");
        }
        else{
            System.out.println("The number is not perfect");
        }
    }
}