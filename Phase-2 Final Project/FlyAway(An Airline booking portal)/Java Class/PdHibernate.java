package com;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import com.PersonalDetails;

	public class PdHibernate {
		
		
		public static void result(PersonalDetails p)
         {
             StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			
			Metadata m=new MetadataSources(s).getMetadataBuilder().build();
			
			SessionFactory factory=m.getSessionFactoryBuilder().build();
			
			Session session=factory.openSession();
			
			Transaction t=session.beginTransaction();
			
			session.save(p);
			
			t.commit();

			session.close();
		}

}
