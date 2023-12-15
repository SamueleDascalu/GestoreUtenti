package org.genration.italy.model;

public class Amministratore extends Account {
	
	private int codiceBadge;
	
	/**
	 * sub class, inherit from Account
	 * @param username
	 * @param password
	 * @param nome
	 * @param cognome
	 * @param codiceBadge
	 */
	public Amministratore(String username, String password, String nome, String cognome, int codiceBadge) {
		super(username, password, nome, cognome);
		this.codiceBadge=codiceBadge;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nCodice badge: "+codiceBadge+"\n";
	}
	
	public int getBadge() {
		return this.codiceBadge;
	}
	
	public void setCodiceBadge(int codice) {
		this.codiceBadge=codice;
	}
	
}
