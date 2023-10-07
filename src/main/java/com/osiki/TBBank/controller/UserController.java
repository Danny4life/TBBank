package com.osiki.TBBank.controller;

import com.osiki.TBBank.dto.*;
import com.osiki.TBBank.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    private UserService userService;
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID "
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"

    )

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createUserAccount(userRequest);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Check Balance Enquiry"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"

    )

    @GetMapping("/balance-enquiry")

    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return  userService.balanceEnquiry(request);
    }

    @Operation(
            summary = "Name Enquiry",
            description = "Check Name Enquiry"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 201 OK"

    )

    @GetMapping("/name-enquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @Operation(
            summary = "Crediting A User Account",
            description = "Sending funds to an account"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"

    )

    @PostMapping("/credit-account")
    public BankResponse creditAccount(@RequestBody CreditAndDebitRequest request){
        return userService.creditAccount(request);
    }

    @Operation(
            summary = "Debiting a User Account",
            description = "Debiting a user account"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"

    )

    @PostMapping("/debit-account")
    public BankResponse debitAccount(@RequestBody CreditAndDebitRequest request){
        return userService.debitAccount(request);
    }

    @Operation(
            summary = "Transfer Funds to a User Account",
            description = "Transfer operation between two accounts"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"

    )

    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);
    }
}
