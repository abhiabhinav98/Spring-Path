package com.selfspring.service;

import com.selfspring.model.Speaker;
import com.selfspring.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    //@Autowired
    public SpeakerServiceImpl(){ }

    //@Autowired
    public SpeakerServiceImpl(SpeakerRepository repositoryy){
        this.repository = repositoryy;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
