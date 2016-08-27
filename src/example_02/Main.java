package example_02;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Thread:" + Thread.currentThread().getName());
        //первый способ создания потока
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        // второй способ создания потока
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnable");
        thread.start();

        // сокращенный второй способ
        Thread thread1 = new Thread(new MyRunnable(), "MyRunnable1");
        thread1.start();

        System.out.println("End Thread:" + Thread.currentThread().getName());
    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("  *-> Start Thread:" + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("     *-> Run Thread:" + Thread.currentThread().getName() + " i= " + i);
        }
        System.out.println("  *-> End Thread:" + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("  ~~~~-> Start Thread:" + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("     ~~~~-> Run Thread:" + Thread.currentThread().getName() + " i= " + i);
        }
        System.out.println("  ~~~~-> End Thread:" + Thread.currentThread().getName());


    }
}
