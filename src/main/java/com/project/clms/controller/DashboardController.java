package com.project.clms.controller;

import com.project.clms.model.LogEntry;
import com.project.clms.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private LogService service;

    @GetMapping("/home")
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
        return "dashboard";
    }

}
