package gamerCom.Abstract;

import gamerCom.Entity.Campaign;
import gamerCom.Entity.Game;
import gamerCom.Entity.Gamer;

public interface SaleService {
	void sell(Gamer gamer, Game game, Campaign campaign);
}
