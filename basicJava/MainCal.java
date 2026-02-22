package basicJava;
public class MainCal {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        VeryAdvCal vac = new VeryAdvCal();
        vac.add(10, 5);
        vac.multiply(10, 5);
        vac.divide(10, 5);
        vac.modulus(10, 5);
        vac.power(2, 3);
        System.out.println("All calculations performed successfully.");
        System.out.println("Sum is: " + vac.add(10, 5) + ", Difference is: " + vac.subtract(10, 5) +
                ", Product is: " + vac.multiply(10, 5) + ", Quotient is: " + vac.divide(10, 5) +
                ", Modulus is: " + vac.modulus(10, 5) + ", Power is: " + vac.power(2, 3));

    }
}