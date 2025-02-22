// Find the Genric Root of  anumber;
import java.util.*;
public class GenricRoot{
    static int genric(int n){
        while(n >= 10){
        int sum = 0;
        while(n != 0){
            sum = sum +n % 10;
            n = n / 10;
        }
        n= sum ;
    }
    return n;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("The genric root of the number is : " + genric(n));
}
}
