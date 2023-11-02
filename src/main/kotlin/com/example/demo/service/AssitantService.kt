package com.example.demo.service

import com.example.demo.model.Assistant
import com.example.demo.repository.AssistantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AssitantService {
    @Autowired
    lateinit var assitantRepo: AssistantRepository;

    fun getAll(): List<Assistant>{
        return assitantRepo.findAll()
    }

    fun post(assistant: Assistant): Assistant{
        return assitantRepo.save(assistant)
    }
}