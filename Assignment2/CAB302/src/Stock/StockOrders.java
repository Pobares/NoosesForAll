package Stock;

import Items.ItemManifest;
import Store.SuperMart;


/**
 * A Class that takes the array that store all data from the .csv file and determines which items are required to be restocked 
 * and how is needed to be purchased and it cost.
 * 
 * 
 * @author Callum Miller
 *
 */
public class StockOrders {

	public static double[] stockOrder(){
		int reOrderAmount;
		int costPerItem;
		int totalCost;
		double[] data = new double[ItemManifest.Items.size()];
		
		for(int i = 0; i < ItemManifest.Items.size(); i++) {
			
			if(ItemManifest.Items.get(i).getReOrderPoint() > ItemManifest.Items.get(i).getStock()){
				reOrderAmount = ItemManifest.Items.get(i).getReOrderAmount();
				costPerItem = ItemManifest.Items.get(i).getManufatoringCost();
				totalCost = reOrderAmount * costPerItem;
				data[i] = totalCost;
				
				
			}
		
		}
		
		
		return data;

		
	}


}


