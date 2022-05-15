package com.greatlearning.Graded_Assignment2_DSA_Q1.main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Skyscraper 
{
	
	static int i;
	static Deque<Integer> queue=new LinkedList<Integer>();
	static Deque<Integer> temp_queue=new LinkedList<Integer>();
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) 
	
	{
		
		System.out.println("enter the total no of floors in the building");
		int n=sc.nextInt();
		int [] array=new int[n+1];
		
		for ( i=1;i<=n;i++)
		{
			System.out.println("enter the floor size given on day : "+i);
			int size=sc.nextInt();
			array[i]=size;
			queue.addFirst(i);
		}
		
		System.out.println();
		System.out.println("The order of construction is as follows");
		
		for(i=1;i<=n;i++)
		{
			temp_queue.addFirst(array[i]);
		    System.out.println("Day : "+i);
		    pop(queue,temp_queue);
	        System.out.println();
	    }
		
		Object ob;
		
		 while((ob=queue.poll())!=null)
		 {
			System.out.print(ob+" ");
		 }
		
	 }
		
	
	private static void pop(Deque<Integer> queue,Deque<Integer> temp_queue) 
	{
		 //Base case
		
		if(queue.isEmpty() || temp_queue.isEmpty())
	    {
	    	return;
	    }
		
		else if (queue.peek()==temp_queue.peek())
	    {
	    	System.out.print(queue.poll()+" ");
	    	temp_queue.poll();
	    	pop(queue ,temp_queue);
	    }
		
		else if(temp_queue.contains(queue.peek()))
		{
			System.out.print(queue.poll()+" ");
			pop(queue,temp_queue);
		}
	    
	}

}

