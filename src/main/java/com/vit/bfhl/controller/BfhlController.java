package com.vit.bfhl.controller;

import com.vit.bfhl.model.DataRequest;
import com.vit.bfhl.model.DataResponse;
import com.vit.bfhl.service.BfhlService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BfhlController {

    private final BfhlService service = new BfhlService();

    @Value("${bfhl.full-name:john_doe}")
    private String fullName;

    @Value("${bfhl.dob-ddmmyyyy:17091999}")
    private String dob;

    @Value("${bfhl.email:john@xyz.com}")
    private String email;

    @Value("${bfhl.roll-number:ABCD123}")
    private String rollNumber;

    @PostMapping("/bfhl")
    public ResponseEntity<DataResponse> process(@Valid @RequestBody DataRequest request) {
        DataResponse res = service.process(request, fullName, dob, email, rollNumber);
        return ResponseEntity.ok(res);
    }
}