package in.ms.beans;

public class Student {
	
	private String name;
	private boolean flag;
	private double marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
	public void display()
	{
		System.out.println("Name :- "+name);
		System.out.println("Flag :- "+flag);
		System.out.println("Marks :- "+marks);
	}
}
