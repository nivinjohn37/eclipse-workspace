package com.test.UnitTests;

import java.util.*; 
import org.javatuples.KeyValue; 

public class JavaTupleTest {
	 public static void main(String[] args) 
	    { 
	        KeyValue<Integer, String> kv 
	            = KeyValue.with(Integer.valueOf(1), "GeeksforGeeks"); 
	  
	        System.out.println(kv); 
	    } 
}
