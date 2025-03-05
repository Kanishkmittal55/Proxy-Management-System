package com.proxybot.proxyBot.service;

import com.proxybot.proxyBot.entity.Proxy;
import com.proxybot.proxyBot.repository.ProxyRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProxyManagementService {

    private final ProxyRepository proxyRepository;
    private final DockerIntegrationService dockerIntegrationService;

    public ProxyManagementService(ProxyRepository proxyRepository, DockerIntegrationService dockerIntegrationService) {
        this.dockerIntegrationService = dockerIntegrationService;
        this.proxyRepository = proxyRepository;
    }

    public Proxy createProxy(Proxy proxy) {
        // Possibly do a Docker createContainer call here:
        String containerId = dockerIntegrationService
                                 .createContainer("my-squid-image", 
                                                  proxy.getName(), 
                                                  3128);
        // Now start the container
        dockerIntegrationService.startContainer(containerId);

        // Set containerId in the Proxy entity
        proxy.setContainerId(containerId);
        proxy.setStatus("RUNNING");
        return proxyRepository.save(proxy);
    }

    public Optional<Proxy> findById(Long id) {
        return proxyRepository.findById(id);
    }

    public List<Proxy> findAll() {
        return proxyRepository.findAll();
    }

    public void removeProxy(Long proxyId) {
        // maybe do some checks before deleting
        proxyRepository.deleteById(proxyId);
    }

    // Additional business methods
}
