package basicJava;
public class FinalUsage {
    public static void main(String[] args) {
        
    }
}

final class Test {
    final int MAX_VALUE = 100;

    public void displayMaxValue() {
        System.out.println("Max Value: " + MAX_VALUE);
    }
}

class SubTest  {
    public void show() {
        System.out.println("SubTest class");
    }

    public final void showFinal() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class InnerFinalUsage extends SubTest {
    @Override
    public void show() {
        System.out.println("Overridden show method in InnerFinalUsage class.");
    }
    
}