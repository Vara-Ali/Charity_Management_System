package business;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import business.CaseDescription;

public class StoreData {
	 public static void main(String[] args) {
	        // loads configuration and creates a session factory
	        Configuration con = new Configuration();
	        con.configure();
	        SessionFactory sf= con.buildSessionFactory();
	        Session session= sf.openSession();
	        Transaction trans= session.beginTransaction();

	        CaseDescription p=new CaseDescription();
	        p.setCaseID(0);
	        p.setTitle("Household Expenses");
	        p.setDesc("This case needs money for household expenses"); 
	        p.setTarget(10000);
	        p.setCaseID(1);
	        p.setTitle("Financial Aid");
	        p.setDesc("Mohammad Bakhsh needs money for meeting his children's daily expenses"); 
	        p.setTarget(4000);
	        
	        session.save(p);
	        
	        
	        trans.commit();
	 }

}


