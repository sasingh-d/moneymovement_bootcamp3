package com.myprc.demo.service;

public class Desktop implements Computer {

	public Desktop() {
		System.out.println("This is Desktop constructor");
	}

	public void compile() {
		System.out.println("Compiling with 404 bug, faster using desktop");
	}

}
