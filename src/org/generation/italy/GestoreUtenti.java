package org.generation.italy;

import java.util.HashMap;

import org.genration.italy.model.Account;
//import org.genration.italy.model.Utente;
//import org.genration.italy.model.Amministratore;

public class GestoreUtenti {
	/**
	 * HashMap of users
	 * keys: usernames
	 * values: Account objects
	 */
	private HashMap<String, Account> listaUtenti = new HashMap<>();

	/**
	 * @param userName
	 * @param account
	 * @return boolean
	 */
	public boolean aggiungiUtente(String userName, Account account) {
		boolean stato=false;
		if(!listaUtenti.containsKey(userName)) {
			listaUtenti.put(userName, account);
		}
		return stato;
	}

	/**
	 * @param userName
	 * @return boolean
	 */
	public boolean rimuoviUtente(String userName) {
		boolean stato=false;
		if(listaUtenti.containsKey(userName)) {
			listaUtenti.remove(userName);
		}
		return stato;
	}

	public void loginUtente(String userName, String password) {
		
	}

	public void resettaPassword(String userName, String password) {
		
	}
}
