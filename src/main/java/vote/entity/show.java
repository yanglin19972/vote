package vote.entity;

public class show {
	private int pk_id;
	private int player_id;
	private int play_id;
	private int usert_id;
	private Player player;
	private Play play;
	private production production;
	public int getPk_id() {
		return pk_id;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getPlay_id() {
		return play_id;
	}
	public void setPlay_id(int play_id) {
		this.play_id = play_id;
	}
	public int getUsert_id() {
		return usert_id;
	}
	public void setUsert_id(int usert_id) {
		this.usert_id = usert_id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Play getPlay() {
		return play;
	}
	public void setPlay(Play play) {
		this.play = play;
	}
	public production getProduction() {
		return production;
	}
	public void setProduction(production production) {
		this.production = production;
	}

	
}
