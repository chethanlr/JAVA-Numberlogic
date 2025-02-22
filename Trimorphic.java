// Trimorphic number;

import java.util.*;
class Trimorphic {
    static boolean isTrimorphic(int n){
        int cube = n*n*n;
        while(n > 0){
            if(n%10 != cube%10){
                return false;
            }
            n = n/10;
            cube = cube/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isTrimorphic(n))
            System.out.println("Trimorphic number");
        else
            System.out.println("Not a Trimorphic number");
    }
}