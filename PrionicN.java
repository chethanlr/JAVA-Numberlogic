// Nth prionic number
import java.util.*;
class PronicN{
    static int isPronic(int n)
    {
       if( n < 0){
        return 0;

       }
       for (int i = 0; i <= n; i++) {
            if (i * (i + 1) == n)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
       int i=2;
       while(n>0){
        if(isPronic(i)==1){
            System.out.println(i);
            n--;
        }
        i++;
       }
    }
}