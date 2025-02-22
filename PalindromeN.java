// nth palindrome number
import java.util.*;
class PalindromeN{
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(isPalindrome(i) == 1){
                count++;
            
            }
            i++;
        }
        System.out.println(i-1);
    }
}