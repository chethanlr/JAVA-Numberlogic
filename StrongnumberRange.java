// Strong number between range ;
import java .util.*;
class StrongnumberRange{
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }


    static int isStrong(int n) {
        int temp = n;
        int sum = 0;       
        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }
        
        if(sum == temp){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i<=m; i++){
            if(isStrong(i) == 1){
                System.out.println(i);
            }
        }
    }
}