package org.animals.abs;

public class Main {
	public static void main(String[] args) {
		Cane c = new Cane("Fido");
		c.dormi();
		c.mangia();
		c.verso();
		
		System.out.println("---------------------------------------------");
		
		Delfino d = new Delfino("Flipper");
		d.dormi();
		d.mangia();
		d.verso();
		d.nuota();
		
		System.out.println("---------------------------------------------");
		
		Passerotto p = new Passerotto("Francone il passero mangione");
		p.dormi();
		p.mangia();
		p.verso();
		p.vola();
	}	
}
