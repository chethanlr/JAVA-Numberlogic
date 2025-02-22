// Disarium Number in a range 
import java.util.*;
class DisariumRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isDisarium(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isDisarium(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            sum+=Math.pow(r,countDigit(n));
            temp/=10;
        }
        return sum==n;
    }
    static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}