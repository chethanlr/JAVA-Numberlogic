        
// Sum of first n natural numbers
import java .util.Scanner;
        class Natural{
            static int natural(int n){
                int sum = 0;
                for(int i = 1; i<=n; i++){
                    sum = sum + i;
                }
                return sum;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(natural(n));
                }
            }
                // Sum of first n natural numbers