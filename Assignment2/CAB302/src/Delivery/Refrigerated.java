package Delivery;

import Exceptions.DeliveryException;

/**
 * 
 * @author Callum Miller
 *
 */
public class Refrigerated extends Trucks {

	public Refrigerated(String name, int cargoCapicty, int cargoAmount, double price, String cargoType, String storeTemp) throws DeliveryException {
		super(name, cargoCapicty, cargoAmount, price, cargoType, storeTemp);
		
	}

}
