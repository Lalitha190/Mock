package projconfig;

import org.springframework.context.annotation.Bean;

import vehicle.Vehicle;

public class ProjectConfig {
	
	
	@Bean(name="honda")
	Vehicle vehicle() {
		 Vehicle veh=new Vehicle();
		 veh.setName("Honda");
		 return veh;
		
	}
	@Bean
	String hello() {
		return "Hi hello";
	}
	@Bean
	
	Integer number() {
		return 123;
	}
	

}
