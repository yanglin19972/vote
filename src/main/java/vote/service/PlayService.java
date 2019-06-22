package vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.dao.PlayDao;
import vote.entity.Play;

@Service
public class PlayService {
	@Autowired
	private PlayDao playDao;
	public List<Play> getPlays() {
		return playDao.getPlays();
	}
	
	public int delPlay(int id) {
		return playDao.delPlay(id);
	}
}
