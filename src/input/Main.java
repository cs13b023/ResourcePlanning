package input;
import java.util.*;
import java.text.*;

public class Main {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		String name,date;
		int priority;
		Date d=new Date();
		Project pro;
		SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
		
		//Project Details - Input
		
		
		System.out.println("Enter the project Details");
		System.out.println("Project name:");
		name=in.next();
		System.out.println("Project Priority:");
		priority=in.nextInt();
		System.out.println("Target Date in dd-MM-yyyy:");
		date=in.next();
		try {
			d=f.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(name+d+priority);
		
		
		//Steps in the project
	
		Topic t;                    //For topic selection use drop down list else it'll be really difficult
		Steps s;                    //Now for checking the algo give topic manually
		double reqHrs;
		int stepno,dep;
		ArrayList<Steps> arrSteps=new ArrayList<Steps>();
		System.out.println("Enter the Step.No:");
		stepno=in.nextInt();
		while(stepno!=-1){
			System.out.println("Enter the Time Required in hrs:");
			reqHrs=in.nextDouble();
			System.out.println("Topic:Currently manually given");
			t=Topic.Foundation;
			System.out.println("Give depedencies step numbers -1 in the end:");
			dep=in.nextInt();
			ArrayList<Integer> arr=new ArrayList<Integer>();
			while(dep!=-1){
				arr.add(dep);
				dep=in.nextInt();
			}
			s=new Steps(stepno,t,arr,reqHrs);
			arrSteps.add(s);
			System.out.println("Enter the Step.No:");
			stepno=in.nextInt();
		}
		
		//Construction of project
		pro=new Project(name,priority,d,arrSteps);
		
		
		
		//Employes Input
		String employ;
		int salary;
		Date doj;
		ArrayList<EmployeeTopics> interests;
		
		
		
		
		
		
		
	}
}
