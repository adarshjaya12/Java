package com.adarsh;


public class Main {
    int count = 0;

    public synchronized void increment()
    {
        count++;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.doWork();
    }

    public void doWork() {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                for(int i=0; i<10000;i++)
                {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {

            public void run() {
                for(int i=0; i<10000;i++)
                {
                    increment();
                }
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count : "+count);
    }

}
