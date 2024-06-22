public class Main {

    static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        power(2, 3);
    }
}