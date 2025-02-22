// N prime number 
import java.util.*;
class PrimeN{
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
       int i=2;
       while(n>0){
        if(isPrime(i)){
            System.out.println(i);
            n--;
        }
        i++;
       }
    }
}
