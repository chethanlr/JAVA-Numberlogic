// Spy Number in a range
import java.util.*;
public class SpyRange {
    static boolean isSpy(int n){
        int sum =  0;
        int product = 1;
        while(n > 0){
            int rem = n%10;
            sum = sum  + rem ;
            product = product * rem;
            n = n/10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            if(isSpy(i)){
                System.out.println(i);
            }
        }
    }
}
