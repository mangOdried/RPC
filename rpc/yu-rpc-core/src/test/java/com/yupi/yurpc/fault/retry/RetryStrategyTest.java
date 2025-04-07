package com.yupi.yurpc.fault.retry;

import com.yupi.yurpc.model.RpcResponse;
import org.junit.Test;

import java.util.concurrent.Callable;

/**
 * 重试策略测试
 */
public class RetryStrategyTest {

    RetryStrategy retryStrategy = new FixedIntervalRetryStrategy();

    @Test
    public void doRetry() throws InterruptedException {

        Runnable runnable = new Thread();
        runnable.run();
        Thread thread = new Thread(()->{
            System.out.println("hello world");
        },"线程37");
        thread.start();

        Thread thread1 = new Thread("test1") {
            @Override
            public void run() {

            }
        };
        thread1.join();
        thread1.isInterrupted();
    }
}
