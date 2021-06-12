package com.nthrank.restappservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestAppController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/rest.offlineData")
    public String getOfflineKYCData() {
        String url = "http://Offline-KYC-Service/offlineKycData";
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/rest.onlineData")
    public String getOnlineKYCData() {
        String url = "http://Online-KYC-Service/onlineKycData";
        return restTemplate.getForObject(url, String.class);
    }
}
