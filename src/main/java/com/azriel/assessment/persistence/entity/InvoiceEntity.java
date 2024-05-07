package com.azriel.assessment.persistence.entity;

import com.azriel.assessment.converter.InvoiceDataAttributeConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "invoice")
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private Long invoiceId;
    @Column(name = "customer_id")
    private Long customerId;
    @Convert(converter = InvoiceDataAttributeConverter.class)
    @Column(name = "invoice_data")
    private InvoiceData invoiceData;
}
