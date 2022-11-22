package org.animals.abs;

public class Main {
	public static void main(String[] args) {
		
		Cane c = new Cane("Fido");	
		Delfino d = new Delfino("Flipper");
		Passerotto p = new Passerotto("Francone il passero mangione");
		
		Animals [] animali = {c, p, d};
		
		for( int i = 0; i < animali.length; i++) {
			System.out.println(animali[i].getName());
			animali[i].dormi();
			animali[i].mangia();
			animali[i].verso();
			System.out.println("-------------------");
		}
	}	
	

    static void faiVolare(Volante animals) {
    	animals.vola();
    }
  
    static void faiNuotare(Nuotante animals) {
    	animals.nuota();
    }

}
