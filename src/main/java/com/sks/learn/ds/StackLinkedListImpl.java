package com.sks.learn.ds;

/**
 * Stack: Linked-list implementation in Java : 
 * 		Time : O(1)
 * 		Space : O(N) : Depends upon the client input a well
 * Note: At any node, next is previous item on the stack : Reverse order of insertion
 * Hint : Think NEXT as : item which will be popped next (Its sounds like Previous :-))
 * push(1,2,3,4) means
 * 4-->3-->2-->1-->null
 * Asymptotic Analysis of Algorithm:
 * 	TIME : Every Operation(Push/Pop/Peek/isEmpty) takes constant time in worst case : O(1)
 * 		There are no loops - Desired characteristics
 * 	SPACE : 16 byte object overhead + 8 byte inner class + 8 byte for item + 8 byte for Next = 40 bytes
 * 			So for N inputs ~ 40N ~ O(N)
 * @author Sujit K Singh
 *
 */
public class StackLinkedListImpl implements StackInterface {
	private Node top;

	private class Node {
		Object item;
		Node next;

		@Override
		public String toString() {
			return item.toString();
		}
	}

	@Override
	public void push(Object obj) {
		Node nodeToBePushed = new Node();
		nodeToBePushed.item = obj;
		nodeToBePushed.next = top;
		top = nodeToBePushed;
		System.out.println("Pushed: " + obj);
	}

	@Override
	public Object pop() {
		Node temp = top;
		top = top.next;
		System.out.println("Popped: " + temp);
		return temp;
	}

	@Override
	public Object peek() {
		System.out.println("Peek");
		return top;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
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
