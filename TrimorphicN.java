// Nth Trimorphic Number;
import java.util.*;
class TrimorphicN{
    static boolean isTrimorphic(int n){
        int cube = n*n*n;
        while(n > 0){
            if(n%10 != cube%10){
                return false;
            }
            n = n/10;
            cube = cube/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int count = 1;
        int i = 1;
        while(count <= n){
            if(isTrimorphic(i)){
                count++;
            }
            i++;
        }
        System.out.println("The "+n+"th Trimorphic number is "+(i-1));
    }
}