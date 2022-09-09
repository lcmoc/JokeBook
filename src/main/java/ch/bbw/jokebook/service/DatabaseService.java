package ch.bbw.jokebook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.bbw.jokebook.model.Joke;

@Service
public class DatabaseService {

	private JokeRepository jokeRepository;

	//@Autowired
	// TODO: Autowired verbindet das Repository mit dem Service
	public DatabaseService(JokeRepository jokeRepository) {
		this.jokeRepository = jokeRepository;
	}

	public List<Joke> getJokes() {
		// TODO: Schalten Sie hier eine Lösung frei
		return new ArrayList<>();
//		Lösung I: konventionell 
//		Iterable<Joke> iterable = jokeRepository.findAll();
//		List<Joke> list = new ArrayList<>();
//		iterable.forEach(list::add);
//		return list;
		
		// Lösung II: mit Stream-Utitilies
//		return StreamSupport.stream(jokeRepository.findAll().spliterator(), false)
//							.collect(Collectors.toList());
	}
	
	// TODO: CRUD Funktionen implementieren
	public Joke createJoke(String text) {
		// Hinweis: Der Service kümmert sich um das Datum der Erstellung und
		// initialisiert das Rating. Die Id des Datensatzes wird durch
		// die Datenbank (autoincrement) automatisch gesetzt.
		
		return null;
	}
	
	public Joke readJoke(int id) {
		// den Joke mit der entsprechenden Id laden und zurückgeben
		return null;
	}
	
	public Joke updateJoke(Joke joke) {
		// den Joke mit der entsprechenden Id aktualisieren
		return joke;
	}
	
	public void deleteJoke(int id) {
		// den Joke mit der entsprechenden Id löschen
	}	
	
}
