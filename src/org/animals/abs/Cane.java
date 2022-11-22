package org.animals.abs;

public class Cane extends Animals {
	public Cane (String name) {
		super(name);
	}
	
	@Override
	public void verso() {
		System.out.println("BAU BAU!");
	}
	
	@Override
	public void mangia() {
		System.out.println("croccantini per lo più");
	}
}
