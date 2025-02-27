//Binary Search..
import java.util.*;
class BinarySearch{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the elements of the array: ");
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the element to be searched:");
    int key = sc.nextInt();
    int low = 0;
    int high = n-1;
    while(low<= high){
        int mid= (low+high)/2;
        if(arr[mid]==key){
            System.out.println("Element found at index: "+mid);
            break;
        }
        else if(arr[mid]<key){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
}
}