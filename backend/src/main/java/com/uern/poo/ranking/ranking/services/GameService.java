package com.uern.poo.ranking.ranking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uern.poo.ranking.ranking.game.Game;
import com.uern.poo.ranking.ranking.rapositories.GameRepository;

@Service
public class GameService {
	
	private final GameRepository gameRepository;
	
	@Autowired
	public GameService(GameRepository gameRepository) {
		this.gameRepository =  gameRepository;
	}

	public List<Game> getFilms() {
		return gameRepository.findAll();
	}
	
	public void addNewGame(Game game) {
		gameRepository.save(game);
		System.out.println(game);
	}
	
	public void deleteGame(long id) {
			boolean exists = gameRepository.existsById(id);
			if (!exists) {
				throw new IllegalStateException(
						"Game with id " + id + " does not exists.");				
			}
			
			gameRepository.deleteById(id);
		}
	}
