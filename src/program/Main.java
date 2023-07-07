package program;

public class Main {

	public static void main(String[] args) {
		MyCircularQueue q=new MyCircularQueue(5);
		//Specify the size of the queue (let it be 5 numbers) in the constructor.
		System.out.println("___");
		System.out.println(q.isEmpty());   //true
		System.out.println(q.isFull());   //false
		System.out.println("___");
		q.enQueue(1);   //Added element 1.
		q.enQueue(2);   //Added element 2.
		q.enQueue(3);   //Added element 3.
		q.enQueue(4);   //Added element 4.
		q.enQueue(5);   //Added element 5.
		System.out.println("___");
		q.enQueue(6); //The queue is full, you can't add an element, but you can delete the first element of the queue, or change its size in the constructor.
		System.out.println("___");
		System.out.println(q.isFull());   //true
		System.out.println("___");
		q.printCircularQueue();
		System.out.println("___");
		q.deQueue();   //Element 1 has been removed.
		q.deQueue();   //Element 2 has been removed.
		q.deQueue();   //Element 3 has been removed.
		q.deQueue();   //Element 4 has been removed.
		q.deQueue();   //Element 5 has been removed.
		System.out.println("___");
		q.deQueue();   //The queue is empty, you can't delete an item, but you can add it for deletion.
		System.out.println("___");
		q.printCircularQueue();   //The queue is empty.
		System.out.println("___");
		System.out.println(q.isEmpty());   //true
		System.out.println("___");
	}

}
