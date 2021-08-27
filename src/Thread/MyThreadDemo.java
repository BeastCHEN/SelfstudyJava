package Thread;

/**
 * @author Chen
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("高铁");
        my2.setName("飞机");
        //MyThread my1 = new MyThread("高铁");
        //MyThread my2 = new MyThread("飞机");
        my1.start();
        my2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
