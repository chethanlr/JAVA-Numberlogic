//WAP to find the number of even and odd in the array ..
import java.util.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elments of the array : ");
        int n = sc. nextInt();
        int arr [] = new int[n];
        for(int i = 0 ; i < n ; i++){
           arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd= 0;

        for(int i = 0 ; i < n ; i++){
            if( arr[i] % 2 ==0) {
               
               even ++;
            }else{
              odd ++;
            }
        }
            System.out.println("the even number in the array is :" + even );
                System.out.println("the odd number in the array is :" + odd);
    
    }
}

