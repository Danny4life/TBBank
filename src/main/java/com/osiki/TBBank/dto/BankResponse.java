package com.osiki.TBBank.dto;

import com.osiki.TBBank.entity.ErrorDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Data
@RestControllerAdvice
@Builder
@NoArgsConstructor
public class BankResponse<T> {

    @Schema(
            name = "Response Code"
    )
    private  String responseCode;
    @Schema(
            name = "Response Message"
    )
    private String responseMessage;

    @Schema(
            name = "Account Information"
    )
    private AccountInfo accountInfo;

    public BankResponse(String message) {
        this.responseMessage = message;
    }

    public BankResponse(String responseCode, String responseMessage, AccountInfo accountInfo) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.accountInfo = accountInfo;
    }

    public BankResponse(String message, ErrorDetail errorDetail) {
        this.responseMessage = message;
    }



    //private T responseData;
}
