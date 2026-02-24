package AdvanceJava.Thread;

class ClassA extends Thread {

    public void run() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            System.out.println("This is from Class A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ClassB extends Thread {
    int array[] = new int[100];

    public void run() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("This is from Class B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BasicThread {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.setPriority(Thread.MAX_PRIORITY);
        classA.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classB.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
