package vote.dao;

import java.util.List;

import vote.entity.Play;

public interface PlayDao {
	List<Play> getPlays();
	int delPlay(int id);
	int addPlay(Play play);
}
