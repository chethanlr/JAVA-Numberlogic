// Automorphic Number in Range ;
import java.util.*;
class AutomorphicRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i<=m;i++){
            int sq = i*i;
            int temp = i;
            int count = 0;
            while(temp>0){
                count++;
                temp/=10;
            }
            int last = (int)(sq%(Math.pow(10,count)));
            if(last==i){
                System.out.println(i);
            }
        }
    }   

}