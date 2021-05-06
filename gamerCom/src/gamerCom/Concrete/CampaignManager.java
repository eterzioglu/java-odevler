package gamerCom.Concrete;

import gamerCom.Abstract.CampaignService;
import gamerCom.Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi : " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi : " + campaign.getName());
	}
}
