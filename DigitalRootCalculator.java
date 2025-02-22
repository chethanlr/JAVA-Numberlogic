// Digital Root Calculator
public class DigitalRootCalculator {
    static int getDigitalRoot(int n) {
        if (n == 0) return 0;
        return n % 9 == 0 ? 9 : n % 9;
    }

    public static void main(String[] args) {
        int n = 367981;
        System.out.println(getDigitalRoot(n));
    }
}
