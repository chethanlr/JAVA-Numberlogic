// Abundant Number
import java.util.*;
class Abundantnumber{
    static boolean isAbundant(int n ){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i ==0){
                sum = sum+i;
            }
        }
        return sum >n;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isAbundant(n)){
            System.out.println("Abundant Number");
        }
            else{
            System.out.println("Not Abundant Number");
        }
    }
 }
        