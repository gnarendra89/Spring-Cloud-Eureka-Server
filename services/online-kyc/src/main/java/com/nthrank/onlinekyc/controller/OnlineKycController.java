package com.nthrank.onlinekyc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineKycController {

    @GetMapping("/onlineKycData")
    public String getOnlineKYCData() {
        return "online KYC successful";
    }

}
