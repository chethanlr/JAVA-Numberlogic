// write a program to calculate reverse using Recursion
import java.util.*;
class ReverseRecur{
    static void Reverse(int n){
        if(n< 10)
{
    System.out.println(n);
    return;
}  
  else{
    System.out.print(n%10);
    Reverse(n/10);}
  }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    Reverse(n);
}

}