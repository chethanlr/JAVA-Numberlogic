//Smallest number;
import java.util.*;
class SmallestNumber{
    static int smallest(int n){
        int small=9;
        while(n!=0){
            int r=n%10;
            if(r<small){
                small=r;
            }
            n=n/10;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Smallest digit is "+smallest(n));
    }
}