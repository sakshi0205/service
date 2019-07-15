package services;

import java.util.HashMap;

import dao.PlayerDao;
import dao.PlayerDaoImpl;
import bean.Player;

public class PlayerServiceImpl implements PlayerService{
          PlayerDao player1=new PlayerDaoImpl();
	@Override
	public void putPlayer(String countryName, Player player) {
		// TODO Auto-generated method stub
		player1.putPlayer(countryName, player);
	}

	@Override
	public HashMap<String, Player> getPlayer() {
		// TODO Auto-generated method stub
		return player1.getPlayer();
	}

	@Override
	public void updatePlayer(String countryName, String playerName) {
		// TODO Auto-generated method stub
		player1.updatePlayer(countryName, playerName);
	}

	@Override
	public void deletePlayer(String countryName) {
		// TODO Auto-generated method stub
		player1.deletePlayer(countryName);
	}

}
