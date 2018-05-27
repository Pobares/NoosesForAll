package Delivery;
import Exceptions.DeliveryException;
/**
 * An Abstacrt class used to that represents the trucks used to transport deliveries to Super Mart
 * The Trucks Class is used as a base class for the RefrigeratedTrucks and OrdinaryTrucks.
 * 
 * @author Callum Miller
 *
 */

public abstract class Trucks 
{	
	
	String name;
	int cargoCapicty;
	int cargoAmount;
	double price;
	String cargoType;
	String storeTemp;
	

	
	public Trucks(String name, int cargoCapicty, int cargoAmount, double price, String cargoType, String storeTemp)
	throws DeliveryException{
		
		this.name = name;
		this.cargoCapicty = cargoCapicty;
		this.cargoAmount = cargoAmount;
		this.price = price;
		this.cargoType = cargoType;
		this.storeTemp = storeTemp;


	}	

	public final String getName(){
		return name;
	}
	
	public final int getCargoCapicty(){
		return cargoCapicty;
	}
	
	public final int getCargoAmount(){
		return cargoAmount;
	}
	
	public final double getPrice(){
		return price;
	}
	
	public final String getCargoType(){
		return cargoType;
	}
	
	public final String getStoreTemp() {
		return storeTemp;
	}
	
}
