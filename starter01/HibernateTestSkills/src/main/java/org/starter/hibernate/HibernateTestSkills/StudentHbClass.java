package org.starter.hibernate.HibernateTestSkills;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentHbClass {

	public static void main() throws Exception{
		Configuration cfg= new Configuration();

		System.out.println(cfg.configure("hibernate.cfg.xml").buildSessionFactory());
		
	}
}
