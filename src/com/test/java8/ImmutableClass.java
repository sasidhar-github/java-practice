package com.test.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ImmutableClass {
	
	private final String name;
	private final int id;
	private final Map<String, String> map;
	
	public ImmutableClass(String name,int id,Map<String, String> map) {
		this.name = name;
		this.id = id;
		Map<String,String> tempMap= new HashMap<>();
		for(Map.Entry<String, String> entry:map.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.map = tempMap;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Map<String, String> getMap() {
		Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             this.map.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
	}
	
	
	
	

}
