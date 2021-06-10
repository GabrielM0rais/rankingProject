package com.uern.poo.ranking.ranking.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uern.poo.ranking.ranking.game.Game;
import com.uern.poo.ranking.ranking.rapositories.GameRepository;

import java.util.List;

@Configuration
public class GameConfig {
	
	@Bean
	CommandLineRunner commandLineRunner (GameRepository repository) {
		return args -> {
			Game theWitcherIII = new Game(
				"The Witcher® 3: Wild Hunt",
				"The Witcher 3: Wild Hunt é o terceiro capítulo da saga de Geralt of Rivia",
				"https://cdn.akamai.steamstatic.com/steam/apps/355880/capsule_616x353.jpg?t=1590487706",
				"5 estrelas",
				"Motor: REDengine 3"
			);
			
			Game wow = new Game(
				"World of Warcraft",
				"World of Warcraft é um jogo on-line do gênero MMORPG",
				"https://dropsdejogos.uai.com.br/wp-content/uploads/sites/10/2019/11/wow.jpg",
				"5 estrelas",
				"Unreal Engine 4"
			);
			
			repository.saveAll(
					List.of(theWitcherIII, wow)
			);
		};
	}
}
