package com.tutorialspoint.entity;
import javax.persistence.Entity;
import javax.persistence.Column;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
@NamedQuery(query = "Select e from employee e where e.id = :id", name = "find employee by id")
public class employee {
   @Id
   @GeneratedValue
   @Column(name = "id")
   private int id;
   private String name;
   private String manager;
   public employee() {
	      super();
	   }
   public employee(int eid, String ename, String manager) {
      super( );
      this.id = eid;
      this.name = ename;
      this.manager = manager;
      
   }
   
   

   public int getId( ) {
      return id;
   }
   
   public void setId(int id) {
      this.id = id;
   }

   public String getName( ) {
      return name;
   }
   
   public void setName(String ename) {
      this.name =ename;
   }

   public void setManager(String manager)
   {this.manager=manager;}
   public String getManager(){return manager;}
   
   @Override
   public String toString() {
      return "employee [eid=" + id + ", ename=" + name + ", manager=" + manager+ "]";
   }
}