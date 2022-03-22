package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamsExample {
	public static void main(String args[]) {
		List<Integer> a=Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> stream =a.stream();
		stream.filter(i -> i%2==0).reduce((e,d)-> e+d).ifPresent(System.out::println);
		
		
	}

}
