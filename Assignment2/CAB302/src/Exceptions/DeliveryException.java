package Exceptions;
	/**
	 * A class that represents exceptions related to the delivery.
	 * @author Callum Miller
	 *
	 */
	@SuppressWarnings("serial")
	public class DeliveryException extends Exception {
		
		/**
		 * Produces a DeliveryException
		 */
		public DeliveryException(){
			
		}
		
		/**
		 * Produces a DeliveryException with the specified message
		 * @param message - The exception's message
		 */
		public DeliveryException(String message) {
			super(message);
		}	

		/**
		 * Produces a DeliveryException with the specified cause
		 * @param cause - The exception's cause
		 */
		public DeliveryException(Throwable cause) {
			super(cause);
		}
		
		/**
		 * Produces a DeliveryException with the specified message and cause
		 * @param cause - The exception's cause
	 	 * @param message - The exception's message
		 */
		public DeliveryException(String message, Throwable cause) {
			super(message, cause);
			
		}
		
		/**
		 * Produces a DeliveryException with the specified message, cause and flags to enable suppression and make the stack trace writable
		 * @param cause - The exception's cause
	 	 * @param message - The exception's message
	 	 * @param enableSuppression - A flag to indicate if suppression should be enabled or disabled
	 	 * @param writableStackTrace - A flag to indicate if the stacktrace should be writable or not
		 */
		public DeliveryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}

	}
