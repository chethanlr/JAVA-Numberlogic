// Write a program to add two numbers without using arthmatic operators..
import java.util.*;
class AddTwoNumbers{
    static int addTwo(int a,int b){
        while( b != 0){
            int carry = (a&b)<<1;
            a = a^b;
            b = carry ;
            
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of two number is "+ addTwo(a,b));
        }
    }
