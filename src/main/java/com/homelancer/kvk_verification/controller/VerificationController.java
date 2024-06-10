package com.homelancer.kvk_verification.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verification")
public class VerificationController {

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void VerifyCompanyName(String companyName) {
        System.out.println("Company with company name:" + companyName + "is registered by KVK");

    }
}
