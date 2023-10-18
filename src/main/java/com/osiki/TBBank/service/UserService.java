package com.osiki.TBBank.service;

import com.osiki.TBBank.dto.*;

public interface UserService {

    BankResponse createUserAccount(UserRequest request);

    BankResponse login(LoginDto loginDto);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditAndDebitRequest request);

    BankResponse debitAccount(CreditAndDebitRequest request);

    BankResponse transfer(TransferRequest request);

}
