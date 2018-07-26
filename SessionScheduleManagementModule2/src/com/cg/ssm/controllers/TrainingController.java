package com.cg.ssm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ssm.beans.Session;
import com.cg.ssm.services.ITrainingService;

@Controller
public class TrainingController {

	@Autowired
	private ITrainingService trainingServices;

	@RequestMapping("/viewSessions")
	public ModelAndView viewSessions(@ModelAttribute("session")Session session) {

		List<Session> sessionList = trainingServices.getSessions();

		return new ModelAndView("ScheduledSessions","session",sessionList);
	}

	@RequestMapping("/enroll")
	public ModelAndView enrollSession(@ModelAttribute("session")Session session){
		session = trainingServices.getSession(session);
		return new ModelAndView("Success","session",session);
	}





}
