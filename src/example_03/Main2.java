package example_03;

/**
 *
 */
public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Thread:" + Thread.currentThread().getName());

        //assertTrue ContactTabs
        Thread thread =new Thread(new MyThread2(), "MyThread");
        thread.start();
        //
        //
        //
        //
        thread.join();
        //выход Logout
        for (int i = 0; i < 5; i++) {
            System.out.println("Run Thread:" + Thread.currentThread().getName() + " i= " + i);
            Thread.sleep(100);
        }
        System.out.println("End Thread:" + Thread.currentThread().getName());
    }
}
