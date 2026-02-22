package basicJava;
public class VeryAdvCal extends AdvanceCal {
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
