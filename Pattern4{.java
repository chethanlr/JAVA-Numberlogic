// Run this program in the online complier
class Pattern4{
    static void func(int n){
        char a ;
         for(int i = 0 ; i<2*n ; i++){
              a= 68;
             for(int j=0;j<n;j++){
                 if(i-j >=0 && i+j <= 2*(n-1)){
                     System.out.print(a);
                     a--;
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }
     public static void main(String[] args){
         int n = 4;
         func(n);
     }
 }
