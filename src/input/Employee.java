package input;
import java.util.*;

public class Employee {
	final int id;          //id must be unique for every employee
	String name;
	Date doj;
	int salary;     //there was no need of experience attribute
	ArrayList<EmployeeTopics> interests;
	static int current=0;
	//Current Schedule: its an array of tasks assigned . for the algo well only need the start time
	
	public Employee(String name,Date doj,int s,ArrayList<EmployeeTopics> arr){
		this.name=name;
		this.id=Employee.current++;
		this.salary=s;
		this.interests=arr;
		this.doj=doj;
	}	
	
}
