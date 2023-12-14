package org.generation.italy;

import java.util.HashMap;

import org.genration.italy.model.Account;

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

	/**
	 * @param userName
	 * @param password
	 * @return Account
	 */
	public Account loginUtente(String userName, String password) {
		String passwordRitornata = listaUtenti.get(userName).getPassword();
		Account account = null;
		
		if(listaUtenti.containsKey(userName)) {
			if(passwordRitornata.equals(password)) {
				account = listaUtenti.get(userName);
			}
		}
		
		return account;
	}

	/**
	 * @param userName
	 * @param password
	 */
	public void resettaPassword(String userName, String password) {
		String passwordRitornata = listaUtenti.get(userName).getPassword();
		
		if(listaUtenti.containsKey(userName)) {
			if(passwordRitornata.equals(password)) {
				listaUtenti.get(userName).setPassword(password);
			}
		}
	}
}
