package org.genration.italy.model;

public class Utente extends Account {
	
	private String dataRegistrazione, nrTelefono;
	
	/**
	 * sub class, inherit from Account
	 * @param username
	 * @param password
	 * @param nome
	 * @param cognome
	 * @param dataRegistrazione
	 * @param nrTelefono
	 */
	public Utente(String username, String password, String nome, String cognome, String dataRegistrazione, String nrTelefono) {
		super(username, password, nome, cognome);
		this.dataRegistrazione=dataRegistrazione;
		this.nrTelefono=nrTelefono;
	}

	@Override
	public String toString() {
		return super.toString()+"\nData registrazione: "+dataRegistrazione+"\nNumero di telefono: "+nrTelefono+"\n";
	}
}