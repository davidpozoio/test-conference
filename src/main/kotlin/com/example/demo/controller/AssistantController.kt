package com.example.demo.controller

import com.example.demo.model.Assistant
import com.example.demo.service.AssitantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/assistans")
class AssistantController {
    @Autowired
    lateinit var assitantService: AssitantService

    @GetMapping
    fun getAll(): List<Assistant>{
        return assitantService.getAll();
    }

    @PostMapping
    fun post(@RequestBody assistant: Assistant): Assistant{
        return assitantService.post(assistant)
    }
}