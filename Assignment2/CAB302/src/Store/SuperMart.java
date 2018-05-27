package Store;

import java.util.ArrayList;

import Delivery.Manifest;
import Delivery.Trucks;
import Exceptions.CSVFormatException;
import Exceptions.DeliveryException;
import Exceptions.StockException;
import Items.CSVReader;
import Items.Items;
import Stock.SalesLogs;
import Stock.StockOrders;

/**
 * 
 * @author Callum Miller and Dylan Vardanega
 *
 */
public class SuperMart {

	
	public static ArrayList<Items> Items;

	public SuperMart() {
		
		Items = new ArrayList<Items>();
				
		
	}

	public static boolean processLog(String filename) throws CSVFormatException, DeliveryException, StockException {
		try {
			Items = CSVReader.PopulateItems(filename);
			return true;
		} catch (StockException se) {
			throw new StockException(se.getMessage());
		} catch (CSVFormatException csve) {
			throw new CSVFormatException(csve.getMessage());
		}
	}
	
	public Items getItemByIndex(int index) throws StockException {
		if (index < 0 || index >= Items.size()) {
			throw new StockException("Invalid index.");
		}
		return Items.get(index);
	}
	public Trucks getTruckByIndex(int index) throws DeliveryException {
		if (index < 0 || index >= Items.size()) {
			throw new DeliveryException("Invalid index.");
		}
		return Manifest.Trucks.get(index);
	}
	
	public int getNumTrucks() {
		return Manifest.Trucks.size();
	}
	
	public double getTotalCost() {
		double [] costs;
		double cost = 0;
		costs = StockOrders.stockOrder();
		for(double i : costs) {
			cost += i;
		}
		return cost;		
	}
	
	public double getTotalIncome() {
		double [] costs;
		double cost = 0;
		costs = SalesLogs.salesLog();
		for(double i : costs) {
			cost += i;
		}
		return cost;		
	}
	

}
