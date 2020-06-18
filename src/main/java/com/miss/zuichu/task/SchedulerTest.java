package com.miss.zuichu.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTest {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /*@Scheduled(fixedRate = 5000)
    private void processFixedRate() {
        System.out.println("processFixedRate方式：定时任务开始现在时间：" + dateFormat.format(new Date()));
    }*/

    @Scheduled(cron = "5/5 * * * * ?")
    private void processCron() {
        System.out.println("processFixedRate方式：定时任务开始现在时间：" + dateFormat.format(new Date()));
    }
}
