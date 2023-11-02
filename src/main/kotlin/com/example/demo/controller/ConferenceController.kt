package com.example.demo.controller

import com.example.demo.model.Conference
import com.example.demo.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/conferences")
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun getAll(): List<Conference>{
        return conferenceService.getAll();
    }

    @PostMapping
    fun post(@RequestBody conference: Conference): Conference{
        return conferenceService.post(conference)
    }
}