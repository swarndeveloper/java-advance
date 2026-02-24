package AdvanceJava.Thread;

class Increment {
     int i;
    public synchronized void increment() {
        i++;
    }
}

public class BasicThreadRunnable {
    public static void main(String[] args) throws InterruptedException {
        Increment increment = new Increment(); 
        Runnable classA = () -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    increment.increment();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        };

        Runnable classB = () -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    increment.increment();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        };

        Thread t1 = new Thread(classA);
        Thread t2 = new Thread(classB);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

       System.out.println("Increament value"+increment.i);

    }
}