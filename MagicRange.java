// Magic number in range
import java.util.*; 
class MagicRange {
    static boolean isMagic(int n){
        int sum = 0;
        while(n > 0 || sum > 9) 
            { 
                if (n == 0) 
                { 
                    n = sum; 
                    sum = 0; 
                } 
                sum += n % 10; 
                n /= 10; 
           }
           return sum ==1;
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i = n; i <= m; i++)
        {
            if(isMagic(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}


    // Magic number in range    
    