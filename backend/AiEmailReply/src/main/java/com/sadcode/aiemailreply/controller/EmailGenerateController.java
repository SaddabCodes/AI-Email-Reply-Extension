package com.sadcode.aiemailreply.controller;

import com.sadcode.aiemailreply.entity.EmailRequest;
import com.sadcode.aiemailreply.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGenerateController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGeneratorService.generateEmailReplay(emailRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
