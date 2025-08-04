package com.Argela.repository;

import com.Argela.entities.Cdr;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CdrRepository extends JpaRepository<Cdr, Long> {
    List<Cdr> findByaNumber(String aNumber);
}