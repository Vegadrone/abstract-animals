package org.animals.abs;

public abstract class Animals {
	
	private String name;
	
	public Animals (String name) {
		setName(name);
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public abstract void mangia();
	
	public abstract void verso();
	
	public void dormi() {
		System.out.println("ZZZ");
	}
	
	@Override
	public String toString() {
	
		return "Nome: " + getName();
	}
	
}
