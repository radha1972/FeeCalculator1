package com.radha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@SuppressWarnings("unchecked")
public class TransactionDao1 {
	   public List<Transaction> getAllTransactions(){
		    List<Transaction>  transactionList = new ArrayList<Transaction>();
	      try {
	         File file = new File ("c:\\Users\\radha\\Exercise1.dat");
	        // Transaction  transaction = new Transaction( , ,	 ,  ,	,,	,	"Y");
	        
	         						
	         if (!file.exists()) {
	        	 Transaction  transaction =   new Transaction( "NAGEXTXN1","GS","ICICI", "HIGH","BUY",LocalDate.of(2013,11,21),101.9,true); 
		         Transaction  transaction1 =   new Transaction( "NAGEXTXN2","AS","REL", "Normal","SELL",LocalDate.of(2013,11,20),121.9,true); 
		        			 
	            
	            transactionList.add(transaction);
	            transactionList.add(transaction1);
	            saveTransactionList(transactionList);		
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	              
	            
	            transactionList = (List <Transaction>) ois.readObject();
	          // Object  obj = ois.readObject();  
	       
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }		
	      return transactionList;
	   }

	   private void saveTransactionList(List<Transaction> transactionList){
	      try {
	         File file = new File ("c:\\Users\\radha\\Exercise1.dat");
	         FileOutputStream fos;

	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);
	         oos.writeObject(transactionList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }   
	}