// Sunny number in a range ..
import java.util.*;
class SunnyRange{
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
    System.out.println("Enter the range : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i=a;i<=b;i++){
        if(isSunny(i)){
            System.out.println(i);
        }
    }
}
}
