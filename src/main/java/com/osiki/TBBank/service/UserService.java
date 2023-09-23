package com.osiki.TBBank.service;

import com.osiki.TBBank.dto.BankResponse;
import com.osiki.TBBank.dto.UserRequest;

public interface UserService {

    BankResponse createUserAccount(UserRequest userRequest);
}
