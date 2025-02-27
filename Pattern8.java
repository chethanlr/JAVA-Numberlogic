class Pattern8{

    static void func(int n){
        int a ;
         for(int i = 0 ; i>n ; i++){
         a =3;
             for(int j=0;j>n;j++){
                 if(( i+j >= n-1&& i-j <=0 )){
                     System.out.print(a);
                    a--;
                    }else{
                        System.out.print(" ");
                    }
                }
                    System.out.println();
                
            }
        }
            public static void main(String[] args){
                int n = 7;
                func(n);
            }
}