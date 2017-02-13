package com.sks.learn.ds;

/**
 * @author Sujit K Singh
 *
 */
public interface StackInterface {

	public void push(Object obj);

	public Object pop();

	public Object peek();

	public int size();

	public boolean isEmpty();
	
	public void printStackContent();
}
