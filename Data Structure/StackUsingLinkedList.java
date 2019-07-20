 
public class StackUsingLinkedList<T> {

	Node<T> top;

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {

			this.data = data;
			this.next = null;

		}
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	public void push(T data)
	{
		Node<T> newNode=new Node<>(data);
		newNode.next=top;
		top=newNode;
		
	}
	
	public T pop()
	{
		if(top==null)
		{
			System.out.println("Underflow! Stack is Empty");
			return null;
		}
		else
		{
			Node<T> temp=top;
			top=top.next;
			return temp.data;
		}
	}
	public T peek()
	{
		return top.data;
	}
	
	public String toString()
	{
		
			Node<T> temp=top;
			String s=" ";
			while(temp!=null)
			{
			s=s+temp.data+" ";
			temp=temp.next;
			}
			return s;
	}

}
