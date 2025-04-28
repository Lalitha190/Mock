package com.example.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Department;
import com.example.entity.DepartmentRepository;
import com.example.entity.Employee;
import com.example.entity.EmployeeRepository;

@Component
public class DepartmentRunner  implements CommandLineRunner{

	@Autowired
	private DepartmentRepository deptrepo;
	
	@Autowired
	private EmployeeRepository emprepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Department devops=new Department();
		devops.setName("Developers");
		devops.setLocation("Atp");
		
		Department testers=new Department();
		testers.setName("Testers");
		testers.setLocation("Dmm");
		
		Employee e1=new Employee();
		e1.setName("komala");
		e1.setDesignation("developers");
		e1.setDepartment(devops);
		
		Employee e2=new Employee();
		e2.setName("Narmada");
		e2.setDesignation("Testers");
		e2.setDepartment(testers);
		
		
	
		
		List<Employee>  empid=emprepo.findByDepartmentId(devops.getId());
		System.out.println(devops.getName());
		
		empid.forEach(emp->{
			System.out.println("employee name is-->"+emp.getName()+"employee department is -->"+emp.getDepartment()+
					"employee id is-->"+emp.getDesignation());
		});
		
deptrepo.saveAll(List.of(devops,testers));
		
		emprepo.saveAll(List.of(e1,e2));
		
		Employee e3=new Employee();
		e3.setName("Dushu");
		e3.setDesignation("Sales");
		e3.setDepartment(testers);
		emprepo.save(e3);
		System.out.println("Newly added employee name is---"+e3.getName());
		
		
	}

}
