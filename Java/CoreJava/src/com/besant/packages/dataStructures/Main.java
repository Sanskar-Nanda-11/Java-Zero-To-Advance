package com.besant.packages.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
		names.add("Name2");
		names.add("Name1");
		//Duplicates will be printed
		System.out.println(names);
		
		Set<String> animals = new HashSet<>();
		animals.add("Cat");
		animals.add("Cat");
		animals.add("Cat");
		animals.add("Cat");
		//duplicates will not get printed
		System.out.println(animals);
		
		Map<Integer, String> studentNames = new HashMap<>();
		studentNames.put(1, "Helena");
		studentNames.put(2, "Helena");
		studentNames.put(1, "Ram");
		studentNames.put(3, "Jack");
		studentNames.put(4, "Jill");
		//Duplicate keys will not be printed
		System.out.println(studentNames);
		System.out.println(studentNames.get(3));
		
		Queue<String> birds =  new LinkedList<>();
		birds.add("Crow");
		birds.add("Eagle");
		birds.add("Peacock");
		birds.add("Hen");
		birds.add("Crow");
		//Duplicates allowed
		System.out.println(birds);
		//remove the element at the front of the queue
		birds.remove();
		System.out.println(birds);
		//peek at the element at the front of the queue
		System.out.println(birds.peek());
		
		
	}

}
