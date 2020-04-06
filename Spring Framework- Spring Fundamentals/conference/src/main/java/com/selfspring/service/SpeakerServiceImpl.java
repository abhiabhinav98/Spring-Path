package com.selfspring.service;

import com.selfspring.model.Speaker;
import com.selfspring.repository.HibernateSpeakerRepositoryImpl;
import com.selfspring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){

        return repository.findAll();

    }

}
