package com.test.designpatterns;

public class Computer {

	int ram;
	boolean graphicsEnabled;
	
	Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.graphicsEnabled = builder.graphicsEnabled;
	}
	
	public static class ComputerBuilder {

		private int ram;
		private boolean graphicsEnabled;

		public ComputerBuilder setGraphics(boolean enable) {
			this.graphicsEnabled = enable;
			return this;
		}
		
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
}
