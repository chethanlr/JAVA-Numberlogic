// write a function to reverse  a number
public class reverse{
    static int reversenum(int n){
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
                }
                return rev;

    }
    public static void main(String[] args) {
        int n= 17864;
        System.out.println(reversenum(n));
    }
}