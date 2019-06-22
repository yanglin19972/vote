package vote.dao;

import java.util.List;


import vote.entity.Play;
import vote.entity.Player;
import vote.entity.production;
import vote.entity.show;

public interface PlayerDao {

  List<Player>findplayer();
  
  List<Play>findplay();
  
  List<show>findpk();
	
  int insertgame(Play game);
  
  int insertproduction(production production);
  
  int delgame(String gamename);
  
  int updategame(Play game);
}
