package com.matheusmaciel.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

    public @NotBlank String getOwnerRef() {
        return ownerRef;
    }

    public void setOwnerRef(@NotBlank String ownerRef) {
        this.ownerRef = ownerRef;
    }

    public @NotBlank @Email String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(@NotBlank @Email String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public @NotBlank @Email String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(@NotBlank @Email String emailTo) {
        this.emailTo = emailTo;
    }

    public @NotBlank String getSubject() {
        return subject;
    }

    public void setSubject(@NotBlank String subject) {
        this.subject = subject;
    }

    public @NotBlank String getText() {
        return text;
    }

    public void setText(@NotBlank String text) {
        this.text = text;
    }
}
