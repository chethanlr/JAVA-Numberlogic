// Spy numbers

import java.util.*;
class Spy{
    static boolean isSpy(int n){
        int sum =  0;
        int product = 1;
        while(n > 0){
            int rem = n%10;
            sum = sum  + rem ;
            product = product * rem;
            n = n/10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isSpy(n))
            System.out.println("Spy number");
        else
            System.out.println("Not a spy number");
}
}