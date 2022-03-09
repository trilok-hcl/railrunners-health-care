package com.econsult.controller;

import com.econsult.model.ContactUs;
import com.econsult.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ContactUsController {
 @Autowired
    ContactUsRepository contactUsRepository;
    @PostMapping(value = "/contact")
    public void saveContactDetails(@RequestBody ContactUs contactUs){
        contactUsRepository.save(contactUs);
    }

    @GetMapping(value = "/contact")
    public List<ContactUs> getContactDetails(){
        return contactUsRepository.findAll();
    }

}
