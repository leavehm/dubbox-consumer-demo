package com.hm01.consumer_demo;

public class Person {

	private String name;

	private Child child;

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("aaaa");
	}
}
