package com.qingaokeji.myshop.ssm190820;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages="com.qingaokeji.myshop.ssm190820")
@MapperScan(value="com.qingaokeji.myshop.ssm190820.mapper")
@EnableScheduling
public class App {
    
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	
}
