package ISPViolated;

import java.util.ArrayList;
import java.util.List;

public class TasteOfIndia implements IMenu {

	@Override
	public List<FOODITEMS> getVegetrainianItems() {
		List<FOODITEMS> vegFood = new ArrayList<>();
		vegFood.add(FOODITEMS.DAL_MAKNI);
		vegFood.add(FOODITEMS.PANEER_PASANDA);
		return vegFood;
	}

	@Override
	public List<FOODITEMS> getNonVegetrainianItems() {
		return null;
	}

}
