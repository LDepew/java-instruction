package business;

import java.io.IOException;

public class NoSuchCustomerException extends Exception {
	public NoSuchCustomerException() {}
	
	public NoSuchCustomerException(String message) {
		super(message);
	}

	public static Customer getCustomer(String customerCode) throws NoSuchCustomerException {
		try {
			Customer c = getCustomer(customerCode);
			return c;
		} catch (NoSuchCustomerException e) {
			throw new NoSuchCustomerException(
					"No Customer Found for number: "+ customerCode);
			
	}
	

	}
}
