package com.sks.learn.ds;

/**
 * Asymptotic Analysis:
 * 		Time : O(1)
 * 		Space: Array so lesser space than LinkedList
 * 		Enhancements: Resizing the Array: Repeated Doubling during Push operation
 * 			The idea is to reduce the frequency of copying the data to new array : O(n)
 * 			Note: If you increase size by 1 each time then it will be O(n^2)
 * 		For pop - shrink array : 
 * 			Thrashing - push-pop-push-pop when array is full then it will double-half-double-half
 * 
 * Resize Array:
 * 	Push - double size of array s[] when array is full
 * 	Pop - half size of array s[] when array is one-quarter full
 * 			Why not half the array when array is half full : Thrashing
 * 
 * Use Array with N=10 Capacity
 * Note - 
 * 	nextAvailableIndex points to null entry
 * Fundamental Defect in using Array : 
 * 		We have to declare size of Array
 * 		If size increases then we have to increase the Capacity
 * 		For fixed capacity Stack implementation is best
 * 		But providing client capacity is not good so we need array resizing
 * 
 * Resizing Array Vs Linked List
 * 		Linked List : Every operation is O(1) in worst case but we need more space to build links 
 * 		Resizing Array: Better Amortized time: Lesser wasted space
 * @author Sujit K Singh
 *
 */
public class StackArrayImpl implements StackInterface {
	Object[] array = new Object[1];
	int nextAvailableIndex = 0;

	@Override
	public void push(Object obj) {
		// If array is full then double the size
		if (nextAvailableIndex > 0 && nextAvailableIndex == array.length) {
			//System.out.println("array.length = "+array.length);
			resize(2 * array.length);
		}
		array[nextAvailableIndex++] = obj;
		System.out.println("Pushed: " + obj);
	}

	@Override
	public Object pop() {
		Object toBePopped = array[--nextAvailableIndex];
		System.out.println("Popped: " + toBePopped);
		// If array is quarter full then reduce the size to half
		if (nextAvailableIndex > 0 && nextAvailableIndex == array.length / 4) {
			resize(array.length / 2);
		}
		return toBePopped;
	}

	@Override
	public Object peek() {
		System.out.println("Peek");
		return array[nextAvailableIndex - 1];
	}

	@Override
	public boolean isEmpty() {
		return nextAvailableIndex == 0;
	}

	@Override
	public void printStackContent() {
		System.out.print("\nStackContent = [");
		for (int i = 0; i < nextAvailableIndex; i++) {
			System.out.print(array[i]);
			if (i != (nextAvailableIndex - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");

	}

	private void resize(int capacity) {
		//System.out.println("Inside resize()");
		Object[] toBeArray = new Object[capacity];
		for (int i = 0; i < array.length; i++) {
			toBeArray[i] = array[i];
		}
		array = toBeArray;
		//System.out.println("array.length = "+array.length);
	}

}
