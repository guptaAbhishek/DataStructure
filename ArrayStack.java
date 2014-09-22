package dataStructure;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import java.io.*;
public class ArrayStack implements Stack{
	
	private int top = -1;
	private Object S[];
	private static final int CAPACITY = 1000;
	private int capacity;
	
	public ArrayStack(){
		
	}
	public ArrayStack(int cap){
		capacity = cap;
		S = new Object[capacity];
	}
	
	@Override
	public int size(){
		return(top+1);
	}
	@Override
	public boolean isEmpty(){
		return (top<0);
	}
	
	@Override
	public void push(Object obj){
		if(size() == CAPACITY){
			System.out.print("Cannot Insert");
			System.exit(0);
		}
		S[++top] = obj;
	}
	
	@Override
	public Object pop(){
		if(isEmpty())
			throw new EmptyStackException();
		top--;
		return S[top];
	}
	
	@Override
	public int top(){
		return size();
	}
	
	
	 
}
