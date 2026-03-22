package com.project.clms.controller;

import com.project.clms.model.LogEntry;
import com.project.clms.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LogController {

    @Autowired
    private LogService service;

    // Add a log via API
    @PostMapping("/logs")
    @ResponseBody
    public LogEntry addLog(@RequestBody LogEntry log) {
        return service.saveLog(log);
    }

    // REST APIs
    @GetMapping("/logs")
    @ResponseBody
    public List<LogEntry> getLogs() {
        return service.getAllLogs();
    }

    @GetMapping("/logs/severity/{level}")
    @ResponseBody
    public List<LogEntry> getBySeverity(@PathVariable String level) {
        return service.getBySeverity(level);
    }

    @GetMapping("/logs/search")
    @ResponseBody
    public List<LogEntry> search(@RequestParam String keyword) {
        return service.searchLogs(keyword);
    }

    // DASHBOARD PAGE
    @GetMapping("/dashboard")
    public String dashboard(@RequestParam(required = false) String keyword,
                            @RequestParam(required = false) String severity,
                            Model model) {

        List<LogEntry> logs;

        if (keyword != null && !keyword.isEmpty()) {
            logs = service.searchLogs(keyword);
        } else if (severity != null && !severity.isEmpty()) {
            logs = service.getBySeverity(severity);
        } else {
            logs = service.getAllLogs();
        }

        model.addAttribute("logs", logs);
        model.addAttribute("keyword", keyword);
        model.addAttribute("severity", severity);

        return "dashboard"; // Thymeleaf HTML
    }
}
