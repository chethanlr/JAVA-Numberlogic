// Nth Disarium number
import java.util.*;
class DisariumN{
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
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 1;
        int i = 1;
        while(count <= n){
            if(getSum(i) == i){
                count++;
            }
            i++;
        }
        System.out.println("The "+n+"th Disarium number is "+(i-1));
    }}
