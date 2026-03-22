package com.project.clms.service;

import com.project.clms.model.LogEntry;
import com.project.clms.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Autowired
    private LogRepository repo;

    public LogEntry saveLog(LogEntry log) {
        return repo.save(log);
    }

    public List<LogEntry> getAllLogs() {
        return repo.findAll();
    }

    public List<LogEntry> getBySeverity(String severity) {
        return repo.findBySeverity(severity);
    }

    public List<LogEntry> searchLogs(String keyword) {
        return repo.findByMessageContaining(keyword);
    }
}
