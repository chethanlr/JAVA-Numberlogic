// Palindrome number in the given range
import java.util.*;
class PalindomeRange{
    static int  isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(n > 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(temp == rev){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
       for( int i = n; i <= m; i++){
           int ans =  isPalindrome(i);
            if(ans ==1){
                System.out.println(i);
            }
        }
    }
}