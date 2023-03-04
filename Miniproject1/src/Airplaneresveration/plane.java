package Airplaneresveration;
public class plane {
	private int planeNo;
	private int grade;
	private int capacity; // get and set
	plane(int planeNo,int grade,int cap){
	this.planeNo = planeNo;	
	this.grade = grade;
	this.capacity  = cap;
	}
	public int getplaneNo() {
		return planeNo;
	}
		public int getgrade() {
		return grade;
	}
	public int getCapacity(){
		return capacity;
		
	}
    public void setgrade(int No) {
	planeNo = 3;
	
}
		public void setgrade1(int val) {
		grade = 2;
	}
    public void setCapacity(int cap) { //mutator
	capacity = cap;
	
}
    public void displayplaneInfo() {
	System.out.println("planeNo : "  +planeNo+  " grade : " +grade+ " Total capacity : " + capacity);
}
}
