// Harshad number in given range;
import java.util.*;
class HarshadRange{
    static int isHarshad(int num){
        int temp = num;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
        }
        if(num%sum==0){
            System.out.println(num +" " + "Harshad number");
        }
        else{
            System.out.println(num +" " +"Not a Harshad number");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            isHarshad(i);
    }
    }
}