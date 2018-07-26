package com.cg.ssm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ssm.beans.Session;

public interface ITrainingDAO extends JpaRepository<Session, Integer> {

}
