package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

import static  combinatorpattern.CustomerRegistrationValidator.isEmailValid;
 import static  combinatorpattern.CustomerRegistrationValidator.isAnAdult;
 import static  combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;



public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer(
				"Allie",
				"allie@gmail.com",
				"+01233434",
				LocalDate.of(2000, 1, 1));
		
		
		//System.out.println(new CustomerValidatorService().isValid(customer));
		
		ValidationResult result = isEmailValid()
		.and(isPhoneNumberValid())
		.and(isAnAdult())
		.apply(customer);
		
		System.out.println(result);
		
		
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		
		
		
	}

}
