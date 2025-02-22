// Perfect Square
import java.util.*;
class PerfectSquare {
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
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPerfectSquare(n)){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not a Perfect Square");
        }
    }
}