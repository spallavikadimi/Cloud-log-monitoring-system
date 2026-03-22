package com.project.clms.repository;

import com.project.clms.model.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<LogEntry, Long> {

    List<LogEntry> findBySeverity(String severity);

    List<LogEntry> findByMessageContaining(String keyword);
}
