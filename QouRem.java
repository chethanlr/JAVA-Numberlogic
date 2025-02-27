// find the remainder and qoutient in the array..
// import java.util.*;
// class QouRem{
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the array elements: ");
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int[] qou = new int[n];
    //     int[] rem = new int[n];
    //     for(int i=0;i<n;i++){
    //         qou[i] = arr[i]/2;
    //         rem[i] = arr[i]%2;
    //     }
    //     System.out.print("The qoutient array is :");
    //     for(int i=1;i<n;i++){
    //         System.out.println(qou[i]);
    //     }
    //     System.out.print("The remainder array is :");
    //     for(int i=0;i<n;i++){
    //         System.out.println(rem[i]);
    //     }
    // }

//}
import java.util.*;

class QouRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] qou = new int[n];
        int[] rem = new int[n];
        for(int i=0; i<n; i++){
            qou[i] = arr[i] / 2;
            rem[i] = arr[i] % 2;
        }
        
        System.out.println("The quotient array is:");
        for(int i=0; i<n; i++){
            System.out.println(qou[i]);
        }
        
        System.out.println("The remainder array is:");
        for(int i=0; i<n; i++){
            System.out.println(rem[i]);
        }
        
        sc.close();
    }
}
