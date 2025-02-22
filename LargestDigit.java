// WAP to find the largest digit in number 
import java.util.*;
class LargestDigit{
    static int large(int n){
        int max = 0;
        while(n>0){
            int num = n%10;
            if(num > max){
            max = num;
        }
        n /=10;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        System.out.println("The largest Digit in the given number is "+large(n));
    }
}

