package com.spring.app.data.sql;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

public class DataInitializer {
	
	@Autowired
	DataSource dataSrc;
	
	@EventListener(ApplicationReadyEvent.class)
	public void populateVendorData()
	{
		ResourceDatabasePopulator rdp= new ResourceDatabasePopulator(false, false, "UTF-8");
		rdp.addScripts(new ClassPathResource("/vendorData.sql"));
		rdp.execute(dataSrc);
	}

}
