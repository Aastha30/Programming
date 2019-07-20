
public class StackMain {

	public static void main(String[] args) {
		
		StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<Integer>();
		StackUsingLinkedList<String> stack1=new StackUsingLinkedList<String>();
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(60);
		
		stack1.push("Everyone");
		stack1.push("Morning");
		stack1.push("Good");
		stack1.push("Hi!");
		
		System.out.println("Stack: "+stack);
		System.out.println("Stack: "+stack1);

		stack.pop();
		stack1.pop();
		System.out.println("Stack after Pop Operation: "+stack);
		System.out.println("Stack after Pop Operation: "+stack1);
		 
		System.out.println("Element on the top of the stack: "+stack.peek());
		System.out.println("Element on the top of the stack: "+stack1.peek());
                System.out.println("astha");
		
	}

}
