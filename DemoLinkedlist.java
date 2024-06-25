package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedlist {

	public static void main(String[] args) {
	// to decalre all double values we use double in linkedlist, called as generic values
		LinkedList<Double> llist=new LinkedList<Double>();
		
		llist.add(2000.03);
		llist.add(3005.35);
		llist.add(3200.03);
		llist.add(321.05);
		llist.add(333.35);
		llist.add(300.35);
		
		System.out.println(llist);
		
		System.out.println(llist.size());
		
		System.out.println(llist.isEmpty());
		 
	    llist.remove(0);
	    System.out.println(llist);
	    System.out.println(llist.indexOf(3005.35));
	    System.out.println(llist.contains(300.35));
	    
	    llist.pop();
	    System.out.println(llist);
	    
	    llist.push(4000.5);
	    System.out.println(llist);
	    
	    llist.get(1);
	    System.out.println(llist);
	    
	    llist.peek();
	    System.out.println(llist);
	    
	    Iterator<Double> itr=llist.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	
	    System.out.println("Max"+Collections.max(llist));
	    System.out.println("Min="+Collections.min(llist));	
	    
	    Collections.sort(llist);
	    System.out.println(llist);
	    
	    System.out.println(Collections.reverseOrder());
	    Collections.reverse(llist);
	    System.out.println(llist);
  	}

}
