package GUI;

import Store.SuperMart;

public class ConvertToArray {
	
	public Object[][] Items(){
		
		Object[][] AllItems = new Object[SuperMart.Items.size()][];
		for(int i = 0; i < SuperMart.Items.size(); i++) {
			Object [] Object = {SuperMart.Items.get(i).getName(), SuperMart.Items.get(i).getManufatoringCost(), SuperMart.Items.get(i).getSellPrice(),
					SuperMart.Items.get(i).getReOrderPoint(), SuperMart.Items.get(i).getReOrderAmount(), SuperMart.Items.get(i).getStoreTemp(), SuperMart.Items.get(i).getStock()};
			
			AllItems[i] = Object;
		}
		
		return AllItems;
		
	}

	
	
}

