package com.training.cg.dp;

public class Captain {
	private static Captain obj;
	private Captain() {
		
	}
	public static Captain getCaptain() {
		if(obj==null) {
			return new Captain();
		}
		return obj;
	}
	public static void play() {
		System.out.println("Captain can play at any number depending upon the situation");
	}

}
