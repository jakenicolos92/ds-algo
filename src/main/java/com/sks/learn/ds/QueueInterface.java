package com.sks.learn.ds;

public interface QueueInterface {
	public void enqueue(Object obj);

	public Object dequeu();

	public boolean isEmpty();

	public int size();

	public void printQueueContent();
}
