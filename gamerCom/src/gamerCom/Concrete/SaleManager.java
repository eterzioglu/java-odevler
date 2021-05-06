package gamerCom.Concrete;

import gamerCom.Abstract.SaleService;
import gamerCom.Entity.Campaign;
import gamerCom.Entity.Game;
import gamerCom.Entity.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " adl� oyuna " + campaign.getName() + " adl� kampanya uygulanm��t�r.");

		game.setPrice(game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100));
		System.out.println("Oyunun indirimli fiyat� : " + game.getPrice());

		System.out.println(game.getName() + " adl� oyun " + game.getPrice() + " fiyat� ile " + gamer.getFirstName()
				+ " kullan�c�ya sat�lm��t�r.");
	}

}
