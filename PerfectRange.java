// perfect number in the given range ;
import java.util.*;
class PerfectRange{
    static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }
}