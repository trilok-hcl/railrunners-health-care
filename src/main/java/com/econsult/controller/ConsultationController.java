package com.econsult.controller;

import com.econsult.model.Consultation;
import com.econsult.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class ConsultationController {
    @Autowired
    ConsultationRepository consultationRepository;
    @PostMapping(value = "/consult")
    public void save(@RequestBody Consultation consultation){
        consultationRepository.save(consultation);
    }

    @GetMapping(value = "/consult")
    public List<Consultation> getConsultation() {
        return consultationRepository.findAll();
    }

    @GetMapping(value = "/consult/{id}")
    public Consultation getConsultationById(@PathVariable String id){
        Optional<Consultation> consultation = consultationRepository.findById(id);
        return consultation.get();
    }
}
