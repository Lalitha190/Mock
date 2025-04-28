package config;

import org.springframework.context.annotation.Bean;

import project1.Project;

public class Project1Config {

	@Bean(name="bazaz")
	Project project1() {
		Project p=new Project();
		p.setName("bazaz");
		return p;
		
	}
	@Bean
	Project project2() {
		Project p=new Project();
		p.setName("Hero Honda");
		return p;
	}
	@Bean
	Project project3() {
		Project p=new Project() ;
			p.setName("Jaguar ");
			return p;
		}
	}


