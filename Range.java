// sum of numbers between the range
import java.util.Scanner;
class Range{
    static int sum(int a , int b){
        int sum = 0;
        for(int i = a ; i<= b; i++){
            sum += i;
        }
        return sum ;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a,b));
        }
    }
