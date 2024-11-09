package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.domain.event.Event;
import com.example.demo.domain.event.EventRequestDTO;
import com.example.demo.repositories.EventRepository;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(EventRequestDTO eventRequestDTO){
        Event event = eventRepository.save(eventRequestDTO);
        return event;
    }
}
