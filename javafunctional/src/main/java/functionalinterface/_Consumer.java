package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class _Consumer {
	
	public static void main(String[] args) {
		
		Customer jacko = new Customer("Jacko","9999");
		
		System.out.println("imperative");
		
		greetings(jacko);
		
		System.out.println("declarative");

		greetCustomer.accept(jacko);
		
		System.out.println("declarative - biconsumer");
				
		greetCustomerBi.accept(jacko, true);
		
	}
	
	static Consumer<Customer> greetCustomer = customer -> System.out.println("Welcome " + customer.customerName + " to the store and"
			+ " your phone no is: " + customer.customerPhoneno);
	
	static BiConsumer<Customer,Boolean> greetCustomerBi = (customer,value) -> System.out.println("Welcome " + customer.customerName + " to the store and"
			+ " your phone no is: " + (value ? customer.customerPhoneno : "*********") );
	
	static void greetings(Customer customer) {
		System.out.println("Welcome " + customer.customerName + " to the store and"
				+ " your phone no is: " + customer.customerPhoneno);
	}
	
	
	
	static class Customer{
		
		private String customerName;
		private String customerPhoneno;
		public Customer(String customerName, String customerPhoneno) {
			this.customerName = customerName;
			this.customerPhoneno = customerPhoneno;
		}
		
		
		
	}

}



