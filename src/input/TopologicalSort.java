package input;

import java.util.ArrayList;

public class TopologicalSort {
	ArrayList<Steps> lst;
	public TopologicalSort(ArrayList<Steps> arr){
		int i,j;
		int n=arr.size();
		lst=new ArrayList<Steps>();
		ArrayList<Steps> s=new ArrayList<Steps>();
		for(i=0;i<arr.size();i++){
			if(arr.get(i).dependencies.size()==0){
				s.add(arr.get(i));
				arr.remove(i);
			}
		}
		while(s.size()!=0){
			Steps st=s.remove(0);
			lst.add(st);
			for(i=0;i<arr.size();i++){
				for(j=0;j<arr.get(i).dependencies.size();j++){
					if(arr.get(i).dependencies.get(j)==st.stepNo){
						arr.get(i).dependencies.remove(j);
					}
				}
				if(arr.get(i).dependencies.size()==0){
					lst.add(arr.get(i));
					arr.remove(i);
				}
			}
		}
		if(n!=lst.size()){
			System.err.println("Error in dependencies");
		}
	}
}
