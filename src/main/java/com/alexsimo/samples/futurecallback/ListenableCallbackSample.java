package com.alexsimo.samples.futurecallback;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListenableCallbackSample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ListeningExecutorService executor = MoreExecutors.listeningDecorator(executorService);

        ListenableFuture<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Task completed";
            }
        });

        future.addListener(new Runnable() {
            @Override
            public void run() {
                runOnCompletion();
            }
        }, executor);

    }

    private static void runOnCompletion() {
        System.out.println("Task finished!");
    }
}