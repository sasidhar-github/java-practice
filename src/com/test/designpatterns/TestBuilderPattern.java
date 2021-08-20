package com.test.designpatterns;

public class TestBuilderPattern {

	public static void main(String[] args) {
		Computer cmp = new Computer.ComputerBuilder().setGraphics(true).build();

	}

}
