package com.java.krish.tap.two;

/*
 * 	4. minimize game days.
  	age >= 80 and age<= 8 are critical gamer. critical gamer and non critical gamer can't play at same day. all gamer should play the game
  	input :
  	number of game - 10, how many game per day = 1
  	array of gamer with age - [10, 12 ,13, 14, 18, 20, 89, 8]

	4. Minimize game days
	You are given two integers N and D. You have N players and array a of size N. each a[i]
	represents age of the ith player. the players with <=9 age and >=80 are labeled as risky players. Other players are non-risky players. D is maximum count of the players who can play the game any given day. You can either form a team of risky players playing togather or you can form a team of all the non-risky on any given day . The team size cannot exceed D players. Your task is to find minimum number of days to make all players play the game.
	N=8 D=3
	a = [9,80,27,36,34]
	output: 2
	each team can have 3 players as (D=3)
	risky players 9,80 -> forming one team playing on one day (team size 2 <=D)
	nonrisky players -> forming other team playing on the next day (team size 3 <=D)
 */
public class MinimizeGameDays {

	public static void main(String[] args) {
		int team = 3;
		int[] players = { 9, 80, 27, 36, 34 };
		System.out.println(minimizeGameDays(players, team));

		int team1 = 4;
		int[] players1 = { 9, 80, 27, 36, 34, 45 };
		System.out.println(minimizeGameDays(players1, team1));

		int team2 = 3;
		int[] players2 = { 9, 80, 27, 36, 34, 45 };
		System.out.println(minimizeGameDays(players2, team2));

	}

	public static int minimizeGameDays(int[] players, int team) {
		int riskyPlayers = 0;
		int nonRiskyPlayers = 0;
		int result = 0;
		int length = players.length;

		for (int i = 0; i < length; i++) {
			if (players[i] <= 9 || players[i] >= 80) {
				riskyPlayers++;
			} else {
				nonRiskyPlayers++;
			}
		}
		
		while (riskyPlayers > 0 || nonRiskyPlayers > 0) {
			if (riskyPlayers > 0) {
				result++;
				riskyPlayers -= team;
			}
			
			if (nonRiskyPlayers > 0) {
				result++;
				nonRiskyPlayers -= team;
			}
		}

//		while (riskyPlayers > 0) {
//			result++;
//			riskyPlayers -= team;
//		}
//
//		while (nonRiskyPlayers > 0) {
//			result++;
//			nonRiskyPlayers -= team;
//		}
		
		return result;
	}

}
