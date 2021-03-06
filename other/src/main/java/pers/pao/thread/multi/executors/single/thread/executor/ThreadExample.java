package pers.pao.thread.multi.executors.single.thread.executor;

import lombok.SneakyThrows;

public class ThreadExample implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Thread.sleep(1000);
        System.out.println("run " + name + " thread");
    }
}
