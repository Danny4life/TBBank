package com.osiki.TBBank.service;

import com.osiki.TBBank.dto.BankResponse;
import com.osiki.TBBank.dto.CreditAndDebitRequest;
import com.osiki.TBBank.dto.EnquiryRequest;
import com.osiki.TBBank.dto.UserRequest;

public interface UserService {

    BankResponse createUserAccount(UserRequest request);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditAndDebitRequest request);

    BankResponse debitAccount(CreditAndDebitRequest request);
}
