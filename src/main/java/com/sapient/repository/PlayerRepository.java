package com.sapient.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.model.Player;
import com.sapient.model.Team;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	
	List<Player> findByTeamId(long teamId);
//	List<Player> findByTeam(Team team);
	
	
	Player findByPosition(String position);
	
	Player findById(long playerId);
	List<Player> findAll();

}
