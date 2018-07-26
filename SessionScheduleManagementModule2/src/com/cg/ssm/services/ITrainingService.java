package com.cg.ssm.services;

import java.util.List;

import com.cg.ssm.beans.Session;

public interface ITrainingService {

	public List<Session> getSessions();

	public Session getSession(Session session);

}
