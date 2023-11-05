package com.spring.app.repo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
	
	@Autowired
	private DataSource dataSrc;
	
	@EventListener(ApplicationReadyEvent.class)
	public void loadSqlData()
	{
		ResourceDatabasePopulator res= new ResourceDatabasePopulator(false,false, "UTF-8");
		res.addScripts(new ClassPathResource("studentDataImport.sql"), new ClassPathResource("departmentDataImport.sql"));
		res.execute(dataSrc);
	}
}
