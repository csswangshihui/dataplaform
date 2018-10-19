package com.css.platform.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class TaskService {
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }
}
