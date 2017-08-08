package com.radha;
import java.util.Iterator;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.AliasToBeanResultTransformer;



public class EventDao {
public List processEvent(){
		
		HibernateUtil util=new HibernateUtil();
	
	SessionFactory sf=	util.getSessionFactory();
	Session s=sf.openSession();
	
	SQLQuery query=s.createSQLQuery("select * from Event1");
	//Transaction t=s.beginTransaction();
	//t.begin();
	//t.commit();
	
List list=	query.setResultTransformer( new AliasToBeanResultTransformer(Event.class) )
    .list();


     Iterator itr=list.iterator();
     while(itr.hasNext())
     {
    	 Event e=(Event)itr.next();
    	 System.out.println("id is"+e.EventId);
    	 System.out.println("name is "+e.EventName);
    	 
    	 
    	 
    	 
     }
     
	 return list;
	 
	 
	 
		
	}


}
