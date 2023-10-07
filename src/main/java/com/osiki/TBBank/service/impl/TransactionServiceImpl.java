package com.osiki.TBBank.service.impl;

import com.osiki.TBBank.entity.Transaction;
import com.osiki.TBBank.repository.TransactionRepository;
import com.osiki.TBBank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(Transaction transaction) {

    }
}
