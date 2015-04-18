package input;
import java.util.*;

import java.util.ArrayList;

public class Project {
	String Name;
	int priorityLevel;                     //Priority level goes from 0 to 4
	Date targetDate;
	ArrayList<Steps> steps;
	
	public Project(String n, int p, Date t, ArrayList<Steps> s){
		Name=n;
		priorityLevel=p;
		targetDate=t;
		steps=s;
	}
}
