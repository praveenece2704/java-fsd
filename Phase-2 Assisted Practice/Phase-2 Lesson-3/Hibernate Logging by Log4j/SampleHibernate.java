package com.jcg.hibernate.log4j;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SampleHibernate
{
	static Logger logger = Logger.getLogger(Sample.class);
	public static void main(String[] args)
	{
		Configuration con= new Configuration().configure().addAnnotatedClass(Sample.class);
			
		ServiceRegistry ser=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory ses= con.buildSessionFactory(ser);
		
		Session session= ses.openSession();
		
		Transaction t=session.beginTransaction();
		
		Sample p=new Sample();
		p.setAvailablecount(3);
		p.setCategoryid(22);
		p.setProductid(61);
		p.setSupplierid(21);
		p.setProductname("mobile");
		p.setProductprice(18972);
		
		int y=(Integer)session.save(p);
		
		t.commit();
		if(y>1)
		{
			logger.info("success");
		}
		session.close();
	}
	
	
	
}