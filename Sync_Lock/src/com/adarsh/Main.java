package com.adarsh;

import java.util.*;

public class Main {
    Random random = new Random();
    private Object myObject = new Object();
    private Object myObject2 = new Object();
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    public void doStart() {
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                synchronized (myObject) {
                    for (int i = 0; i < 1000; i++) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        list.add(random.nextInt());
                    }
                }

            }
        });
    }

    public void doStart1(){

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                synchronized (myObject2)
                {
                    for(int i=0;i<1000;i++)
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        list2.add(random.nextInt());
                    }
                }

            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        long startTime = System.currentTimeMillis();
        main.doStart();
        long endTime = System.currentTimeMillis();

    }
}
