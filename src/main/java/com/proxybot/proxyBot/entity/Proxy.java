package com.proxybot.proxyBot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proxy")
public class Proxy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String containerId;
    private String externalIp;
    private String location;
    private String status;

    // Constructors
    public Proxy() {
    }

    public Proxy(String name, String containerId, String externalIp, String location, String status) {
        this.name = name;
        this.containerId = containerId;
        this.externalIp = externalIp;
        this.location = location;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContainerId() { return containerId; }
    public void setContainerId(String containerId) { this.containerId = containerId; }

    public String getExternalIp() { return externalIp; }
    public void setExternalIp(String externalIp) { this.externalIp = externalIp; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
