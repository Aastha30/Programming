
public class QueueUsingLinkedList<T> {
	Node<T> front;
	Node<T> rear;
	 
	class Node<T>
	{
		T data;
		Node next;
		
		Node(T data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void enqueue(T data)
	{
		Node<T> newNode=new Node<T>(data);
		if(rear==null)
		{
			rear=newNode;
			front=rear;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
			
		}
	}
	
	public T dequeue()
	{
		if(front==null)
		{
			System.out.println("Underflow! Queue is empty");
			return null;
		}
		else
		{
			Node<T> temp=front;
			front=front.next;
			if(front==null)
			{
				rear=front;
			}
			
			return temp.data;
		}
	}
	
	public T peek()
	{
		return front.data;
	}
	
	public String toString()
	{
		Node<T> temp=front;
		String s=" ";
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return s;
	}
	

}
