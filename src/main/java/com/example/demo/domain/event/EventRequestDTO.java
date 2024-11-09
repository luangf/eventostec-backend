package com.example.demo.domain.event;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Date date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
