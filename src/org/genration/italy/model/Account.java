package org.genration.italy.model;

public class Account {
	protected String username, password, nome, cognome;

	/**
	 * super class
	 * @param username
	 * @param password
	 * @param nome
	 * @param cognome
	 */
	public Account(String username, String password, String nome, String cognome) {
		super();
		this.username = username;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	/**
	 * @param password
	 * @return String
	 */
	public String getPassword(String password) {
		String pswd=null;
		if(password.equals(this.password)) {
			pswd=this.password;
		}
		return pswd;
	}

	/**
	 * @param vecchiaPassword
	 * @param nuovaPassword
	 * @param confermaNuovaPassword
	 * @return boolean
	 */
	public boolean cambiaPassword(String vecchiaPassword, String nuovaPassword, String confermaNuovaPassword) {
		// ritorno lo stato dell'operazione
		boolean stato = false;
		// controllo che l'utente conosca la vecchia password
		if (vecchiaPassword.equals(this.password)) {
			// controllo che la password di conferma sia uguale alla nuova password
			if (confermaNuovaPassword.equals(nuovaPassword)) {
				if(vecchiaPassword.equals(this.password)) {
					this.password = nuovaPassword;
					// operazione eseguita con successo, ritorno true
					stato = true;
				}
			}
		}
		return stato;
	}

	// metodo funzionale solo se da usare all'interno della console
	/**
	 * @return String in "*" chars format
	 */
	private String nascondiPassword() {
		String passwordNascosta = "";
		for (int i = 0; i < this.password.length(); i++) {
			passwordNascosta += "*";
		}
		return passwordNascosta;
	}

	@Override
	public String toString() {
		return "\nUsername: " + username + "\nPassword: " + nascondiPassword() + "\nNome: " + nome + "\nCognome: "
				+ cognome + "\n";
	}
}
