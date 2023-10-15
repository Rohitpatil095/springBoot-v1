package com.db.day03;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.db.day03.entity.Renting;

@SpringBootApplication
public class Day03DbHibApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Day03DbHibApplication.class, args);
		
		UserRepository repo=(UserRepository) context.getBean(UserRepository.class);
		
// Section -01
		
	// CRUD OPERATIONS
//		c=create
//		Renting r1= new Renting("tathewadi","semi furnished,family",1000);
//		repo.save(r1);		
		
//		r= read
//		Iterable<Renting> ren=repo.findAll();
//		Iterator<Renting> itr= ren.iterator();
//		
//		while(itr.hasNext())
//		{
//			Renting re=itr.next();
//			System.out.println(re.getLocation() + "--" + re.getFeatures() + "---" +re.getRent());
//		}
//		
//		u=update
//		Optional<Renting> opt=repo.findById(104);
//		Renting us= opt.get();
//		System.out.println(us);
//		if(opt.isPresent())
//		{
//			System.out.println(opt);
//		}
//		else
//		{
//			System.out.println("No record found...");
//		}
		
//		d=delete
//		repo.deleteById(104);
		
		
// Section-02 
		
//		Renting r1= new Renting("baner","fully furnished, levish society",20000);
//		repo.save(r1);
//		
//		Renting r2= new Renting("aundh","semi furnised, gym",12000);
//		Renting r3= new Renting("hinjwadi","rk, no faciliies",15000);
//		repo.saveAll(List.of(r2,r3));
		
//		List<Renting> op= repo.getHousesUsingJPQL();
//		op.forEach((o)->{System.out.println(o.getLocation() + "--" + o.getFeatures() + "---" +o.getRent());});
//		

//		List<Renting> op= repo.getHouseUsingNativeJPQL();
//		op.forEach((o)->{System.out.println(o.getLocation() + "--" + o.getFeatures() + "---" +o.getRent());});

//		List<Renting> op= repo.getHouseUsingNativeJPQLWhere("Hinjwadi");
//		op.forEach((o)->{System.out.println(o.getLocation() + "--" + o.getFeatures() + "---" +o.getRent());});
		

// ------ NOT WORKING ----------
		
//		List<Renting> op= repo.updateRentAmount(18000,15000);
//		System.out.println("Update records are...");
//		op.forEach((o)->{System.out.println(o.getLocation() + "--" + o.getFeatures() + "---" +o.getRent());});
		
		
	}

}
