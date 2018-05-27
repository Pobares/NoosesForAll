package Delivery;

import Exceptions.DeliveryException;

/**
 * 
 * @author Callum Miller
 *
 */
public class Ordinary extends Trucks {

	public Ordinary(String name, int cargoCapicty, int cargoAmount, double price, String cargoType, String storeTemp) throws DeliveryException {
		super(name, cargoCapicty, cargoAmount, price, cargoType, storeTemp);
		
	}

}
