package Items;
/**
 * 
 * @author Callum Miller
 *
 */

import Exceptions.StockException;
public abstract class Items {
	
	String name;
	int manufatoringCost;
	int sellPrice;
	int reOrderPoint;
	int reOrderAmount;
	String storeTemp;
	int stock;
	
	public Items(String name, int manufatoringCost, int sellPrice, int reOrderPoint, int reOrderAmount, String storeTemp, int stock ) 
	throws StockException{
		
		this.name = name;
		this.manufatoringCost = manufatoringCost;
		this.sellPrice = sellPrice;
		this.reOrderPoint = reOrderPoint;
		this.reOrderAmount = reOrderAmount;
		this.storeTemp = storeTemp;
		this.stock = stock;
		
	}
	public final String getName(){
		return name;
	}
	
	public final int getManufatoringCost(){
		return manufatoringCost;
	}
	
	public final int getSellPrice(){
		return sellPrice;
	}
	
	public final int getReOrderPoint(){
		return reOrderPoint;
	}
	
	
	public final int getReOrderAmount(){
		return reOrderAmount;
	}
		
	
	public final String getStoreTemp(){
		return storeTemp;
	}
	
	public final int getStock(){
		return stock;
	}
	
	
}
