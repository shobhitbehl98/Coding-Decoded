package ISPCompliant.AdaptorPattern;

import java.util.ArrayList;
import java.util.List;

class WelcomeToPunjab implements IMenu {

	@Override
	public List<FOODITEMS> getVegetrainianItems() {
		List<FOODITEMS> vegFood = new ArrayList<>();
		vegFood.add(FOODITEMS.DAL_MAKNI);
		vegFood.add(FOODITEMS.PANEER_PASANDA);
		return vegFood;
	}

	@Override
	public List<FOODITEMS> getNonVegetrainianItems() {
		List<FOODITEMS> nonVegFood = new ArrayList<>();
		nonVegFood.add(FOODITEMS.BUTTER_CHICKEN);
		nonVegFood.add(FOODITEMS.PRAWNS);
		return nonVegFood;
	}
}
