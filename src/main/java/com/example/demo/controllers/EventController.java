package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.event.Event;
import com.example.demo.domain.event.EventRequestDTO;
import com.example.demo.services.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody EventRequestDTO eventRequestDTO) {
        Event event = eventService.createEvent(eventRequestDTO);
        return new ResponseEntity<Event>(event, HttpStatus.CREATED);
    }
}
