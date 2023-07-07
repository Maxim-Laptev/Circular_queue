package program;

public class MyCircularQueue {
	private int[] queue;
	private int size,front,rear;
	public MyCircularQueue(int s) {
		this.size=s;
		this.queue=new int[size];
		front=rear=-1;
	}
	public boolean isFull() {
		if((front==rear+1) || (front==0&&rear==size-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean enQueue(int el) {
		if(isFull()) {
			System.out.println("The queue is full, you can't add an element, but you can "
			+ "delete the first element of the queue, or change its size in the constructor.");
			return false;
		}
		else {
			if(front==-1) {
				front++;
			}
			rear=(rear+1)%size;
			queue[rear]=el;
			System.out.println("Added element "+el+".");
			return true;
		}
	}
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("The queue is empty, you can't delete an item, but you can add it for deletion.");
			return -1;
		}
		else {
			int el=queue[front];
			if(front==rear) {
				front=rear=-1;
			}
			else {
				front=(front+1)%size;
			}
			System.out.println("Element "+el+" has been removed.");
			return el;
		}
	}
	public void printCircularQueue() {
		if(isEmpty()) {
			System.out.println("The queue is empty.");
		}
		else {
			System.out.println("\nThe front pointer -> "+front+".\n");
			System.out.print("Elements -> ");
			for(int i=front;i!=rear;i=(i+1)%size) {
				System.out.print(queue[i]+", ");
			}
			System.out.println(queue[rear]+".\n");
			System.out.println("The rear pointer -> "+rear+".");
		}
	}
}