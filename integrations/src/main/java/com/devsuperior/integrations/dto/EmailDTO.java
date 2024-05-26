package com.devsuperior.integrations.dto;

import java.io.Serializable;

public class EmailDTO implements Serializable {

    private String fromEMail;
    private String fromName;
    private String replyTo;
    private String to;
    private String subject;
    private String body;
    private String contentType;

    public EmailDTO() {
    }

    public EmailDTO(String fromEMail, String fromName, String replyTo,
                    String to, String subject, String body, String contentType
    ) {
        this.fromEMail = fromEMail;
        this.fromName = fromName;
        this.replyTo = replyTo;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.contentType = contentType;
    }

    public String getFromEMail() {
        return fromEMail;
    }

    public void setFromEMail(String fromEMail) {
        this.fromEMail = fromEMail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
