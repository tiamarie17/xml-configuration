package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    //what code would look like without Spring
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){

    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
