package com.azriel.assessment.mapper;

import com.azriel.assessment.model.InvoiceDataModel;
import com.azriel.assessment.persistence.entity.InvoiceData;
import org.mapstruct.Mapper;

@Mapper(uses = TenderDetailsMapper.class)
public interface InvoiceDataMapper {

    InvoiceDataModel toModel(InvoiceData invoiceData);
}
