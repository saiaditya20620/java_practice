package com.training.cg;
import java.lang.reflect.Array;
import java.util.function.*;

public class fucntionInterfaceImplementation {
	public static void main(String args[]) {
		String product="Sai Aditya";
		Function<String,String>fun=functionInterfaceExample::show;
		System.out.println(fun.apply(" Aditya"));
		Supplier<Boolean> boolSupplier = () -> product.length() == 10;
        Supplier<Integer> intSupplier = () -> product.length() - 2;
        Supplier<String> supplier = () -> product.toUpperCase();
        System.out.println(boolSupplier.get());
        System.out.println(intSupplier.get());
        System.out.println(supplier.get());
        Consumer<Double> c3 = i -> System.out.println(i+20.0);
        c3.accept(50.20);
        Consumer<Object> f=(e)->
        {
        	for(int i=0;i<=Array.getLength(e)-1;i++) {
        		System.out.println(Array.get(e, i));
        	}
        };
        int[] e= {1,2,4,5};
        f.accept(e);
	}
	

}
