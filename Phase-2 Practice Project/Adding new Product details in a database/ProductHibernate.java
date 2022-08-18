package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProductHibernate {
	
	public static int store(Product p)
	{
		int res=0;
		
		StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata m=new MetadataSources(s).getMetadataBuilder().build();
		
		SessionFactory factory=m.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		res=(Integer)session.save(p);
		
		t.commit();

		session.close();
		
		return res;
	}

}
