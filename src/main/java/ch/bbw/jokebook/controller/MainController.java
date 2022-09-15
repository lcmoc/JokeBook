package ch.bbw.jokebook.controller;

import ch.bbw.jokebook.model.Joke;
import ch.bbw.jokebook.service.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ch.bbw.jokebook.service.DatabaseService;

import java.util.Optional;

@Controller
public class MainController {
	private final JokeRepository jokeRepository;
	private final DatabaseService databaseService;

	@Autowired
	public MainController(DatabaseService databaseService, JokeRepository jokeRepository) {
		this.databaseService = databaseService;
		this.jokeRepository = jokeRepository;
	}
	
	@GetMapping("/")
	public String homepage(Model model) {
		model.addAttribute("jokelist", databaseService.getJokes());
		return "index";
	}

	@GetMapping("/jokes")
	public ResponseEntity<Iterable<Joke>> getJokes() {
		System.out.println("Accessing all jokes, HTTP: 200");
		return ResponseEntity
				.status(HttpStatus.OK) // HTTP 200
				.contentType(MediaType.APPLICATION_JSON)
				.body(jokeRepository.findAll());
	}

	@GetMapping("/jokes/{id}")
	public ResponseEntity<Optional<Joke>>
	getJoke(@PathVariable long id) {
		Optional<Joke> joke = jokeRepository.findById(id);

		if (joke.isPresent()) {
			System.out.println("Accessing single joke, HTTP: 200");
			return ResponseEntity
					.status(HttpStatus.OK)  // HTTP 200
					.contentType(MediaType.APPLICATION_JSON)
					.body(joke);
		 } else {
			System.out.println("Accessing single joke, HTTP: 404");
			return ResponseEntity.notFound().build();
		 }
	}

	@PostMapping("/jokes")
	public ResponseEntity<Joke>
	addJoke(@RequestBody Joke joke) {
		System.out.println("Joke created");

		jokeRepository.save(joke);
		return ResponseEntity
				.status(HttpStatus.CREATED)  // HTTP 201
				.contentType(MediaType.APPLICATION_JSON)
				.body(joke);
	}

	@DeleteMapping("/jokes/{id}")
	public ResponseEntity<?>
	deleteJoke(@PathVariable long id) {
		Optional<Joke> joke = jokeRepository.findById(id);

		if (joke.isPresent()) {
			System.out.println("removed Joke");
			jokeRepository.delete(joke.get());
			return ResponseEntity.noContent().build();  // HTTP 204
		} else {
			return ResponseEntity.notFound().build();   // HTTP 404
		}
	}

	@PutMapping("/jokes/{id}")
	public ResponseEntity<Joke>
	updateJoke(@RequestBody Joke joke) {

		jokeRepository.save(joke);
		return ResponseEntity.status(HttpStatus.CREATED)  // HTTP 201
				.contentType(MediaType.APPLICATION_JSON)
				.body(joke);
	}

}

