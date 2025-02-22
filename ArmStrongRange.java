// ArmStrong between the range of two numbers
import java.util.Scanner;
class ArmStrongRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        for(int i = num1; i <= num2; i++){
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }
        }
        public static boolean isArmStrong(int num){
            int temp = num;
            int sum =0;
            while(temp != 0){
                int rem = temp % 10;
                sum = sum + (int) Math.pow(rem, countDigits(num));
                temp = temp / 10;
            }
            if(sum == num){
                return true;
            }
            else{
                return false;
            }
            }
            static int countDigits(int n){
                int count = 0;
                while (n != 0){
                    n = n / 10;
                    count++;
                }
                return count;
            }
    }
