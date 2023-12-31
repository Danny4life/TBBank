package com.osiki.TBBank.service.impl;

import com.osiki.TBBank.dto.TransactionDto;
import com.osiki.TBBank.entity.Transaction;
import com.osiki.TBBank.repository.TransactionRepository;
import com.osiki.TBBank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);

        System.out.println("Transaction saved successfully");

    }
}
