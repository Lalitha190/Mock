package com.nt.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ApplicationRunnerExample implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("--This is applicaion runner--");
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues("name"));
		
		 System.out.println(args.containsOption("Hello"));
		 System.out.println("End of runner");
		 
	}

}
