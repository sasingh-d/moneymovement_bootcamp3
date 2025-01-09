package com.myprc.demo.service;

public class Dev {

	private Computer comp;

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public Dev(Computer comp) {
		super();

		this.comp = comp;
	}

	public Dev() {
		System.out.println("This is dev constructor");
	}

	public void build() {

		System.out.println("Working on Awesome Projects.");
	}

}
