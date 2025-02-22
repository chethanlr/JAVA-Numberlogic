// find the Nth strong number;
import java.util.*;
class StrongN{
    static int factorial(int n) {
            if (n == 0 || n == 1)
                return 1;
            return n * factorial(n - 1);
        }
    
    
        static boolean isStrong(int n) {
            int temp = n;
            int sum = 0;       
            while (n != 0) {
                int digit = n % 10;
                sum += factorial(digit);
                n = n / 10;
            }
            
            return sum == temp;
        }
    
    
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        while(count<n){
            if(isStrong(i)){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }


}