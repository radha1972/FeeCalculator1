package com.radha;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import com.radha.Contact;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class AddServiceimpl implements AddServiceDao{
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		}
	public void add(int id,String customername,String addrs,String zipcode)
	{
	Session session=getSessionFactory().openSession();
	Contact con=new Contact();
	//con.setId(id);
	con.setCustomername(customername);
	con.setAddress(addrs);
	con.setZipcode(zipcode);
	session.save(con);
    session.close();
	
	}
}