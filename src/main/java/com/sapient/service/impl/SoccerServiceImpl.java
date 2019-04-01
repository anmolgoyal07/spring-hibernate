package com.sapient.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.model.Player;
import com.sapient.model.Team;
import com.sapient.repository.PlayerRepository;
import com.sapient.repository.TeamRepository;
import com.sapient.service.SoccerService;

@Service
public class SoccerServiceImpl implements SoccerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private TeamRepository teamRepository;

	public SoccerServiceImpl() {
	}
	
	public List<Player> getAllTeamPlayers(Long playerId) {
		List<Player> players;
		if(playerId != null) {
			Player player = playerRepository.findById(playerId.longValue());
			players = Collections.singletonList(player);
		} else {
			players = playerRepository.findAll();
		}
		System.out.println(players.get(0).getTeam().getPlayers());
        return players;
    }
	
	public List<Team> getAllTeam(Long teamId){
		List<Team> teams;
		if(teamId != null) {
			Team team = teamRepository.findById(teamId.longValue());
			teams = Collections.singletonList(team);
		} else {
			teams = teamRepository.findAll();
		}
		System.out.println(teams.get(0));
        return teams;
	}
	
    public void addBarcelonaPlayer(String name, String position, int number) {
        Team barcelona = teamRepository.findById(1l);
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
       // newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }

}
