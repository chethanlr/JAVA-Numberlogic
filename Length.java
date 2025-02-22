class Length{
    static int Num(int n){
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Num(n));
                    }
    }
