

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class UnorderedList {
	static Node head;

	static class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;

		}

		public static UnorderedList insert(UnorderedList list, String data) {
			Node newNode = new Node(data);
			if (list.head == null) {
				list.head = newNode;
				return list;
			}

			else {
				Node tail = list.head;
				while (tail.next != null) {
					tail = tail.next;
				}
				tail.next = newNode;
				return list;
			}
		}

		public static UnorderedList search(UnorderedList list, String searchWord) {
			Node currNode = list.head, prev = null;
			if (currNode != null && (currNode.data).equals(searchWord)) {
				list.head = currNode.next;
				System.out.println(searchWord + " found and deleted");
				return list;
			}
			while (currNode != null && !(currNode.data).equals(searchWord)) {
				prev = currNode;
				currNode = currNode.next;
			}
			if (currNode != null) {
				prev.next = currNode.next;
				System.out.println(searchWord + " found and deleted");
			} else {
				System.out.println(searchWord + " not found and added to the list");
				insert(list, searchWord);
			}

			return list;

		}
		public static void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public static void writeFile() throws Exception
		{
			FileWriter fw=new FileWriter("TextOutput.txt");
			Node temp=head;
			String line="";
			while(temp!=null) {
				line+=temp.data+" ";
				temp=temp.next;
			}
			fw.write(line);
			fw.close();
			
		}

		public static void main(String args[]) throws Exception {
			Scanner sc=new Scanner(System.in);
			UnorderedList list = new UnorderedList();
			FileReader fr = new FileReader("/home/admin1/Desktop/Bridgelabz/javaPractice/src/Static/Text.txt");
			BufferedReader br = new BufferedReader(fr);
			String in, line = "";
			while ((in = br.readLine()) != null) {
				line = line + in + " ";
			}
			System.out.println(line);

			String arr[] = line.split(" ");
			for (int i = 0; i < arr.length; i++) {
				list = insert(list, arr[i]);
			}
			System.out.println("Enter a word to search");
			String findWord=sc.next();
			list=search(list,findWord);
			display();
			writeFile();
		}

	}
}
