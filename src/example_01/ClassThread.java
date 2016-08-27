package example_01;

/**
 *
 */
public class ClassThread {
    public static void main(String[] args) {

        Thread t = Thread.currentThread(); //получаем главный поток
        System.out.println(t.getName()); //main
        System.out.println(t);
    }

}
