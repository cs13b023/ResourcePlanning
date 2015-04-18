package input;

public class Topic {
	String topic;
	final int ord;
	static int upperbound=0;
	
	private Topic(String s){
		this.topic=s;
		this.ord=Topic.upperbound++;
	}
	
	public String toString(){
		return this.topic;
	}
	
	public int size(){
		return Topic.upperbound;
	}
	
	public static final Topic Foundation=new Topic("Foundation");
	public static final Topic Painting=new Topic("Painting");
	
}
