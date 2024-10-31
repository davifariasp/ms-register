package com.ms.email.dtos;

import com.ms.email.models.EmailModel;

import java.util.UUID;

public record EmailRecordDto(
        UUID userId,
        String emailTo,
        String subject,
        String text
) {

    public EmailModel toEntity(){
        var emailModel = new EmailModel();

        emailModel.setUserId(this.userId());
        emailModel.setEmailTo(this.emailTo());
        emailModel.setSubject(this.subject());
        emailModel.setText(this.text());

        return emailModel;
    }
}
