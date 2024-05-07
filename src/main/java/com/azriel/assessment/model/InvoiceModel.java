package com.azriel.assessment.model;

import lombok.Data;

@Data
public class InvoiceModel {

    private Long invoiceId;
    private Long customerId;
    private InvoiceDataModel invoiceData;
}
