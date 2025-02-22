// Find the largest number in a digit 
public class Large{
    static int largest(int n){
        int max = 0;
        while(n > 0){
            int num = n %10;
            if(num >max){
                max = num;
            }
            n /=10;

            }
            return max;
        }
        public static void main(String[] args) {
            int n = 123456;
            System.out.println("The largest digit is: " + largest(n));
    }
}