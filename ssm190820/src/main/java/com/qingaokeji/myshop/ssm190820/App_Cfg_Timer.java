package com.qingaokeji.myshop.ssm190820;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class App_Cfg_Timer {

//	@Scheduled(cron="*/5 * * * * ?")
//	public void abc(){
//		System.out.println("扫描垃圾文件，并删除");
//		
//	}
//	@Scheduled(cron="*/10 * * * * ?")
//	public void sayHello(){
//		System.out.println("你好");
//		
//	}
	
}
///* 每隔5秒执行一次："*/5 * * * * ?"
//
//每隔1分钟执行一次："0 */1 * * * ?"
//
//每天23点执行一次："0 0 23 * * ?"
//
//每天凌晨1点执行一次："0 0 1 * * ?"
//
//每月1号凌晨1点执行一次："0 0 1 1 * ?"
//
//每月最后一天23点执行一次："0 0 23 L * ?"
//
//每周星期天凌晨1点实行一次："0 0 1 ? * L"
//
//在26分、29分、33分执行一次："0 26,29,33 * * * ?"
//
//每天的0点、13点、18点、21点都执行一次："0 0 0,13,18,21 * * ?"
//
//表示在每月的1日的凌晨2点调度任务："0 0 2 1 * ? *"
//
//表示周一到周五每天上午10：15执行作业："0 15 10 ? * MON-FRI" 
//
//表示2002-2006年的每个月的最后一个星期五上午10:15执行："0 15 10 ? 6L 2002-2006" */

 