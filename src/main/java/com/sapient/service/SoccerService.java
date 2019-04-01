package com.sapient.service;

import java.util.List;

import com.sapient.model.Player;
import com.sapient.model.Team;

public interface SoccerService {

	public List<Player> getAllTeamPlayers(Long teamId);
	public void addBarcelonaPlayer(String name, String position, int number);
	public List<Team> getAllTeam(Long teamId);
}
