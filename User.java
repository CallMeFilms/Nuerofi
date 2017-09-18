package me.callmefilms.Neurofi;

public class User {
	
	private String name;
	private Team team;
	private boolean isInSuit;
	private Suit suit;
	
	public User(String name, Team team) {
		this.name = name;
		this.team = team;
		team.addMember(this);
		this.isInSuit = false;
		this.suit = null;
	}
	
	public User(String name) {
		this.name = name;
		this.team = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Team getTeam() {
		if(this.team != null) {
			return this.team;
		}
		return null;
	}
	
	public void switchTeam(Team newTeam) {
		this.team.removeMember(this);
		newTeam.addMember(this);
		this.team = newTeam;
	}
	
	public boolean isInSuit() {
		return this.isInSuit;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public void suitUp(Suit suit) {
		if(isInSuit()) {
			System.out.println(getName() + ": I gotta get out before I get into a new suit.");
		} else {
			switch(suit.loadUser(this)) {
			case 0:
				System.out.println(getName() + ": This suit's not even on.");
				break;
			case 1:
				System.out.println(getName() + ": Somebody else is in this suit.");
				break;
			case 2:
				System.out.println(getName() + ": Suited up!");
				this.suit = suit;
				break;
			}
		}
	}
	
	public void getOut() {
		this.suit = null;
		System.out.println(getName() + ": I'm done for the day, Doc.");
	}
	
}
