package org.animals.abs;

public class Delfino extends Animals implements Nuotante {
	
	public Delfino (String name) {
		super(name);
	}
	
	@Override
	
	public void verso() {
		System.out.println("Addio e grazie per tutto il pesce!");
	}
	
	@Override
	public void mangia() {
		System.out.println("Pesce");
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!");
	}
	@Override
	public String toString() {
		return 
				"Nome: " + super.toString();
	}
}
