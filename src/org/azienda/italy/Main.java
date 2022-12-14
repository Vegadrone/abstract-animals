package org.azienda.italy;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee ("Gino", "Pino", LocalDate.now(), 650, 15);
    Employee e2 = new Employee ("Paolo", "Rombi", LocalDate.now(), 2400, 8);
    Employee e3 = new Employee ("Lello", "Francosi", LocalDate.now(), 1400, 18);
    
    Boss b1 = new Boss ("Porta", "Ladonna", LocalDate.now(), 35000, 10000);
    Boss b2 = new Boss ("Marta", "Morti", LocalDate.now(), 78000, 9000);
    
    Person [] people = {e1, e2, e3, b1, b2};
    
    int minYearIncome = Integer.MAX_VALUE;
    int maxYearIncome = Integer.MIN_VALUE;
    
    Person maxYearIncomePerson = null;
    Person minYearIncomePerson = null;
    
    Person maxYearIncomeBoss = null;
    Person minYearIncomeEmployee = null;
    
    int totalCost = 0;
    int avgCost = 0;
    
    for ( int i = 0; i < people.length; i++) {
    	
    	System.out.println(people[i]);
    	System.out.println("----------------------------------");
    	
    	if (people[i].getYearIncome() < minYearIncome) {
    		minYearIncome = people[i].getYearIncome();
    		minYearIncomePerson = people[i];
    	}
    
    	
    	if (people[i].getYearIncome() > maxYearIncome) {
    		maxYearIncome = people[i].getYearIncome();
    		maxYearIncomePerson = people[i];
    	}
    	
    	if (people[i].getYearIncome() > maxYearIncome && people[i] instanceof Boss) {
    		maxYearIncome = people[i].getYearIncome();
    		maxYearIncomeBoss = people[i];
    	}
    	
    	totalCost += people[i].getYearIncome();
    }
    
    avgCost = totalCost / people.length;
    
    
  System.out.println(
		  "Ecco chi prende più soldi: " + maxYearIncomePerson +
		  "\n---------------------------------------------------------" +
		  "\nEcco il più povero: " + minYearIncomePerson +
		  "\n---------------------------------------------------------" +
		  "\nEcco il Boss più ricco: " + maxYearIncomeBoss +
		  "\n---------------------------------------------------------" +
		  "\nEcco l'impiegato più povero: " + minYearIncomeEmployee +
		  "\n---------------------------------------------------------" +
		  "\nCosti totali azienda: " + totalCost + " " + "€" + 
		  "\nCosti medi azienda: " + avgCost + " " + "€");
    
  }
}