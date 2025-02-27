// reversing the given array..

import java.util.*;

class ReverseArr{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The reversed array is");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        }
        }
