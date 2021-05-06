package gamerCom.Concrete;

import gamerCom.Abstract.GamerCheckService;
import gamerCom.Abstract.GamerService;
import gamerCom.Entity.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerService;

	public GamerManager(GamerCheckService gamerService) {
		this.gamerService = gamerService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerService.checkIfRealPerson(gamer))
		{
			System.out.println("Kullan�c� sisteme kaydedildi : " + gamer.getFirstName());
		}
		else {
			System.out.println("Sisteme kay�t olabilmeniz i�in 18 ya��ndan b�y�k olman�z gerekmektedir");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� bilgileri silindi : " + gamer.getFirstName());
		
	}

}
