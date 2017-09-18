package me.callmefilms.Neurofi;

public class Main {

	public static void main(String[] args) {
		
		Suit hawk = new Suit("TJ-Nova-2", "H.A.W.K");
		AI friday = new AI(1, true);
		AI jarvus = new AI(2, true);
		
		hawk.turnOn();
		
		System.out.println("=========================");
		
		Team raptors = new Team("Raptors");
		
		User jackson = new User("Jackson", raptors);
		User joseph = new User("Dr. Anit");
		
		Suit whowl = new Suit("TJ-SETONE-A", "White Owl");
		
		joseph.suitUp(whowl);
		
		System.out.println("=========================");
		
		whowl.turnOn();
		
		System.out.println("=========================");
		
		jackson.suitUp(whowl);
		
		System.out.println("=========================");
		
		joseph.suitUp(whowl);
		
		System.out.println("=========================");
		
		if(jackson.getTeam() == null) {
			System.out.println(jackson.getName() + " has no team.");
		} else {
			System.out.println(jackson.getName() + " is in the " + jackson.getTeam().getName() + " team.");
		}
		
	}

}
