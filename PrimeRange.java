// print the prime numbers between range of two numbers
import java.util.*;
class PrimeRange {
    
    
    public static void printPrimesInRange(int start, int end) {
        if (start > end) {
            System.out.println("Invalid range: start should be less than or equal to end");
            return;
        }
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range");
        int end = sc.nextInt();
        printPrimesInRange(start, end);  
    }
        
    }

