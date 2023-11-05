package com.spring.app.data.sql;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

public class dataInitializer {

	@Autowired
	DataSource dataSrc;
	
	@EventListener(ApplicationReadyEvent.class)
	public void addDataInTable()
	{
		ResourceDatabasePopulator res=new ResourceDatabasePopulator(false, false, "UTF-8");
		res.addScripts(new ClassPathResource("/locationsData.sql"));
		res.execute(dataSrc);
	}

}
