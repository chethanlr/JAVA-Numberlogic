//Nth Harshad number;
import java.util.*;
class HarshadN{
    static boolean isHarshad(int n){
        int temp=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return temp%sum==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        while(count<n){
            if(isHarshad(i)){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }
}