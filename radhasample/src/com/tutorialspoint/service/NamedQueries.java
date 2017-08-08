package com.tutorialspoint.service;
import java.util.List;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.tutorialspoint.entity.employee;
import javax.persistence.PersistenceContext;
@PersistenceContext(unitName = "radhasample")
public class NamedQueries {
   public static void main( String[ ] args ) {
	   

try{

Class c = Class.forName("org.hibernate.ejb.HibernatePersistence");
   System.out.println("radha");
	EntityManagerFactory   factory = Persistence.createEntityManagerFactory("radhasample");
	   EntityManager em = factory.createEntityManager();
	   System.out.println( "Created factory for  from persistence.xml");
       EntityManager manager = factory.createEntityManager();
       System.out.println( "Created entity manager from the factory" );
      Query query = em.createNamedQuery("find employee by id");
      
      query.setParameter("id", 2);
      List<employee> list = query.getResultList( );
      
      for( employee e:list ){
         System.out.print("Employee ID :" + e.getId( ));
         System.out.println("\t Employee Name :" + e.getName( ));
      }
}
catch  (ClassNotFoundException e)
{}
   }

}