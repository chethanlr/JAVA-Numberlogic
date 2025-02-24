// WAP to create a box with *;
class Box{
    static void fun(int n){
        for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
        if ((j*i == 0 ||i == n-1 || j == n-1) ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println();
}  
        return ;
    
    }
   public static void main (String[] args){
        int n = 7 ;
        fun(n);
    }
}


