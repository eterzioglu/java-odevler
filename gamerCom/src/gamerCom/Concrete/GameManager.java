package gamerCom.Concrete;

import gamerCom.Abstract.GameService;
import gamerCom.Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme eklendi : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun sistemden silindi : " + game.getName());
	}

}
