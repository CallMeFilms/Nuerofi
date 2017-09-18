package me.callmefilms.Neurofi;

import java.util.ArrayList;
import java.util.List;

public class AI {
	
	private String name;
	private int level;
	private boolean hasNetAccess;
//	private AIPerson personality;
	
	public AI(int level, boolean hasNetAccess) {
		this.level = level;
		this.hasNetAccess = hasNetAccess;
//		this.personality = personality;
		this.name = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public boolean hasNetAccess() {
		return this.hasNetAccess;
	}
	
//	private AIPerson getPersonality() {
//		return this.personality;
//	}
//	
//	public String getPersonalityName() {
//		return getPersonality().getName();
//	}
	
	List<String> relay(List<String> toRelay) {
		for(int i = 0; i < toRelay.size(); i++) {
			System.out.println(toRelay.get(i));
		}
		return toRelay;
	}
	
	List<String> search(String url, String keywords) {
		List<String> info = new ArrayList<String>();
		switch(url) {
		case "www.google.com":
			switch(keywords.toLowerCase()) {
			case "president":
				info.add("Donald Trump");
				info.add("45th president");
				break;
			case "1st amendment":
				info.add("5 Rights");
				info.add("Right to religion");
				info.add("Right to free speach");
				info.add("Right to congregate");
				info.add("...");
				break;
			case "father of genetics":
				info.add("Gregor Mendell");
				info.add("Experimented on pea plants");
				info.add("Discovered recessive and dominant traits");
				break;
			default:
				info.add("Could not find \"" + keywords + "\" in search results.");
				break;
			}
			break;
		default:
			info.add("Bro, why aren't you using Google?");
		}
		return info;
	}
	
	public void answer(String question) {
		switch(getLevel()) {
		case 1:
			System.out.println("As I'm currently not programmed to answer questions yet, I will do a quick"
					+ " search for your question.");
			relay(search("www.yahoo.com", question));
			break;
		case 2:
			System.out.println("As I'm currently not programmed to answer questions yet, I will search"
					+ " Google for you question.");
			relay(search("www.google.com", question));
			break;
		default:
			System.out.println("Error: Could not compute AI level.");
		}
	}
	
//	String runTask(String taskRequest) {
//		
//	}
	
}
