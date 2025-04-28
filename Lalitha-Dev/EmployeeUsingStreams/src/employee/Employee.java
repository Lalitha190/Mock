package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	String name;
	String department;
	double salary;
	
	public Employee(String name,
	String department,
	double salary) {
		this.name=name;
		this.department=department;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	class EmployeewithEX{
		public static void main(String[] args) {
			List<Employee> list=new ArrayList<>();
			list.add(new Employee("Narmada","sales",20000));
			list.add(new Employee("Komala","Developer",35000));
			list.add(new Employee("Karthik","Accounts",30000));
			list.add(new Employee("Sanvi","sales",20000));
			list.add(new Employee("Renuka","Developer",30000));
			
			
			Map<String,List<Employee>> emp= list.stream().collect(Collectors.groupingBy(e->e.department));
			
			
			System.out.println(emp);
			 
			}
		}
	}

