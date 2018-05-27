package Items;

import Exceptions.StockException;
/**
 * 
 * @author Callum Miller
 *
 */
public class Item extends Items {

	public Item(String name, int manufatoringCost, int sellPrice, int reOrderPoint, int reOrderAmount, String storeTemp,
			int stock) throws StockException {
		super(name, manufatoringCost, sellPrice, reOrderPoint, reOrderAmount, storeTemp, stock);

	}

}
