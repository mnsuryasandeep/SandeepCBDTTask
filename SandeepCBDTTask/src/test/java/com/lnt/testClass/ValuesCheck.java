package com.lnt.testClass;

import static org.junit.Assert.*;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import com.lnt.model.PersonalInfo;




public class ValuesCheck {
	  String message = "Hello World";	
	  

	   @Test
	   public void testXmlValues(){
		   try {  
			   
		        File file = new File("D:/t.xml");  
		        JAXBContext jaxbContext = JAXBContext.newInstance(PersonalInfo.class);  
		   
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        PersonalInfo personalInfo= (PersonalInfo) jaxbUnmarshaller.unmarshal(file);  
		      assertEquals("ABC", personalInfo.getName());
		      assertEquals("XYZ", personalInfo.getAddress());
		      assertEquals("CX39Z", personalInfo.getPan());
		      assertNotNull(personalInfo.getDob());
		      assertEquals(2016, personalInfo.getaYear());
		     assertTrue((personalInfo.getIncome()==25000.25));
		     assertTrue((personalInfo.getTds()==2.32));
		     assertTrue((personalInfo.getTaxDeducted()==1000.60));
		      
		      } catch (JAXBException e) {  
		        e.printStackTrace();  
		      }  
	      
	      }
//	      System.out.println("Id: "+employee.getId()+"\t"+"Name: "+employee.getName()+"\t"+"Salary: "+employee.getSalary()+"\t Designation: "+employee.getDesignation()+"\t Address: "+employee.getAddress());
}

