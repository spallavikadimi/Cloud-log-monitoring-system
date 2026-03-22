package com.project.clms.simulator;

import com.project.clms.model.LogEntry;
import com.project.clms.service.LogService;
import com.project.clms.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class LogGenerator {

    @Autowired
    private LogService service;

    @Autowired
    private EmailService emailService;

    private Random random = new Random();

    @Scheduled(fixedRate = 3000)
    public void generateLogs() {
        LogEntry log = new LogEntry();

        log.setTimestamp(LocalDateTime.now().toString());
        log.setSource("Server-1");

        String[] levels = {"INFO", "WARNING", "ERROR"};
        String severity = levels[random.nextInt(levels.length)];

        log.setSeverity(severity);
        log.setMessage("Log generated: " + severity);

        if (severity.equals("ERROR")) {
            System.out.println("🚨 ALERT: ERROR detected!");
            emailService.sendAlert("Error occurred at " + LocalDateTime.now());
        }

        service.saveLog(log);
    }
}
