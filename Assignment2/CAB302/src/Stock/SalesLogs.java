package Stock;

import Store.SuperMart;
/**
 * 
 * @author Callum Miller
 *
 */
public class SalesLogs {
	
	public static double[] salesLog(){
		int reOrderAmount;
		int sellPrice;
		int totalCost;
		double[] data = new double[SuperMart.Items.size()];
		
		for(int i = 0; i < SuperMart.Items.size(); i++) {
	
				reOrderAmount = SuperMart.Items.get(i).getReOrderAmount();
				sellPrice = SuperMart.Items.get(i).getSellPrice();
				totalCost = reOrderAmount * sellPrice;
				data[i] = totalCost;
				
				
			}
		
		return data;

		
	}

}
