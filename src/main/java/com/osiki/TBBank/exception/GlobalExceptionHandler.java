package com.osiki.TBBank.exception;

import com.osiki.TBBank.dto.BankResponse;
import com.osiki.TBBank.entity.ErrorDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(EmailNotSendException.class)
    public ResponseEntity<BankResponse<ErrorDetail>>handleEmailNotSendException(final EmailNotSendException ex){
        ErrorDetail errorDetail = ErrorDetail.builder()
                .message(ex.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .debugMessage("Email not sent")
                .build();


        BankResponse<ErrorDetail> response = new BankResponse<>(ex.getMessage(), errorDetail);

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
