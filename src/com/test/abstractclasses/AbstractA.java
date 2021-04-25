package com.test.abstractclasses;

import com.test.interfaces.InterfaceA;

public abstract class AbstractA implements InterfaceA{

	public AbstractA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void testInterfaceB() {
		// TODO Auto-generated method stub
		System.out.println("Not letting my child class to implement unnecessary methods.");
	}
	

}
