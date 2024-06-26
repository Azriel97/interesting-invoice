package com.azriel.assessment.persistence.repository;

import com.azriel.assessment.persistence.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

    List<InvoiceEntity> findAllByCustomerId(Long customerId);
}
