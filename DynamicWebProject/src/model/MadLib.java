package model;

public class MadLib {

	String properNoun;
	String verb;
	String adjective;
	String noun;
	String transportation;
	public String getProperNoun() {
		return properNoun;
	}
	public void setProperNoun(String properNoun) {
		this.properNoun = properNoun.substring(0,1).toUpperCase() + properNoun.substring(1).toLowerCase();
	}
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb.toUpperCase();
	}
	public String getAdjective() {
		return adjective;
	}
	public void setAdjective(String adjective) {
		this.adjective = adjective.toLowerCase();
	}
	public String getNoun() {
		return noun;
	}
	public void setNoun(String noun) {
		this.noun = noun.toUpperCase();
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation.toLowerCase();
	}

}
