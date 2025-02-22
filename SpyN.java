// Nth Spy number
import java.util.*;
class SpyN{
    static boolean isSpy(int n){
        int sum =  0;
        int product = 1;
        while(n > 0){
            int rem = n%10;
            sum = sum  + rem ;
            product = product * rem;
            n = n/10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(isSpy(i)){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }
}