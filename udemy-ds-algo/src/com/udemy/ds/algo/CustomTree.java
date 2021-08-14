package com.udemy.ds.algo;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomTree {
	
	public static void main(String []args) {
		 Deque<Integer> deQueue = new ArrayDeque<Integer>();
		 deQueue.offerFirst(20);
		 deQueue.offerFirst(10);
		 deQueue.offerFirst(5);
		 
		 System.out.println(deQueue.getFirst());
		 
	}
	
	
	public static Leaf insert(Leaf l, int data) {
		
		if(l == null) {
			l = new Leaf(data);
		}
		
		return l;
	}

}
