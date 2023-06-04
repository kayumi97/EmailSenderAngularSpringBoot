package com.arjuncodes.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/sendEmail")
    public void sendEmail(@RequestBody EmailForm emailForm) {
        emailSenderService.sendSimpleEmail(emailForm.getToEmail(), emailForm.getSubject(), emailForm.getBody());
    }
}

