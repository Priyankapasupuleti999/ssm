package com.cg.ssm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.ssm.beans.Session;
import com.cg.ssm.dao.ITrainingDAO;

@Component(value="trainingServices")
public class TrainingServiceImpl implements ITrainingService{

	@Autowired
	private ITrainingDAO trainingDAO;

	@Override
	public List<Session> getSessions() {
		List<Session> sessionList = trainingDAO.findAll();
		return sessionList;
	}

	@Override
	public Session getSession(Session session) {
		session = trainingDAO.findOne(session.getId());
		return session;
	}

}
