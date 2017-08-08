package com.radha;
import java.util.ArrayList;

import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;



public class DomParserDemo 
 {
	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		
		 //Get the DOM Builder Factory
		
		    DocumentBuilderFactory factory =
		
		        DocumentBuilderFactory.newInstance();
		
		 
		
		    //Get the DOM Builder
		
		    DocumentBuilder builder = factory.newDocumentBuilder();
		
		 
		
		    //Load and Parse the XML document
		
		    //document contains the complete XML as a Tree.
		
		    File xmlFile = new File("C:\\Users\\radha\\workspace\\Examples\\src\\com\\radha\\Employee.xml");
		      Document document = (Document) builder.parse(xmlFile);
		
		 
		
		    List<Employee> empList = new ArrayList<>();
		
		 
		
		    //Iterating through the nodes and extracting the data.
		
		    NodeList nodeList = document.getDocumentElement().getChildNodes();
		
		 
		
		    for (int i = 0; i < nodeList.getLength(); i++) {
		
		 
		
		      //We have encountered an <employee> tag.
		
		      Node node = nodeList.item(i);
		
		      if (node instanceof Element) {
		
		        Employee emp = new Employee();
		
		        emp.id = node.getAttributes().
		
		            getNamedItem("id").getNodeValue();
		
		 
		
		        NodeList childNodes = node.getChildNodes();
		
		        for (int j = 0; j < childNodes.getLength(); j++) {
		
		          Node cNode = childNodes.item(j);
		
		 
		
		          //Identifying the child tag of employee encountered.
		
		          if (cNode instanceof Element) {
		
		            String content = cNode.getLastChild().
		
		                getTextContent().trim();
		
		            switch (cNode.getNodeName()) {
		
		              case "firstName":
		
		                emp.firstName = content;
		
		                break;
		
		              case "lastName":
		
		                emp.lastName = content;
		
		                break;
		
		              case "location":
		
		                emp.location = content;
		
		                break;
		
		            }
		
		          }
		
		        }
		
		        empList.add(emp);
		
		      }
		
		 
		
		    }
		
		 
		
		    //Printing the Employee list populated.
		
		    for (Employee emp : empList) {
		
		      System.out.println(emp);
		
		    }
		
		 
		
		  }
		
		}
		
		 
		
		class Employee{
		
		  String id;
		
		  String firstName;
		
		  String lastName;
		
		  String location;
		
		 
		
		  @Override
		
		  public String toString() {
		
		    return firstName+" "+lastName+"("+id+")"+location;
		
		  }
		
		}


	


