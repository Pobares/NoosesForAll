package Stock;


import java.util.Arrays;

import Delivery.Manifest;
import Delivery.Ordinary;
import Delivery.Refrigerated;
import Delivery.Trucks;
import Exceptions.DeliveryException;
import Items.ItemManifest;
import Store.SuperMart;

/**
 * A Class to calculate the amount of trucks and their cost to deliver the items to supermart
 * 
 * @author Callum Miller
 *
 */
public class TruckCargo {


	public static void truckCargo() throws DeliveryException{
		
		int countDryGoods= 0;
		int countColdGoods= 0;
		String[] data;
		double[]orderedItems = StockOrders.stockOrder();
		String[][]DryGoodsOrdered;
		String[][]ColdGoodsOrdered;

		
		
		for(int i = 0; i < orderedItems.length; i++) {
			
			try {
				Integer.parseInt(ItemManifest.Items.get(i).getStoreTemp());
				countColdGoods++;
			}catch(Exception e) {
				countDryGoods++;	
			}
		}
		
		DryGoodsOrdered = new String[countDryGoods][];
		ColdGoodsOrdered = new String[countColdGoods][];
		int count = 0;
		int count2 =0;
		for(int i = 0; i < orderedItems.length; i++) {
			try {
				Integer.parseInt(ItemManifest.Items.get(i).getStoreTemp());
				data = new String[] {ItemManifest.Items.get(i).getName(), String.valueOf(ItemManifest.Items.get(i).getReOrderAmount()),
						ItemManifest.Items.get(i).getStoreTemp() };				
				ColdGoodsOrdered[count] = data;
				count++;
			}catch(Exception e) {
				data = new String[] {ItemManifest.Items.get(i).getName(), String.valueOf(ItemManifest.Items.get(i).getReOrderAmount())};
				
				DryGoodsOrdered[count2]= data;
				count2++;
			}
			
		}

		// TruckCargo[[TruckType, CargoTotal, Price], [TruckType, CargoTotal, Price]];
		
		int cargoSum = 0;
		int cargoVal = 0;
		double price = 0;

		int check = 0;
		for(int i = 0; i < DryGoodsOrdered.length; i++) {
			
			check += Integer.parseInt(DryGoodsOrdered[i][1]);

			if(cargoSum < 1000 && check < 1000 ) {
				cargoSum += Integer.parseInt(DryGoodsOrdered[i][1]);
			}else {
				
				price = 750 + (0.25 * cargoVal);
				price = Math.round(price);
				Trucks Ordinary = new Ordinary("Ordinary", 1000, cargoVal , price, "dry good", "");
				Manifest.truckManifest(Ordinary);
				cargoSum = Integer.parseInt(DryGoodsOrdered[i][1]);
				check = Integer.parseInt(DryGoodsOrdered[i][1]);
				
				
			}
			cargoVal = cargoSum;
			
		}
		cargoSum = 0;
		cargoVal = 0;
		price = 0;
		check = 0;
		int temp = 30;
		for(int i = 0; i < ColdGoodsOrdered.length; i++) {
			
			check += Integer.parseInt(ColdGoodsOrdered[i][1]);

			if(cargoSum < 850 && check < 850 ) {
				cargoSum += Integer.parseInt(ColdGoodsOrdered[i][1]);
			}else {
				
				price = 900 + (200 * Math.pow(0.7, temp/5));
				price = Math.round(price);
				Trucks Ordinary = new Refrigerated("Refrigerated", 850, cargoVal , price, "refrigerated good", String.valueOf(temp));
				Manifest.truckManifest(Ordinary);
				
				cargoSum = Integer.parseInt(ColdGoodsOrdered[i][1]);
				check = Integer.parseInt(ColdGoodsOrdered[i][1]);
				
			}
			 if(temp > Integer.parseInt(ColdGoodsOrdered[i][2])){
				 temp = Integer.parseInt(ColdGoodsOrdered[i][2]);
			 }
			cargoVal = cargoSum;
			
			
			
		}
		
		            }
	
	}

