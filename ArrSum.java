// Sum of array elements inside the array;
import java. util.*;
class ArrSum{
    // public static void main(String[] args){
    //     int arr[] =  { 1,2,3,4,5,12,15,23};
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         sum = sum + arr[i];
    //     }
    //     System.out.println("Sum of array elements is: " + sum);
    //     }
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the elments of the array : ");
            int n = sc. nextInt();
            int arr [] = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                
                sum = sum + arr[i];
            }
        System.out.println("The sum of the array is: " + sum);
        
    }
    }
