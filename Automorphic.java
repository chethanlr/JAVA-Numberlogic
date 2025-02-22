// Automorphic Numbers;
class Automorphic{
    static int CountDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
        
    }
    public static void main(String[] args){
        int n = 76;
        int dig = CountDigits(n);
        int square = n*n;
        int lastDigits = (int) (square % (Math.pow(10,dig)));
        if(n == lastDigits){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
        }

    