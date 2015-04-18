package input;

import java.util.ArrayList;

public class Steps {
	int stepNo;
	Topic topic;
	ArrayList<Integer> dependencies;                      //if we take arraylist of steps then the order of input must be handled and construction will be complicated
	double reqHrs;
	public Steps(int s, Topic n, ArrayList<Integer> arr, double t){
		stepNo=s;
		topic=n;
		dependencies=arr;
		reqHrs=t;
	}
}
