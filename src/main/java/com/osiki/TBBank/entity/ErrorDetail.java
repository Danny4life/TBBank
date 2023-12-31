package com.osiki.TBBank.entity;


import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail {
    private String message;
    private HttpStatus status;
    private String debugMessage;
    private String dateTime;
}
