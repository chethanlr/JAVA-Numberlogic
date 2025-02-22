// Nth Sunny number
// A sunny number is a number where n+1 is a perfect square
import java.util.*;

class SunnyN {
    static boolean isSunny(int n){
        int temp = n+1;
        int sq = (int)Math.sqrt(temp);
        if(sq*sq == temp){
            return true;
        }
        return false;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 1;
        int i = 1;
        while(count <= n){
            if(isSunny(i)){
                count++;
            }
            i++;
        }
        System.out.println("The "+n+"th Sunny number is "+(i-1));
    }
}

        