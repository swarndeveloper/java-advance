package AdvanceJava.Thread;

// TODO: Define PrinterTask implements class that implements Runnable

class PrinterTask {
    public void show(String threadName, String taskName) {
        System.out.println(threadName + ":  Running " + taskName);
    }
}

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Create a single PrinterTask object
        PrinterTask printerTask = new PrinterTask();
        Runnable classA = () -> {
            try {
                printerTask.show("Worker-1", "task 1");
            } catch (Exception e) {
                // TODO: handle exception
            }
        };
        Runnable classB = () -> {
            try {
                printerTask.show("Worker-2", "task 2");
            } catch (Exception e) {
                // TODO: handle exception
            }
        };

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread worker1 = new Thread(classA);
        Thread worker2 = new Thread(classB);
        // TODO: Start both threads
        worker1.start();
        worker2.start();

        // TODO: Use join() to wait for both threads to finish
        worker1.join();
        worker2.join();
    }
}
