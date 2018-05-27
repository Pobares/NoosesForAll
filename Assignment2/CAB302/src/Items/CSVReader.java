package Items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Exceptions.StockException;
import Exceptions.CSVFormatException;
/**
 * This class user imported method to allow for the reading of a .csv file and conveys the it into a deep array
 * 
 * @Author Callum Miller
 */
public class CSVReader {
public static String[][] AllItems = new String[100][7];
static BufferedReader bufferedReader;
public static final String COMMA = ",";
/**
 * 
 * @param AllItems 
 * 				-A deep array that is used to store all of the items extracted from the .csv file separately 
 *
 * @param count 
 * 					-A integer variable used to determine where in the array the array is put in
 *
 *@param data 
 *				- An array used to hold the converted data from the .csv file
 *
 *@param line 
 *			- A String used to hold the extracted data from the .csv file and to make sure if has all required information for the GUI
 *
 *@param br 
 *			- A Buffered Reader used to read the .csv file
 * @throws StockException 
 * @throws NumberFormatException 
 * @throws IOException 
 *				  
 * 
 */
	
	public static void csvReader() throws CSVFormatException, NumberFormatException, StockException, IOException {

		
		String[] data;
		
		 BufferedReader br = new BufferedReader(new FileReader("item_properties.csv"));
			while(true) {
				
				String line =br.readLine();
				if (line == null) {
					break;
				}
				if(line.split(",").length < 6) {
					line += "dry good";
				}
				if(line.split(",").length < 7) {
					line += ",0";
				}
				
				data = line.split(",");
				Items item = new Item(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), 
						Integer.parseInt(data[4]), data[5], Integer.parseInt(data[6]));
				ItemManifest.itemManifest(item);
				
				System.out.println(Arrays.toString(data));

				
			}
			br.close();
					
				
	}
public static ArrayList<Items> PopulateItems(String filename) throws CSVFormatException, StockException {
	ArrayList<Items> ItemsList;

	try {
		ItemsList = new ArrayList<Items>();
		bufferedReader = new BufferedReader(new FileReader(filename));
		String line = bufferedReader.readLine();
		while (line != null) {
			if(line.split(",").length < 6) {
				line += "dry good";
				}
			if(line.split(",").length < 7) {
				line += ",0";
				}
			String []data = line.split(",");
			Items item = new Item(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), 
					Integer.parseInt(data[4]), data[5], Integer.parseInt(data[6]));
			ItemsList.add(item);
			line = bufferedReader.readLine();
			}
		bufferedReader.close();
		return ItemsList;
		} catch (StockException se) {
			throw new StockException(se.getMessage());
			} catch (Exception csve) {
				throw new CSVFormatException(csve.getMessage());
				}
	
}


}
