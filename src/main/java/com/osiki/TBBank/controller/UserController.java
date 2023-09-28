package com.osiki.TBBank.controller;

import com.osiki.TBBank.dto.BankResponse;
import com.osiki.TBBank.dto.CreditAndDebitRequest;
import com.osiki.TBBank.dto.EnquiryRequest;
import com.osiki.TBBank.dto.UserRequest;
import com.osiki.TBBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createUserAccount(userRequest);
    }

    @GetMapping("/balance-enquiry")

    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return  userService.balanceEnquiry(request);
    }

    @GetMapping("/name-enquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @PostMapping("/credit-account")
    public BankResponse creditAccount(@RequestBody CreditAndDebitRequest request){
        return userService.creditAccount(request);
    }
}
