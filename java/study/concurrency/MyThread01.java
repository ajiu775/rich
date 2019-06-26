package study.concurrency;
/**
* @Description: 继承Thread去实现多线程一般不共享变量
* @Param:
* @return:
* @Author: Mr.Xing
* @Date: 2018/12/24
*/
public class MyThread01 extends Thread {
    public static Integer account = 0;

    public MyThread01(String name) {
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
        System.out.println("我是线程" + account + "开始学习java并发");
        account++;
    }
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 100; i++) {
                MyThread01 myThread = new MyThread01(String .valueOf(i));
                myThread.start();
                //睡一会可以稍微解决线程并发安全性问题
                //myThread.sleep(1);
            }
            System.out.println("上面是线程不安全的");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
