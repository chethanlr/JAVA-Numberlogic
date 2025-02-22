//purfect number
import java.util.*;
class Perfect{
    static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPerfect(n)){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}