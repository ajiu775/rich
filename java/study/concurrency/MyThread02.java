package study.concurrency;

/**
 * @Description: 实现Runnable接口去实现多线程一般可以用共享变量
 * @Param:
 * @return:
 * @Author: Mr.Xing
 * @Date: 2018/12/24
 */
public class MyThread02 implements Runnable {
    public MyThread02() {
    }

    @Override
    public void run() {
        System.out.println("我是runnable线程实现");
    }

    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02();
        myThread02.run();
    }
}
