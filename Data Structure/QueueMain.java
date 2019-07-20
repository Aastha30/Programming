
public class QueueMain {

	public static void main(String[] args) {
		
		QueueUsingLinkedList<Integer> queue=new QueueUsingLinkedList<>();
		QueueUsingLinkedList<String> queue1=new QueueUsingLinkedList<>();
		
		queue.enqueue(10);
		queue.enqueue(40);
		queue.enqueue(100);
		
		queue1.enqueue("I");
		queue1.enqueue("am");
		queue1.enqueue("Aastha");
		
		System.out.println("Queue:"+queue);
		System.out.println("Queue: "+queue1);
		
		queue.dequeue();
		queue1.dequeue();

		System.out.println("Queue after dequeue operation:"+queue);
		System.out.println("Queue after dequeue operation: "+queue1);
		
		System.out.println("Element on the front position: "+queue.peek());
		System.out.println("Element on the front position: "+queue1.peek());
	}

}
