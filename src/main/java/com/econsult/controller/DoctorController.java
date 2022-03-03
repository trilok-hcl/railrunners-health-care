package com.econsult.controller;

import com.econsult.model.Consultation;
import com.econsult.model.Doctor;
import com.econsult.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping(value = "/doctor")
    public List<Doctor> getConsultation() {
        return doctorRepository.findAll();
    }

    @PostMapping(value = "/doctor")
    public void save(@RequestBody Doctor doctor){
        doctorRepository.save(doctor);
    }


}
