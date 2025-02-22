// prime using recurssion
import java.util.*;
class PrimeRecur{
    static boolean isPrime(int n, int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPrime(n,2)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

