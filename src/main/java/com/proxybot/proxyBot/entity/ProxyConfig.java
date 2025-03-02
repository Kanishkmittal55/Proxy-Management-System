package com.proxybot.proxyBot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proxy_config")
public class ProxyConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private int port;
    private boolean userAuthRequired;
    private String credentials;

    public ProxyConfig() {
    }

    public ProxyConfig(String location, int port, boolean userAuthRequired, String credentials) {
        this.location = location;
        this.port = port;
        this.userAuthRequired = userAuthRequired;
        this.credentials = credentials;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }

    public boolean isUserAuthRequired() { return userAuthRequired; }
    public void setUserAuthRequired(boolean userAuthRequired) { this.userAuthRequired = userAuthRequired; }

    public String getCredentials() { return credentials; }
    public void setCredentials(String credentials) { this.credentials = credentials; }
}
