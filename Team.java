package me.callmefilms.Neurofi;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String name;
	private List<User> members;
	
	public Team(String name) {
		this.name = name;
		this.members = new ArrayList<User>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<User> getMembers() {
		return this.members;
	}
	
	public List<User> addMember(User user) {
		this.members.add(user);
		return this.members;
	}
	
	public List<User> removeMember(User user) {
		if(this.members.contains(user)) {
			this.members.remove(this.members.indexOf(user));
			System.out.println(user.getName() + " removed from " + getName() + ".");
		} else {
			System.out.println("User not found in team " + getName() + ". Could not remove user from team.");
		}
		return this.members;
	}
	
}
