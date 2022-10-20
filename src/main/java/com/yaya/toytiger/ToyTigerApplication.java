package com.yaya.toytiger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yaya.toytiger.mapper")
public class ToyTigerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyTigerApplication.class, args);
	}

}
