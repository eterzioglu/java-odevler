package gamerCom.Concrete;

import gamerCom.Abstract.GamerCheckService;
import gamerCom.Entity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if (gamer.getYearOfBirth() <= 2003) {
			return true;
		} else {
			return false;
		}

	}

}
