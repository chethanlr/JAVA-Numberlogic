// Prionic Range

import java.util.*;
class PronicRange{
    static boolean isPronic(int n){
        for(int i=0;i<=n;i++){
            if(i*(i+1)==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            if(isPronic(i)){
                System.out.println(i);
            }
        }
    }
    
}