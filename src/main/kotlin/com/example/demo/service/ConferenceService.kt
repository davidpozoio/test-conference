package com.example.demo.service

import com.example.demo.model.Conference
import com.example.demo.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ConferenceService {
    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun getAll(): List<Conference>{
        return conferenceRepository.findAll();
    }

    fun post(conference: Conference): Conference{
        return conferenceRepository.save(conference)
    }
}