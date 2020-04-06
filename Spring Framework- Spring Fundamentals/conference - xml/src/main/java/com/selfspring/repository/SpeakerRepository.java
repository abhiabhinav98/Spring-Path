package com.selfspring.repository;

import com.selfspring.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
