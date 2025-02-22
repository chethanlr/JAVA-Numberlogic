// Nth perfect Square number 
import java.util.*;

class PerfectSquareN{
    static boolean isPerfectSquare(int n){
        int i = 1;
        while(i*i <= n){
            if(i*i == n){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(n > 0){
            if(isPerfectSquare(i)){
                n--;
            }
            i++;
        }
        System.out.println(i-1);
    }
}
