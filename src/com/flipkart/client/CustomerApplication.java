package com.flipkart.client;
import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerBusiness;
public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is the entry point of the services
		//create an instance of the  customer service and lookup in 	
		
		
		CustomerBusiness business = new CustomerBusiness();
		business.createCustomer();
		System.out.println("Delete Customer"+business.deleteCustomer(101));
		System.out.println("update Customer"+business.updateCustomer(101));
business.listCustomer(101);
	
	
	}

}
