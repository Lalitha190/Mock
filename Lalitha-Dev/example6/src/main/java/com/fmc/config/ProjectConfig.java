package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fmc.Purchase;
@Configuration
@ComponentScan("com.fmc")
public class ProjectConfig {
	@Bean
	Purchase product1() {
		Purchase am=new Purchase();
		am.setName("vivo");
		return am;
	}
	@Bean
	Purchase product2() {
		Purchase p=new Purchase();
		p.setName("Realme");
		return p;
	}
	
}
