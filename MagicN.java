//find the nth Magic number;
import java.util.*;
class MagicN{
    static boolean isMagic(int n){
        int sum = 0;
        while(n > 0 || sum > 9) 
            { 
                if (n == 0) 
                { 
                    n = sum; 
                    sum = 0; 
                } 
                sum += n % 10; 
                n /= 10; 
           }
           return sum ==1;
            }
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number ");
                int n = sc.nextInt();
                int count = 0;
                int i = 1;
                while(count < n){
                    if(isMagic(i)){
                        count++;
                    }
                    i++;
                }
                System.out.println(i-1);
            }
}