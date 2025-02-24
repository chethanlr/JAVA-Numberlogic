// Wap to write a Z with *;
class Zigzag{
    static void isZig(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || i+j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return;
                }
                public static void main(String[] args){
                    int n = 5;
                    isZig(n);
                }
    }


