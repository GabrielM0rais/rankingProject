package com.uern.poo.ranking.ranking.rapositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uern.poo.ranking.ranking.game.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
