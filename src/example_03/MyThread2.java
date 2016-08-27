package example_03;

// класс ожидания звонка
class MyThread2 implements Runnable {
    private boolean flag = true;
    private int anInt;

    @Override
    public void run() {
        System.out.println("  ~~~~-> Start Thread:" + Thread.currentThread().getName());
        while (anInt<30){
            if (anInt==10){
                System.out.println("Беру трубку");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                                    }
                System.out.println("Ложу трубку");
                anInt=0;
            }
            System.out.println("Ожидаю звонка "+ ++anInt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("  ~~~~-> End Thread:" + Thread.currentThread().getName());
    }
}
