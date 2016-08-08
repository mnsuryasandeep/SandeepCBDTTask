package com.lnt.utility;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.lnt.model.PersonalInfo;



public class ObjectToXml {
	StringWriter sw;
	public String toXml(PersonalInfo personalInfo) {
		try {
			sw = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(PersonalInfo.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File f = new File("D:/t.xml");
			m.marshal(personalInfo, f);
			m.marshal(personalInfo, sw);
			System.out.println("Success: " + f.getAbsolutePath());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();
	}

}
