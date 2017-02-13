package com.sks.learn.ds;

/**
 * Note: At any node, next is previous item on the stack : Reverse order of insertion
 * Hint : Think NEXT as : item which will be popped next (Its sounds like Previous :-))
 * push(1,2,3,4) means
 * 4-->3-->2-->1-->null
 * @author Sujit K Singh
 *
 */
public class StackImplementation implements StackInterface {

	private class Node {
		Object item;
		Node next;

		Node(Object i, Node n) {
			this.item = i;
			this.next = n;
		}

		@Override
		public String toString() {
			return item.toString();
		}
	}

	private Node top;
	private int size;

	@Override
	public void push(Object obj) {
		System.out.println("Pushing: " + obj);
		if (size == 0) {
			top = new Node(obj, null);
		} else {
			Node nodeToBePushed = new Node(obj, top);
			top = nodeToBePushed;
		}
		size += 1;
	}

	@Override
	public Object pop() {
		System.out.println("Pop");
		if (size == 0) {
			System.out.println("Stack is empty");
		}
		Node temp = top;
		top = top.next;
		size -= 1;
		return temp;
	}

	@Override
	public Object peek() {
		System.out.println("Peek");
		return top;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void printStackContent() {
		Node temp = top;
		System.out.print("\nStackContent = [");
		while (temp != null) {
			System.out.print(temp);
			temp = temp.next;
			if (temp != null) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
	}

}
