package com.osiki.TBBank.service;

import com.osiki.TBBank.dto.TransactionDto;
import com.osiki.TBBank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
