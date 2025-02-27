// product of the array;    
import java.util.*;
public class Prod
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elments of the array : ");
        int n = sc. nextInt();
        int arr [] = new int[n];
        for(int i = 0 ; i < n ; i++){
           arr[i] = sc.nextInt();
        }
        int sum = 1;
        for(int i = 0 ; i < n ; i++){
            sum = sum * arr[i];
    }
    System.out.println("The Product of the array is :"+ sum);
    }
}