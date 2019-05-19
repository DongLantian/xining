package com.nankai.xining;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.nankai.xining.repository")
public class XiningSopApplication {

	public static void main(String[] args) {

		SpringApplication.run(XiningSopApplication.class, args);
	}

}
