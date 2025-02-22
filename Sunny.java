// Sunny number;
import java.util.*;
class Sunny{
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
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isSunny(n))
            System.out.println("Sunny number");
        else
            System.out.println("Not a sunny number");
    }
}




  