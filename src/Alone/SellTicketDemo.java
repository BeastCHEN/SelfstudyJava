package Alone;

class SellTicket implements Runnable {
    private int tickets = 100;
    //在SellTicket类中重写run()方法实现卖票，代码步骤如下
    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
/**
 * @author Chen
 */
public class SellTicketDemo {
    public static void main(String[] args) {
//创建SellTicket类的对象
        SellTicket st = new SellTicket();
//创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
//启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
