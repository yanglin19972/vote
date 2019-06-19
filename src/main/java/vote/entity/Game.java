package vote.entity;

import java.util.List;

public class Game {
	private Integer id;
	private String Gamename;
	private List<Player> players;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGamename() {
		return Gamename;
	}
	public void setGamename(String gamename) {
		Gamename = gamename;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
