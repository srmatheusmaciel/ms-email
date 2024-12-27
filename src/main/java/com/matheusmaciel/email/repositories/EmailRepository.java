package com.matheusmaciel.email.repositories;

import com.matheusmaciel.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
