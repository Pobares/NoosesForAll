package Main;

import java.io.IOException;

import Exceptions.CSVFormatException;
import Exceptions.DeliveryException;
import Exceptions.StockException;
import Items.CSVReader;
import Stock.TruckCargo;

public class Main {

	public static void main(String[] args) throws NumberFormatException, CSVFormatException, StockException, IOException, DeliveryException {
		CSVReader.csvReader();
		TruckCargo.truckCargo();
	}

}
