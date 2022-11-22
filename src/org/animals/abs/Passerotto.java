package org.animals.abs;

public class Passerotto extends Animals implements Volante{
	
	public Passerotto ( String name) {
		super(name);
	}
	
	@Override
	
	public void verso() {
		System.out.println("Cip Cip!");
	}
	
	@Override
	public void mangia() {
		System.out.println("Vermetti, frutta a pezzettini, semini");
	}
	
	@Override
	
	public void vola() {
		System.out.println("Sto volando!");
	}
	@Override
	public String toString() {
		return 
				"Nome: " + super.toString();
	}
}
