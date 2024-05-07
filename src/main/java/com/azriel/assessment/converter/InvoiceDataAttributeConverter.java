package com.azriel.assessment.converter;

import com.azriel.assessment.persistence.entity.InvoiceData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Converter
public class InvoiceDataAttributeConverter implements AttributeConverter<InvoiceData, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String convertToDatabaseColumn(InvoiceData invoiceData) {
        try {
            return objectMapper.writeValueAsString(invoiceData);
        } catch (JsonProcessingException e) {
            log.error("Failed to convert InvoiceData to JSON");
            throw new RuntimeException(e);
        }
    }

    @Override
    public InvoiceData convertToEntityAttribute(String s) {
        try {
            return objectMapper.readValue(s, InvoiceData.class);
        } catch (JsonProcessingException e) {
            log.error("Failed to convert JSON to InvoiceData");
            throw new RuntimeException(e);
        }
    }
}
