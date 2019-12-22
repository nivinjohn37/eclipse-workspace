package com.test.UnitTests;

import java.util.*;
import org.javatuples.KeyValue;

class KeyValueTest {
	public static void main(String[] args) {
		KeyValue<Integer, String> kv1 = KeyValue.with(Integer.valueOf(1), "Maths");
		KeyValue<Integer, String> kv2 = KeyValue.with(Integer.valueOf(2), "English");
		List<KeyValue> testKVs = new ArrayList<KeyValue>();
		testKVs.add(kv1);
		testKVs.add(kv2);
		//assuming that you want to fetch the value for key = 2
		int key = 3;
		String value = fetchValue(key,testKVs);
		if(value!=null) {
			System.out.println("Value for Key: "+key +" = "+value);
		}else {
			System.out.println("No Key-Value pair found with Key:"+key);
		}
	}

	private static String fetchValue(int i, List<KeyValue> testKVs) {
		for (KeyValue testKv : testKVs) {
			if ((int) testKv.getKey() == i) {
				return (String)testKv.getValue();
			}
		}
		return null;
	}
}