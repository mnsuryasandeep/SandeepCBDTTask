package com.lnt.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.model.PersonalInfo;
import com.lnt.utility.ObjectToXml;

@Controller
public class PersonalInfoController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	
	

	@RequestMapping(value = "/infoPage", method = RequestMethod.GET)
	public String itUser(@ModelAttribute("personalInfo") PersonalInfo personalInfo) {
		return "infoPage";
	}

	

	

	


	
	
	@RequestMapping(value = "/infoPage/xml", method = RequestMethod.POST)
	public String toXml( @ModelAttribute("personalInfo") @Valid PersonalInfo personalInfo, BindingResult result,Model model) {

		String data=new ObjectToXml().toXml(personalInfo);
		System.out.println("xml: "+ data);
		return "redirect:/infoPage";

	}
}
