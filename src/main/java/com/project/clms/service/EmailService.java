package com.project.clms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendAlert(String message) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("clmsminisplunk@gmail.com");
        mail.setSubject("🚨 ERROR ALERT - CLMS");
        mail.setText(message);

        mailSender.send(mail);
    }
}
