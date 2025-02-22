// Palindrome number;
import java.util.*;
class  Palindrome  {
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
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans =  isPalindrome(n);
        if(ans ==1){
            System.out.println("Palindrome number");
            }else{
                System.out.println("Not a palindrome number");;
            }
        }
    }