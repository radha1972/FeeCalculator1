package com.radha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.radha.Transaction;

@Path("/TransactionService")
public class TransactionService {

   TransactionDao1 transactionDao = new TransactionDao1();

   @GET
   @Path("/download")
   @Produces(MediaType.APPLICATION_OCTET_STREAM)
   public Response downloadFileWithGet( @DefaultValue("Sample") @QueryParam("file") String file) throws FileNotFoundException,IOException {
	   String path = System.getProperty("user.home") + File.separator + "uploads";
       File fileDownload = new File(path + File.separator + file);
       FileOutputStream fos = new FileOutputStream(fileDownload);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       String str= "ClientId    TransactionType   TransactionDate Priority   Processing Fee";
    	       
       int Processingfee =0;
       List<Transaction>  transactionList = transactionDao.getAllTransactions();
       for (Transaction trans :transactionList)
       {    if (trans.getPriority().equals("HIGH"))
    	   { Processingfee=500;}
       if ((trans.getPriority().equals("Normal")) &&(trans.TransactionType.equals("Sell")) && ( trans.TransactionType.equals("withdraw")))
	   {Processingfee=100; }
       if ((trans.getPriority().equals("Normal")) &&(trans.TransactionType.equals("Sell")) && ( trans.TransactionType.equals("withdraw")))
	   { Processingfee=50;}
       
       str= str +trans.getExternalTransactionId() + trans.getTransactionType()  +trans.getPriority()+Processingfee;
      
       }
       oos.writeObject(str);
       oos.close();
       
       ResponseBuilder response = Response.ok((Object) fileDownload);
       response.header("Content-Disposition", "attachment;filename=" + file);
       return response.build();
   }
}