package gamerCom;

import gamerCom.Concrete.CampaignManager;
import gamerCom.Concrete.GameManager;
import gamerCom.Concrete.GamerCheckManager;
import gamerCom.Concrete.GamerManager;
import gamerCom.Concrete.SaleManager;
import gamerCom.Entity.Campaign;
import gamerCom.Entity.Game;
import gamerCom.Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();

		Gamer gamer = new Gamer(1, "Ebru", "Terzioğlu", "ebru@ebru.com", "12345678925", 1997);
		Game game = new Game(1, 400, "GTA");
		Campaign campaign = new Campaign(1, "Yılbaşı indirimi", 10);
		
		System.out.println("------------------- Gamer Crud Operasyonları -------------------");
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println();
		System.out.println("------------------- Game Crud Operasyonları -------------------");
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		System.out.println();
		System.out.println("------------------- Campaign Crud Operasyonları -------------------");
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		System.out.println();
		System.out.println("------------------- Satış işlemi -------------------");
		saleManager.sell(gamer,game,campaign);
	}

}
