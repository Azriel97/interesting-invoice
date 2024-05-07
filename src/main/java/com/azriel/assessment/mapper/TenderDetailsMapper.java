package com.azriel.assessment.mapper;

import com.azriel.assessment.model.InvoiceDataModel;
import com.azriel.assessment.persistence.entity.InvoiceData;
import org.mapstruct.Mapper;

@Mapper
public interface TenderDetailsMapper {

    InvoiceDataModel.TenderDetailsModel toModel(InvoiceData.TenderDetails tenderDetails);
}
