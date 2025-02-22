// Abundant Number in range ;
import java.util.*;

class AbundantRange {
    static boolean isAbundant(int n ){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i ==0){
                sum = sum+i;
            }
        }
        return sum >n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isAbundant(i)){
                System.out.println(i);
            }
        }
    }

}