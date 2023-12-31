package com.osiki.TBBank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String otherName;

    private String gender;
    private String address;
    private String stateOfOrigin;
    private String phoneNumber;

    private String alternativeNumber;

    private String email;
    private String password;


}
