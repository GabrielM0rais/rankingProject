package com.uern.poo.ranking.ranking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uern.poo.ranking.ranking.game.Game;
import com.uern.poo.ranking.ranking.services.GameService;

@RestController
@RequestMapping(path = "/games")
public class GameController {
	
	private final GameService gamesServices;
	
	@Autowired
	public GameController(GameService gamesServices) {
		this.gamesServices = gamesServices;
	}
	
	@GetMapping
	public List<Game> getFilm() {
		return gamesServices.getFilms();
	}
	
	@PostMapping
	public void registerNewGame(@RequestBody Game game) {
		gamesServices.addNewGame(game);
	}
	
	@DeleteMapping(path = "{gameId}")
	public void deletingGame(@PathVariable("gameId") long gameId) {
		gamesServices.deleteGame(gameId);
	}
}
