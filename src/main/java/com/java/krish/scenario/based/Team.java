package com.java.krish.scenario.based;

import java.util.List;

public class Team {

	private List<Player> players;

	public Team(List<Player> players) {
		super();
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [players=" + players + "]";
	}

}
