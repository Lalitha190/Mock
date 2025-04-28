package grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
	String owner;
	double amount;
	public GroupingExample(String owner,
	double amount) {
		this.owner=owner;
		this.amount=amount;
		
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "GroupingExample [owner=" + owner + ", amount=" + amount + "]";
	}
	 public class OwnerSum{
		public static void main(String[] args) {
			 List<GroupingExample> transactions = Arrays.asList(
			            new GroupingExample("Alice", 1500.0),
			            new GroupingExample("Bob", 1200.0),
			            new GroupingExample("Alice", 1700.0),
			            new GroupingExample("Charlie", 1000.0)
			        );
			 Map<String, Double> sum = transactions.stream()
			            .collect(Collectors.toMap(
			                GroupingExample::getOwner,
			                GroupingExample::getAmount,
			                Double::sum 
			            ));
			 System.out.println(sum);
		}
	}
}
