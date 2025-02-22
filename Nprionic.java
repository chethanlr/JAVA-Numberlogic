// Nth prionic number
import java.util.*;
class PronicNumber{
    static boolean isPrime(int n, int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n,i+1);
    }
    static 
}