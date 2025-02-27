// Pendulum problem 
import java.util.*;
class Pendulum{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int[] res = new int[n];
            int mid = n/2;
            res[mid] = arr[0];
            for(int i=1;i<n;i++){
                if(i%2==0){
                    res[mid+i/2] = arr[i];
                }
                else{
                    res[mid-i/2] = arr[i];
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
            sc.close();
        }
    }
