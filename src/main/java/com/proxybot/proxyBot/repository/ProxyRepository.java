package com.proxybot.proxyBot.repository;

import com.proxybot.proxyBot.entity.Proxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface ProxyRepository extends JpaRepository<Proxy, Long> {

    // Optional custom finder methods if desired. For example:
    List<Proxy> findByName(String name);          // find all proxies with a given name
    Optional<Proxy> findById(Long id);            // already provided by JpaRepository, but okay to list
    void deleteById(Long id);                     // also included by default

    // Feel free to add more based on your needs.
}
