// Linear Search..
import java.util.*;
class Linear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int x = sc.nextInt();
        for(int i = 0; i<n;i++){
            if(arr[i] == x){
                System.out.print("Element found at index : " + i);
                break;
            }
        }

    }
}