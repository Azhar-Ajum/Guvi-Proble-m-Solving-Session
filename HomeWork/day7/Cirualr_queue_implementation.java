package day7;

//Question : Create a program to implement a circular queue

class Circular_Queue{
	
	private int[] queue ;
	private int  left ;
	private int  right;
	private int  size;
	private int  capasity;
	
	//constructor
	public Circular_Queue(int capasity) {
		this.capasity = capasity;
		queue = new int[capasity];
		left=-1;
		right =-1;
		size=0;
	}
	
	
	//insert
	public void insert(int value) {
		if(isfull()) {
			System.out.println("Queue is FUll");
			return;
		}
		if(isempty()) {
			left=0;
		}
		
		right=(right+1)%capasity;
		queue[right]=value;
		size++;
	}
	
	//delete
	public void delete() {
		if(isempty()) {
			System.out.println("No element to delete");
			return;
		}
		
		left=(left+1)%capasity;
		size--;
	}
	
	//display
	public void display() {
		if(isempty()) {
			System.out.println("There is no element to display");
			return;
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(queue[(left+i)%capasity]);
		}
	}
	
	
	
	
	public boolean isfull() {
		return capasity==size;
	}
	
	public boolean isempty() {
		return size==0;
	}
}


public class Cirualr_queue_implementation {

	public static void main(String[] args) {
		
		Circular_Queue cq = new Circular_Queue(5);
		
		cq.insert(10);
		cq.insert(20);
		cq.insert(30);
		cq.insert(40);
		cq.insert(50);
		cq.insert(60);
		
		cq.delete();
		cq.display();
		

	}

}
