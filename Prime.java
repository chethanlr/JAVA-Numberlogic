// prime or not 

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int n = sc. nextInt();
        
            boolean flag = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
        }  
        