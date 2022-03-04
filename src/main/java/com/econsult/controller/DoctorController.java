package com.econsult.controller;

import com.econsult.model.Consultation;
import com.econsult.model.Doctor;
import com.econsult.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

//    @DeleteMapping(value = "/doctor")
//    public void delete(@RequestBody String doctorId){
//        doctorRepository.deleteById(doctorId);
//    }

    @DeleteMapping(value = "/doctor")
    public void deleteAll(){
        doctorRepository.deleteAll();
    }


}
