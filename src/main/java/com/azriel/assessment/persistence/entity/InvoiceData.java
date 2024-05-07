package com.azriel.assessment.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceData {

    private String time;
    private TenderDetails tenderDetails;
    private String storeNumber;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TenderDetails {

        private BigDecimal amount;
        private String type;
    }
}
