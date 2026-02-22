package basicJava;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("Test File");
        InnerTestFile obj = new InnerTestFile();
        obj.printMessage(5);
        String password[] = { "XY01", "XY02", "XY03", "XY04"};
        int count = password.length-1;
        System.out.println("Last index of password array: " + count);
    }
}

class InnerTestFile {

    public void printMessage(int message) {
        System.out.println("Message primitive: " + message);
    }

    public void printMessage(Integer message) {
        System.out.println("Message Integer object: " + message);
    }
}
