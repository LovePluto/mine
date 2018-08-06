package com.wyh.thread;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AQS extends AbstractQueuedSynchronizer {
    //是否处于被占用
    @Override
    protected boolean tryAcquire(int arg) {
        return getState() == 1;
    }

    @Override
    protected boolean tryRelease(int arg) {
        return super.tryRelease(arg);
    }

    @Override
    protected int tryAcquireShared(int arg) {
        return super.tryAcquireShared(arg);
    }

    @Override
    protected boolean tryReleaseShared(int arg) {
        return super.tryReleaseShared(arg);
    }
}
