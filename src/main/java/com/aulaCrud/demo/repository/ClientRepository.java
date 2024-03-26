package com.aulaCrud.demo.repository;

import com.aulaCrud.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
