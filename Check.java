// Positive or negative or z
class Check{
    static int check(int n){
        if(n > 0){
            return 1;
        }
        else if(n < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = check(0);
        System.out.println(result);
    }
}