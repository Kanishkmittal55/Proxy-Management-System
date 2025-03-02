package com.proxybot.proxyBot.repository;

import com.proxybot.proxyBot.entity.ContainerLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContainerLogRepository extends JpaRepository<ContainerLog, Long> {

    // Example of a custom query method:
    List<ContainerLog> findByContainerId(String containerId);
    
    // Could add methods like findByLogLevel, etc. if needed.
}
