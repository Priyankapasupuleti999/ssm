package com.cg.ssm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.ssm.beans.Session;

@Controller
public class URIController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "indexPage";
	}
	
	@ModelAttribute("session")
	public Session getSession() {
		return new Session();
	}

}
