package com.project.clms.controller;

import com.project.clms.model.LogEntry;
import com.project.clms.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LogController {

    @Autowired
    private LogService service;

    // ✅ HOME PAGE
    @GetMapping("/")
    public String home() {
        return "dashboard";
    }

    // ✅ API - GET ALL LOGS
    @GetMapping("/logs")
    @ResponseBody
    public List<LogEntry> getLogs() {
        return service.getAllLogs();
    }

    // ✅ API - ADD LOG
    @PostMapping("/logs")
    @ResponseBody
    public LogEntry addLog(@RequestBody LogEntry log) {
        return service.saveLog(log);
    }

    // ✅ API - FILTER BY SEVERITY
    @GetMapping("/logs/severity/{level}")
    @ResponseBody
    public List<LogEntry> getBySeverity(@PathVariable String level) {
        return service.getBySeverity(level);
    }

    // ✅ API - SEARCH
    @GetMapping("/logs/search")
    @ResponseBody
    public List<LogEntry> search(@RequestParam String keyword) {
        return service.searchLogs(keyword);
    }
}
