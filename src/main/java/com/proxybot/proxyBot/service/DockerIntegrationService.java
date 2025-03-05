package com.proxybot.proxyBot.service;

import org.springframework.stereotype.Service;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.api.model.ExposedPort;
// or other relevant imports from docker-java

@Service
public class DockerIntegrationService {

    private final DockerClient dockerClient;

    public DockerIntegrationService() {
        // set up the Docker client pointing to your local daemon
        this.dockerClient = DockerClientBuilder.getInstance("unix:///var/run/docker.sock").build();
        // For Windows, it might be tcp://localhost:2375 or another address
    }

    public String createContainer(String imageName, String containerName, int port) {
        // e.g. pull image if not present, create container
        var createResponse = dockerClient.createContainerCmd(imageName)
                    .withName(containerName)
                    .withExposedPorts(ExposedPort.tcp(port))
                    .exec();
        return createResponse.getId();
    }

    public void startContainer(String containerId) {
        dockerClient.startContainerCmd(containerId).exec();
    }

    public void stopContainer(String containerId) {
        dockerClient.stopContainerCmd(containerId).exec();
    }

    public void removeContainer(String containerId) {
        dockerClient.removeContainerCmd(containerId).exec();
    }

    // etc. for collecting logs, stats, etc.
}
