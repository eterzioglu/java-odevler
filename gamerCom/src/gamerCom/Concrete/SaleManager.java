package gamerCom.Concrete;

import gamerCom.Abstract.SaleService;
import gamerCom.Entity.Campaign;
import gamerCom.Entity.Game;
import gamerCom.Entity.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " adlý oyuna " + campaign.getName() + " adlý kampanya uygulanmýþtýr.");

		game.setPrice(game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100));
		System.out.println("Oyunun indirimli fiyatý : " + game.getPrice());

		System.out.println(game.getName() + " adlý oyun " + game.getPrice() + " fiyatý ile " + gamer.getFirstName()
				+ " kullanýcýya satýlmýþtýr.");
	}

}
