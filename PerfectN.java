// Nth perfect number 
import java.util.*;
class PerfectN{
    
static boolean isPerfect(int n){
    int sum = 0;
    for(int i = 1; i <= n/2; i++){
        if(n % i == 0){
            sum = sum + i;
        }
    }
    return sum == n;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    int count=0;
    int i=1;
    while(count<n){
        if(isPerfect(i)){
            count++;
        }
        i++;
    }
    System.out.println(i-1);
}
}