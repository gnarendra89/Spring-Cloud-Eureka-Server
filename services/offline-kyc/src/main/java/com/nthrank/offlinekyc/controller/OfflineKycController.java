package com.nthrank.offlinekyc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfflineKycController {

    @GetMapping("/offlineKycData")
    public String getOfflineKYCData() {
        return "offline KYC successful";
    }

}
