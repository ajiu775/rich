package study.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Description: 学习java线程池
 * @Author: Mr.Xing
 * @Date: 2019/4/21/20:20
 */
public class ThreadPool01 {
    public Executor getExecutor() {
        return executor;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    private Executor executor = Executors.newSingleThreadExecutor();


    public static void main(String[] args) {
        ThreadPool01 threadPool01 = new ThreadPool01();
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] b ={0, 1, 3};
    }
}