/*
 * @(#)LandMarkRepository.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.dao;

import com.project.Smartparking_landmarks.model.LandMark;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * LandMarkRepository is an interface and extend from MongoRepository which contains all the CRUD methods.
 * @author Deepthi N
 * @version 1.0
 */

@Repository
public interface LandMarkRepository extends MongoRepository<LandMark, String> {
}
