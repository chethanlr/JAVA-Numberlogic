// disarium number 
import java.util.*;
class Disarium{
    static int CountDigits(int n){
        int count = 0;
        while( n> 0){
            count ++;
            n = n/10;
           }
           return count ;
                }
    static int getSum(int n){
        int sum = 0;
        int digits = CountDigits(n);
        while(n > 0){
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,digits);
            n = n/10;
            digits --;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = getSum(n);
        if(sum == n){
            System.out.println("Disarium number");
        }else{
            System.out.println("Not a Disarium number");
        }
    }
    

}