package com.java.krish.scenario.based;

import java.util.ArrayList;
import java.util.List;

public class PlayerTeamService {

	public static List<Team> getTeams() {
		List<Team> teams = new ArrayList<>();
		List<Player> players1 = new ArrayList<>();
		players1.add(new Player("Ganesha", 99, "Batsman"));
		players1.add(new Player("Valmiki", 67, "Bowler"));
		players1.add(new Player("Hanuman", 88, "WicketKeeper"));
		players1.add(new Player("Arjuna", 74, "Empire"));
		players1.add(new Player("Karna", 59, "Batsman"));

		Team t1 = new Team(players1);
		teams.add(t1);

		List<Player> players2 = new ArrayList<>();
		players2.add(new Player("Shiva", 56, "Batsman"));
		players2.add(new Player("Brahma", 73, "Bowler"));
		players2.add(new Player("Krishna", 81, "WicketKeeper"));
		players2.add(new Player("Laxmana", 92, "Empire"));
		players2.add(new Player("Indra", 85, "Batsman"));

		Team t2 = new Team(players2);
		teams.add(t2);

		return teams;
	}
}
