// perfect square numbers in a given range
import java.util.*;
class PerfectSquareRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
    static void isPerfectSquare(int n, int m){
        for(int i = n; i <= m; i++){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPerfectSquare(int n){
        if(n < 0){
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
          
    }
    
   
}