package com.map.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;




public class MapIterations {

	public static void main(String[] args){
		
		Map<String, String> map1 = new HashMap<String,String>();
		Map<String, String> map2 = new HashMap<String,String>();
		
		map1.put("name", "Chaitra");
		map1.put("age", "33");
		map1.put("gender", "female");
		
		map2.put("name", "Chaitra");
		map2.put("age", "33");
		map2.put("gender", "male");
		
		System.out.println(map1==map2);
		
		System.out.println(map1.get("name")+", "+map1.get("age")+", "+map1.get("gender"));
		System.out.println(map2.get("name")+", "+map2.get("age")+", "+map2.get("gender"));
		
		/*****Using CollectionUtils*****/
		
		for(Entry<String, String> e: map1.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
						
		}
	    Collection<?> diff =   CollectionUtils.disjunction(map1.entrySet(), map2.entrySet());
	    System.out.println("Diff: "+diff.toString());
	    
	    boolean b = map1.entrySet().stream().
	    		filter(value -> map2.entrySet().stream().
	    				anyMatch(value1 -> (value1.getKey() == value.getKey() && value1.getValue() == value.getValue()))).findAny().isPresent();
        System.out.println(b);
        
        Set<Entry<String, String>> set1 = map1.entrySet();
        Set<Entry<String, String>> set2 = map2.entrySet();
        System.out.println("set 1: "+set1.toString());
        System.out.println("set 2: "+set2.toString());
        
        //set1.retainAll(set2);
        //System.out.println("set 1: "+set1.toString());
        
        set1.removeAll(set2);
        
        System.out.println("set 1: "+set1.toString());
        
        Integer[] nos = {1,2,3,4,5,2,3,4};
        
        List<Integer> intlist = new ArrayList<Integer>();
        intlist.addAll(Arrays.asList(nos));
        
       // List<Integer> intlist =new ArrayList<Integer>(Arrays.asList(nos));
        
        Set<Integer> setint = new HashSet<Integer>();
        
        setint.addAll(intlist);
        
        System.out.println(setint);
        
       Collection<?> diffs =  CollectionUtils.disjunction(setint, intlist);
       System.out.println("diffs : "+diffs);
        
		
	}
	
}
