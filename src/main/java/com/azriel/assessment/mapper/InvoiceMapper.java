package com.azriel.assessment.mapper;

import com.azriel.assessment.model.InvoiceModel;
import com.azriel.assessment.persistence.entity.InvoiceEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = InvoiceMapper.class)
public interface InvoiceMapper {

    List<InvoiceModel> toModels(List<InvoiceEntity> customerEntity);
}
