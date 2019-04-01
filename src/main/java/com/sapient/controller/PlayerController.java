package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.model.Player;
import com.sapient.model.Team;
import com.sapient.service.SoccerService;

@RestController
@RequestMapping("/user/gamemanagment")
public class PlayerController {

	@Autowired
	private SoccerService soccerService;

	@GetMapping("player/{playerId}")
	public List<Player> fetchPlayers(@PathVariable(name="playerId",required=true) Long playerId) {
		return soccerService.getAllTeamPlayers(playerId);
	}
	
	@GetMapping("player")
	public List<Player> fetchAllPlayers() {
		return soccerService.getAllTeamPlayers(null);
	}
	
	@GetMapping("team/{teamId}")
	public List<Team> fetchTeam(@PathVariable(name="teamId") Long teamId) {
		return soccerService.getAllTeam(teamId);
	}
	
	@GetMapping("team")
	public List<Team> fetchAllTeams() {
		return soccerService.getAllTeam(null);
	}

}
