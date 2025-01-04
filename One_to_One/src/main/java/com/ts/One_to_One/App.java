package com.ts.One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Man.class)
    			.addAnnotatedClass(Biomatric.class);
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session session=sf.openSession();
        session.beginTransaction();
        
        Man m=new Man();
        m.setAddress("Pune");
        m.setAge(27);
        m.setName("I Am Human");
        
        
        Biomatric b=new Biomatric();
        b.setBone(365);
        b.setFingerprint("Unique to ALl");
        b.setLife(100);
        
        m.setBio(b);
       
        session.persist(m);
        session.persist(b);
        
        session.getTransaction().commit();
        session.close();
    }
}
