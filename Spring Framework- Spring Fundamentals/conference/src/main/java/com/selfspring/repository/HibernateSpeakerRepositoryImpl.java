package com.selfspring.repository;

import com.selfspring.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Abhinav");
        speaker.setLastName("Gupta");

        speakers.add(speaker);

        return speakers;
    }

}