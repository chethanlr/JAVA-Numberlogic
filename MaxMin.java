// Find the max and min in the arrayy ..
import java.util.*;
class MaxMin{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elments of the array : ");
        int n = sc. nextInt();
        int arr [] = new int[n];
        for(int i = 0 ; i < n ; i++){
           arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int i = 1 ; i < n ; i++){
            if(arr[i] < min ){
               min = arr[i];
        
            }
            if(arr[i] > max ){
              max = arr[i];
            }
        }
            System.out.println("the minimum value in the array is :" + min );
                System.out.println("the maximum  value in the array is :" + max);
    
    }
}


