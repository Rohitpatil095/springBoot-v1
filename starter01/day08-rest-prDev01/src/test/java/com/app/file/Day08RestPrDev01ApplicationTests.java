package com.app.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.file.entity.Customer;
import com.app.file.repository.CustomerRepository;

@SpringBootTest
class Day08RestPrDev01ApplicationTests {

	@Autowired
	CustomerRepository repo;
	
	Customer cust= new Customer();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void getUsers()
	{
		Iterable<Customer> data= repo.findAll();
		
//		List<Customer> testData=new ArrayList()<Customer>() {
//			List.of(
//				new Customer("rop","rop@gmail.com");
//				)
//		}; 
//		
		for(Customer cus: data)
		{
			System.out.println("id->"+ cus.getId()+ " name->"+ cus.getName()+" email"+ cus.getEmail());
		}
//		assert.
	}
	

	@Test
	public void addUser()
	{
		Customer a=new Customer("some","somenew@gmail.com");
		repo.save(a);
	}

//	@Test
//	public void updateUser()
//	{
//		Optional<Customer> cus=repo.findById(2);
//		cus.setEmail("updated@gmail.com");
//		repo.save(cus);
//	}
	
	@Test
	public void deleteUser()
	{
		repo.deleteById(3);
	}
	

}
