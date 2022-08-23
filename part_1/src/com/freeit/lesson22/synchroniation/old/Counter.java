package com.freeit.lesson22.synchroniation.old;

import static com.freeit.lesson22.synchroniation.old.CounterRunner.lock;

public class Counter {

    public /*volatile*/ int count = 0;

    public /*synchronized*/ void increment() {
        int currentCount = count;
        currentCount = currentCount + 1;
        setCount(currentCount);
        lock.unlock();
    }

    private void setCount(int currentCount) {
        count = currentCount;
    }
}