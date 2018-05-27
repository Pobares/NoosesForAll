package Exceptions;
/**
 * A class that represents exceptions related to the file format.
 * @author Callum Miller
 *
 */
@SuppressWarnings("serial")
public class CSVFormatException extends Exception {
	
	/**
	 * Produces a CSVFormatException
	 */
	public CSVFormatException(){
		
	}
	
	/**
	 * Produces a CSVFormatException with the specified message
	 * @param message - The exception's message
	 */
	public CSVFormatException(String message) {
		super(message);
	}	

	/**
	 * Produces a CSVFormatException with the specified cause
	 * @param cause - The exception's cause
	 */
	public CSVFormatException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * Produces a CSVFormatException with the specified message and cause
	 * @param cause - The exception's cause
 	 * @param message - The exception's message
	 */
	public CSVFormatException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	/**
	 * Produces a CSVFormatException with the specified message, cause and flags to enable suppression and make the stack trace writable
	 * @param cause - The exception's cause
 	 * @param message - The exception's message
 	 * @param enableSuppression - A flag to indicate if suppression should be enabled or disabled
 	 * @param writableStackTrace - A flag to indicate if the stacktrace should be writable or not
	 */
	public CSVFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
