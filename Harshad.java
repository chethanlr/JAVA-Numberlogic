// Harshad number 
import java.util.*;

class Harshad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
        }
        if(num%sum==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not a Harshad number");
        }
        
    }
}