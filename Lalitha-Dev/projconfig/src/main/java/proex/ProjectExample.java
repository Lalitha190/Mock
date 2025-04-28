package proex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import projconfig.ProjectConfig;
import vehicle.Vehicle;

public class ProjectExample {
	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		veh.setName("KIA");
		System.out.println(veh);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle v=context.getBean("honda",Vehicle.class);
		System.out.println("This is from spring context: "+v.getName());
			
	}
	
}
