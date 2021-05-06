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
			System.out.println("Kullanýcý sisteme kaydedildi : " + gamer.getFirstName());
		}
		else {
			System.out.println("Sisteme kayýt olabilmeniz için 18 yaþýndan büyük olmanýz gerekmektedir");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý bilgileri güncellendi : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý bilgileri silindi : " + gamer.getFirstName());
		
	}

}
