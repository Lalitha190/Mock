package main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.Project1Config;
import project1.Project;

public class Project1Example {

	public static void main(String[] args) {
		Project pro=new Project();
		pro.setName("KIA");
		System.out.println(pro);
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Project1Config.class);
		
		Project p=context.getBean("bazaz",Project.class);
		System.out.println("this is from spring context:"+p.getName());
		
		
	}

}
