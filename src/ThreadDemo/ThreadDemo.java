package ThreadDemo;

class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " => " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " => " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
//        // Threads
//        ThreadClass tc1 = new ThreadClass();
//        ThreadClass tc2 = new ThreadClass();
//        tc1.start();
//        tc2.start();

        // Runnable Interface
        Thread th1 = new Thread(new RunnableClass());
        Thread th2 = new Thread(new RunnableClass());
        th1.start();
        th2.start();
    }
}
