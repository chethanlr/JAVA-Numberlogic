// Trimorphic numbers in a range
import java.util.*;
class TrimorphicRange{
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            if(isTrimorphic(i)){
                System.out.print(i + " ");
            }
        }
        
    }

}
