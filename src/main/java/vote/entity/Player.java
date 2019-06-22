package vote.entity;



public class Player {
     private int player_id;
   
	private String playername;
     private String playerpic;
     private String tel;
     private String sex;
    
     public int getPlayer_id() {
 		return player_id;
 	}
 	public void setPlayer_id(int player_id) {
 		this.player_id = player_id;
 	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayerpic() {
		return playerpic;
	}
	public void setPlayerpic(String playerpic) {
		this.playerpic = playerpic;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
     
}
