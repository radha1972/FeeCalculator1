package org.radha.hibernate;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.transform.AliasToBeanResultTransformer;
import java.util.Iterator;

public class EventDao {
	public List processEvent(){
		
		HibernateUtil util=new HibernateUtil();
	
	SessionFactory sf=	util.getSessionFactory();
	Session s=sf.openSession();
	SQLQuery query=s.createSQLQuery("select * from Event");
	Transaction t=s.beginTransaction();
	t.begin();
	t.commit();
	
List list=	query.setResultTransformer( new AliasToBeanResultTransformer(Event.class) )
    .list();


     Iterator itr=list.iterator();
     while(itr.hasNext())
     {
    	 Event e=(Event)itr.next();
    	 System.out.println("id is"+e.id);
    	 System.out.println("name is "+e.name);
    	 System.out.println("location is "+e.location);
    	 
    	 
    	 
     }
     
	 return list;
	 
	 
	 
		
	}

}
