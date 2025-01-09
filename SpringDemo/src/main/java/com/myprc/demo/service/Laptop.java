package com.myprc.demo.service;

public class Laptop implements Computer {

	public Laptop() {
		System.out.println("This is Laptop constructor");
	}

	public void compile() {
		System.out.println("Compiling with 404 bug, faster");
	}

}
