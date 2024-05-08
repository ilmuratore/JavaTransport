package DAO;

import Entities.Utente;

public class UtenteDAO extends GenericDAO<Utente>{
    public UtenteDAO() {
        super(Utente.class);
    }
}
// METODI DI UTILIZZO DA IMPLEMENTARE NEL MAIN


//UtenteDAO utenteDAO = new UtenteDAO(); // Crea un DAO per la classe Utente
//Utente utente = new Utente(1, "Mario", "Rossi"); // Crea un nuovo utente
//utenteDAO.save(utente); // Salva un utente
//Utente foundUtente = utenteDAO.find(1); // Trova un utente per ID
//utente.setNome("Luigi");   // Modifica il nome dell'utente
//utenteDAO.update(utente); // Aggiorna un utente
//utenteDAO.delete(utente); // Elimina un utente

