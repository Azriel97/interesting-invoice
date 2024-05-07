package com.azriel.assessment.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvoiceDataModel {

    private String time;
    private TenderDetailsModel tenderDetails;
    private String storeNumber;

    @Data
    public static class TenderDetailsModel {

        private BigDecimal amount;
        private String type;
    }
}
