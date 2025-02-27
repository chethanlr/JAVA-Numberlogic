// Selection Sort ..
import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array :");
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        } 
        for(int j = 0; j < n-1; j++){
            int min = j;
            for(int i = j+1; i < n; i++){
                if(arr[i] < arr[min]){
                    min = i;
                    }
                    }
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                    }
                    System.out.print("Sorted array is : ");
                    for(int i = 0; i < n; i++){
                        System.out.print(arr[i]+" ");
                        }
                       

    }
}