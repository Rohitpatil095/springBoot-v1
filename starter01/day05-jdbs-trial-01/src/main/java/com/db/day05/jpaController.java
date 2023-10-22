package com.db.day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jpaController {
	
	@Autowired
	JdbcTemplate jt;
	
	String query="create table demo(id int, name varchar(20))";
	public void getData()
	{
		jt.execute(query);
	}
}
