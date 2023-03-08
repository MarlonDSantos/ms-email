package com.example.ms.msemail.controllers;

import com.example.ms.msemail.dtos.EmailDto;
import com.example.ms.msemail.models.EmailModel;
import com.example.ms.msemail.services.EmailService;
import jakarta.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){

        EmailModel emailModel = new EmailModel();

        BeanUtils.copyProperties(emailDto, emailModel);

        emailService.sendEmail(emailModel);

        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
//    https://aws.amazon.com/pt/ses/
    // Se for usar email amazon tem incluilo em aplication.properties


}
