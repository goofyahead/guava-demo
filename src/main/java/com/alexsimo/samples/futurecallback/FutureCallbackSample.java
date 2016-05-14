package com.alexsimo.samples.futurecallback;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureCallbackSample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        ListeningExecutorService executor = MoreExecutors.listeningDecorator(executorService);

        ListenableFuture<String> future = executor.submit(() -> {
            Thread.sleep(1000);
            return "Task completed";
        });

        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(String s) {
                System.out.println("Task succeed: " + s);
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("Task failed");
            }
        }, executor);


    }
}