package com.java.krish.scenario.based;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerTeamMain {

	public static void main(String[] args) {
		// Find sum of scores of all team
		List<Team> teams = PlayerTeamService.getTeams();
		int sum = teams.stream().flatMap(team -> team.getPlayers().stream()).mapToInt(Player::getScore).sum();
		System.out.println(sum);

		// Group the team players according to their skill set (Batsman, ....)
		Map<String, List<Player>> result = teams.stream().flatMap(team -> team.getPlayers().stream())
				.collect(Collectors.groupingBy(Player::getType));
		System.out.println(result);
	}

}
