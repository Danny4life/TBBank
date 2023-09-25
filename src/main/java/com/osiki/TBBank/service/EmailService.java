package com.osiki.TBBank.service;

import com.osiki.TBBank.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
