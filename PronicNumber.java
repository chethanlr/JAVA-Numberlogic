// Pronic Number
import java.util.*;
class PronicNumber{

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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (isPronic(n) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}