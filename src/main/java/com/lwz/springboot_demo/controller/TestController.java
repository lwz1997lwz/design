package com.lwz.springboot_demo.controller;

import com.lwz.springboot_demo.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @program: springboot_demo
 * @description: 测试springboot异步使用
 * @author: Linweizhe
 * @create: 2019-10-24 23:42
 **/

@RestController
@RequestMapping("")
public class TestController {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @RequestMapping("")
    public String test() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        Future<String> task1 = asyncTaskService.task1();
        Future<String> task2 = asyncTaskService.task2();
        Future<String> task3 = asyncTaskService.task3();
        String result = null;
        for (;;) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long currentTimeMillis1 = System.currentTimeMillis();
        result = "task任务总耗时:"+(currentTimeMillis1-currentTimeMillis)+"ms";
        return result;
    }
}


