package com.example.ms.msemail.repositories;

import com.example.ms.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>  {
}
