package vote.dao;

import vote.entity.Game;

public interface GameDao {
	
  int insertgame(Game game);
  
  int delgame(String gamename);
  
  int updategame(Game game);
}
