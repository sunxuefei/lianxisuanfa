package com.pander.paixu;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: sunxuefei10
 * @date: 2021/4/27  2:13 下午
 */
public class 三个线程轮流打印 {

    public static class TestDemo2 implements Runnable{
        private int no;
        private static ReentrantLock lock = new  ReentrantLock();
        private static Condition condition =  lock.newCondition();
        private static int count;
        public TestDemo2(int no){
            this.no = no;
        }

        @Override
        public void run() {
            while (true){
                lock.lock();
                if (count>100){
                    break;
                }else {
                    if (count%3 == this.no){
                        System.out.println(this.no+"-->"+count);
                        count++;
                    }else {
                        try {
                            condition.await();
                        } catch (InterruptedException e)  {
                            e.printStackTrace();
                        }
                    }
                }
                condition.signalAll();
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws  InterruptedException{
        Thread t1 = new Thread(new TestDemo2(0));
        Thread t2 = new Thread(new TestDemo2(1));
        Thread t3 = new Thread(new TestDemo2(2));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }

}
