package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
